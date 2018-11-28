import { VariantType } from "./Variant";
import UnionValue from "./UnionValue";

class StrValue extends UnionValue {
    public string: string;

    constructor(string: string, formula?: string) {
        super(formula);
        this.string = string;
    }

    public valueType() {
        return VariantType.STRING;
    }

    public strValue() {
        return this.string;
    }
}

export default StrValue;
