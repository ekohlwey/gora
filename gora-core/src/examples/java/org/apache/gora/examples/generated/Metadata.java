/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gora.examples.generated;  
@SuppressWarnings("all")
public class Metadata extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Metadata\",\"namespace\":\"org.apache.gora.examples.generated\",\"fields\":[{\"name\":\"version\",\"type\":\"int\"},{\"name\":\"data\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  @Deprecated public int version;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> data;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return version;
    case 1: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: version = (java.lang.Integer)value$; break;
    case 1: data = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
    setDirty(0);
  }
  
  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public boolean isVersionDirty(java.lang.Integer value) {
    return isDirty(0);
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.data = value;
    setDirty(1);
  }
  
  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public boolean isDataDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    return isDirty(1);
  }

  /** Creates a new Metadata RecordBuilder */
  public static org.apache.gora.examples.generated.Metadata.Builder newBuilder() {
    return new org.apache.gora.examples.generated.Metadata.Builder();
  }
  
  /** Creates a new Metadata RecordBuilder by copying an existing Builder */
  public static org.apache.gora.examples.generated.Metadata.Builder newBuilder(org.apache.gora.examples.generated.Metadata.Builder other) {
    return new org.apache.gora.examples.generated.Metadata.Builder(other);
  }
  
  /** Creates a new Metadata RecordBuilder by copying an existing Metadata instance */
  public static org.apache.gora.examples.generated.Metadata.Builder newBuilder(org.apache.gora.examples.generated.Metadata other) {
    return new org.apache.gora.examples.generated.Metadata.Builder(other);
  }
  
  /**
   * RecordBuilder for Metadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Metadata>
    implements org.apache.avro.data.RecordBuilder<Metadata> {

    private int version;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> data;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.examples.generated.Metadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.examples.generated.Metadata.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Metadata instance */
    private Builder(org.apache.gora.examples.generated.Metadata other) {
            super(org.apache.gora.examples.generated.Metadata.SCHEMA$);
      if (isValidValue(fields()[0], other.version)) {
        this.version = (java.lang.Integer) data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'version' field */
    public java.lang.Integer getVersion() {
      return version;
    }
    
    /** Sets the value of the 'version' field */
    public org.apache.gora.examples.generated.Metadata.Builder setVersion(int value) {
      validate(fields()[0], value);
      this.version = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'version' field has been set */
    public boolean hasVersion() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'version' field */
    public org.apache.gora.examples.generated.Metadata.Builder clearVersion() {
      fieldSetFlags()[0] = false;
      return this;
    }
    
    /** Gets the value of the 'data' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public org.apache.gora.examples.generated.Metadata.Builder setData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.data = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'data' field */
    public org.apache.gora.examples.generated.Metadata.Builder clearData() {
      data = null;
      fieldSetFlags()[1] = false;
      return this;
    }
    
    @Override
    public Metadata build() {
      try {
        Metadata record = new Metadata();
        record.version = fieldSetFlags()[0] ? this.version : (java.lang.Integer) defaultValue(fields()[0]);
        record.data = fieldSetFlags()[1] ? this.data : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}