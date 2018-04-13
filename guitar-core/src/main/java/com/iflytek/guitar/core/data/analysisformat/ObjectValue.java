/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.iflytek.guitar.core.data.analysisformat;

import java.io.IOException;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ObjectValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ObjectValue\",\"namespace\":\"com.iflytek.guitar.core.data.analysisformat\",\"fields\":[{\"name\":\"value\",\"type\":[\"long\",\"double\",\"string\",\"int\",\"null\"]}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    public Object value;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use {@link \#newBuilder()}.
     */
    public ObjectValue() {
    }

    /**
     * All-args constructor.
     */
    public ObjectValue(Object value) {
        this.value = value;
    }

    @Override
    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    @Override
    public Object get(int field$) {
        switch (field$) {
            case 0:
                return value;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @Override
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0:
                value = (Object) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'value' field.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the 'value' field.
     * @param value the value to set.
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /** Creates a new ObjectValue RecordBuilder */
    public static ObjectValue.Builder newBuilder() {
        return new ObjectValue.Builder();
    }

    /** Creates a new ObjectValue RecordBuilder by copying an existing Builder */
    public static ObjectValue.Builder newBuilder(ObjectValue.Builder other) {
        return new ObjectValue.Builder(other);
    }

    /** Creates a new ObjectValue RecordBuilder by copying an existing ObjectValue instance */
    public static ObjectValue.Builder newBuilder(ObjectValue other) {
        return new ObjectValue.Builder(other);
    }

    /**
     * RecordBuilder for ObjectValue instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ObjectValue>
            implements org.apache.avro.data.RecordBuilder<ObjectValue> {

        private Object value;

        /** Creates a new Builder */
        private Builder() {
            super(ObjectValue.SCHEMA$);
        }

        /** Creates a Builder by copying an existing Builder */
        private Builder(ObjectValue.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.value)) {
                this.value = data().deepCopy(fields()[0].schema(), other.value);
                fieldSetFlags()[0] = true;
            }
        }

        /** Creates a Builder by copying an existing ObjectValue instance */
        private Builder(ObjectValue other) {
            super(ObjectValue.SCHEMA$);
            if (isValidValue(fields()[0], other.value)) {
                this.value = data().deepCopy(fields()[0].schema(), other.value);
                fieldSetFlags()[0] = true;
            }
        }

        /** Gets the value of the 'value' field */
        public Object getValue() {
            return value;
        }

        /** Sets the value of the 'value' field */
        public ObjectValue.Builder setValue(Object value) {
            validate(fields()[0], value);
            this.value = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /** Checks whether the 'value' field has been set */
        public boolean hasValue() {
            return fieldSetFlags()[0];
        }

        /** Clears the value of the 'value' field */
        public ObjectValue.Builder clearValue() {
            value = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        @Override
        public ObjectValue build() {
            try {
                ObjectValue record = new ObjectValue();
                record.value = fieldSetFlags()[0] ? this.value : (Object) defaultValue(fields()[0]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }


    public Object add(Object data) throws IOException {
        if (data instanceof Double) {
            value = (Double) value + (Double) data;
        } else if (data instanceof Long) {
            value = (Long) value + (Long) data;
        } else if (data instanceof Integer) {
            value = (Integer) value + (Integer) data;
        } else {
            throw new IOException("the operator + is inappropriate for this type [" + data.getClass().getName() + "]");
        }
        return value;
    }

    public Object minus(Object data) throws IOException {
        if (data instanceof Double) {
            value = (Double) value - (Double) data;
        } else if (data instanceof Long) {
            value = (Long) value - (Long) data;
        } else if (data instanceof Integer) {
            value = (Integer) value - (Integer) data;
        } else {
            throw new IOException("the operator - is inappropriate for this type [" + data.getClass().getName() + "]");
        }
        return value;
    }

    public Object add(Object data1, Object data2) throws IOException {
        if (data1 instanceof Double || data2 instanceof Double) {
            return (Double) data1 + (Double) data2;
        } else if (data1 instanceof Long || data2 instanceof Long) {
            return (Long) data1 + (Long) data2;
        } else if (data1 instanceof Integer || data2 instanceof Integer) {
            return (Integer) data1 + (Integer) data2;
        } else {
            throw new IOException("the operator + is inappropriate for this type [" + data1.getClass().getName() + "]");
        }

    }


    public Double divided(long times) throws IOException {
        Double dValue = null;
        if (0 != times) {
            if (value instanceof Long) {
                dValue = (Long) value / (double) times;
            } else if (value instanceof Double) {
                dValue = (Double) value / times;
            } else if (value instanceof Integer) {
                dValue = (Integer) value / (double) times;
            } else {
                throw new IOException("the operator / is inappropriate for this type [" + value.getClass().getName() + "]");
            }
        }

        return dValue;
    }

}