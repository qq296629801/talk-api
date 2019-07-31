package cn.ymsys.api.common.util;


public class FieldAttribute implements IRichModel, Comparable<FieldAttribute> {

    private String name;
    private String type; //platform data type

    public FieldAttribute() {
    }


    @Override
    public void clear() {
        name = null;
        type = null;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (!(that instanceof FieldAttribute)) {
            return false;
        }

        FieldAttribute other = (FieldAttribute) that;
        return this.name.equals(other.name) ? this.type.equals(other.type) : false;
    }

    @Override
    public int compareTo(FieldAttribute o) {
        return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
