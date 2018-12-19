package com.ctrip.ferriswheel.core.asset;

import com.ctrip.ferriswheel.core.util.SparseArray;

import java.util.Iterator;
import java.util.Map;

class SparseAssetArray<E extends AssetNode> implements Iterable<E> {
    private final AssetNode owner;
    private SparseArray<E> sparseArray = new SparseArray<>();

    SparseAssetArray(AssetNode owner) {
        this.owner = owner;
    }

    public int size() {
        return sparseArray.size();
    }

    public boolean isEmpty() {
        return sparseArray.isEmpty();
    }

    public E get(int index) {
        return sparseArray.get(index);
    }

    public E set(int index, E element) {
        E previous = sparseArray.set(index, element);
        owner.bindChild(element);
        if (previous != null) {
            owner.unbindChild(previous);
        }
        return previous;
    }

    public E remove(int index) {
        E element = sparseArray.remove(index);
        if (element != null) {
            owner.unbindChild(element);
        }
        return element;
    }

    public E move(int from, int to) {
        E element = sparseArray.remove(from);
        if (element == null) {
            return remove(to);
        } else {
            E previous = sparseArray.set(to, element);
            if (previous != null) {
                owner.unbindChild(previous);
            }
            return previous;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new SafeIterator(sparseArray.iterator());
    }

    public Iterator<E> iterator(Integer start, Integer end) {
        return new SafeIterator(sparseArray.iterator(start, end));
    }

    class SafeIterator implements Iterator<E> {
        private final Iterator<Map.Entry<Integer, E>> delegate;
        private Map.Entry<Integer, E> current;

        SafeIterator(Iterator<Map.Entry<Integer, E>> delegate) {
            this.delegate = delegate;
        }

        @Override
        public boolean hasNext() {
            return delegate.hasNext();
        }

        @Override
        public E next() {
            current = delegate.next();
            return current == null ? null : current.getValue();
        }

        @Override
        public void remove() {
            delegate.remove();
            if (current != null && current.getValue() != null) {
                SparseAssetArray.this.owner.unbindChild(current.getValue());
            }
        }
    }
}