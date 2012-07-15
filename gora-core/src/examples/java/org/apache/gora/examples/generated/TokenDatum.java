/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gora.examples.generated;  
@SuppressWarnings("all")
public class TokenDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TokenDatum\",\"namespace\":\"org.apache.gora.examples.generated\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"count\",\"type\":\"int\"}]}");
  /** Bytes used to represent weather or not a field is dirty. */
  @Deprecated public java.nio.ByteBuffer __g__dirty;
  @Deprecated public int count;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return __g__dirty;
    case 1: return count;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: __g__dirty = (java.nio.ByteBuffer)value$; break;
    case 1: count = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'count' field.
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * Sets the value of the 'count' field.
   * @param value the value to set.
   */
  public void setCount(java.lang.Integer value) {
    this.count = value;
    setDirty(1);
  }
  
  /**
   * Sets the value of the 'count' field.
   * @param value the value to set.
   */
  public boolean isCountDirty(java.lang.Integer value) {
    return isDirty(1);
  }

  /** Creates a new TokenDatum RecordBuilder */
  public static org.apache.gora.examples.generated.TokenDatum.Builder newBuilder() {
    return new org.apache.gora.examples.generated.TokenDatum.Builder();
  }
  
  /** Creates a new TokenDatum RecordBuilder by copying an existing Builder */
  public static org.apache.gora.examples.generated.TokenDatum.Builder newBuilder(org.apache.gora.examples.generated.TokenDatum.Builder other) {
    return new org.apache.gora.examples.generated.TokenDatum.Builder(other);
  }
  
  /** Creates a new TokenDatum RecordBuilder by copying an existing TokenDatum instance */
  public static org.apache.gora.examples.generated.TokenDatum.Builder newBuilder(org.apache.gora.examples.generated.TokenDatum other) {
    return new org.apache.gora.examples.generated.TokenDatum.Builder(other);
  }
  
  /**
   * RecordBuilder for TokenDatum instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TokenDatum>
    implements org.apache.avro.data.RecordBuilder<TokenDatum> {

    private java.nio.ByteBuffer __g__dirty;
    private int count;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.examples.generated.TokenDatum.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.examples.generated.TokenDatum.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing TokenDatum instance */
    private Builder(org.apache.gora.examples.generated.TokenDatum other) {
            super(org.apache.gora.examples.generated.TokenDatum.SCHEMA$);
      if (isValidValue(fields()[0], other.__g__dirty)) {
        this.__g__dirty = (java.nio.ByteBuffer) data().deepCopy(fields()[0].schema(), other.__g__dirty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.count)) {
        this.count = (java.lang.Integer) data().deepCopy(fields()[1].schema(), other.count);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'count' field */
    public java.lang.Integer getCount() {
      return count;
    }
    
    /** Sets the value of the 'count' field */
    public org.apache.gora.examples.generated.TokenDatum.Builder setCount(int value) {
      validate(fields()[1], value);
      this.count = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'count' field has been set */
    public boolean hasCount() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'count' field */
    public org.apache.gora.examples.generated.TokenDatum.Builder clearCount() {
      fieldSetFlags()[1] = false;
      return this;
    }
    
    @Override
    public TokenDatum build() {
      try {
        TokenDatum record = new TokenDatum();
        record.__g__dirty = fieldSetFlags()[0] ? this.__g__dirty : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.count = fieldSetFlags()[1] ? this.count : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}