/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gora.examples.generated;  
@SuppressWarnings("all")
public class V2 extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"V2\",\"namespace\":\"org.apache.gora.examples.generated\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"v3\",\"type\":\"int\"}]}");
  /** Bytes used to represent weather or not a field is dirty. */
  @Deprecated public java.nio.ByteBuffer __g__dirty = java.nio.ByteBuffer.wrap(new byte[1]);
  @Deprecated public int v3;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return __g__dirty;
    case 1: return v3;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: __g__dirty = (java.nio.ByteBuffer)value$; break;
    case 1: v3 = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'v3' field.
   */
  public java.lang.Integer getV3() {
    return v3;
  }

  /**
   * Sets the value of the 'v3' field.
   * @param value the value to set.
   */
  public void setV3(java.lang.Integer value) {
    this.v3 = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'v3' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isV3Dirty(java.lang.Integer value) {
    return isDirty(1);
  }

  /** Creates a new V2 RecordBuilder */
  public static org.apache.gora.examples.generated.V2.Builder newBuilder() {
    return new org.apache.gora.examples.generated.V2.Builder();
  }
  
  /** Creates a new V2 RecordBuilder by copying an existing Builder */
  public static org.apache.gora.examples.generated.V2.Builder newBuilder(org.apache.gora.examples.generated.V2.Builder other) {
    return new org.apache.gora.examples.generated.V2.Builder(other);
  }
  
  /** Creates a new V2 RecordBuilder by copying an existing V2 instance */
  public static org.apache.gora.examples.generated.V2.Builder newBuilder(org.apache.gora.examples.generated.V2 other) {
    return new org.apache.gora.examples.generated.V2.Builder(other);
  }
  
  /**
   * RecordBuilder for V2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<V2>
    implements org.apache.avro.data.RecordBuilder<V2> {

    private java.nio.ByteBuffer __g__dirty;
    private int v3;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.examples.generated.V2.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.examples.generated.V2.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing V2 instance */
    private Builder(org.apache.gora.examples.generated.V2 other) {
            super(org.apache.gora.examples.generated.V2.SCHEMA$);
      if (isValidValue(fields()[0], other.__g__dirty)) {
        this.__g__dirty = (java.nio.ByteBuffer) data().deepCopy(fields()[0].schema(), other.__g__dirty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.v3)) {
        this.v3 = (java.lang.Integer) data().deepCopy(fields()[1].schema(), other.v3);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'v3' field */
    public java.lang.Integer getV3() {
      return v3;
    }
    
    /** Sets the value of the 'v3' field */
    public org.apache.gora.examples.generated.V2.Builder setV3(int value) {
      validate(fields()[1], value);
      this.v3 = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'v3' field has been set */
    public boolean hasV3() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'v3' field */
    public org.apache.gora.examples.generated.V2.Builder clearV3() {
      fieldSetFlags()[1] = false;
      return this;
    }
    
    @Override
    public V2 build() {
      try {
        V2 record = new V2();
        record.__g__dirty = fieldSetFlags()[0] ? this.__g__dirty : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.v3 = fieldSetFlags()[1] ? this.v3 : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}