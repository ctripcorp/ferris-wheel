package com.ctrip.ferriswheel.core.asset;

import com.ctrip.ferriswheel.core.intf.AssetManager;
import com.ctrip.ferriswheel.core.intf.NamedAsset;

public class Attachment extends NamedAssetNode implements NamedAsset {
    private String contentType;
    private byte[] content;

    protected Attachment(String name, AssetManager assetManager) {
        super(name, assetManager);
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
