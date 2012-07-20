/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gora.examples.generated;  
@SuppressWarnings("all")
public class WebPage extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WebPage\",\"namespace\":\"org.apache.gora.examples.generated\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"content\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"parsedContent\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"outlinks\",\"type\":[{\"type\":\"map\",\"values\":\"string\"},\"null\"]},{\"name\":\"metadata\",\"type\":[{\"type\":\"record\",\"name\":\"Metadata\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"version\",\"type\":\"int\"},{\"name\":\"data\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]},\"null\"]}]}");
  /** Bytes used to represent weather or not a field is dirty. */
  private java.nio.ByteBuffer __g__dirty = java.nio.ByteBuffer.wrap(new byte[1]);
  private java.lang.CharSequence url;
  private java.nio.ByteBuffer content;
  private java.util.List<java.lang.CharSequence> parsedContent;
  private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> outlinks;
  private org.apache.gora.examples.generated.Metadata metadata;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return __g__dirty;
    case 1: return url;
    case 2: return content;
    case 3: return parsedContent;
    case 4: return outlinks;
    case 5: return metadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: __g__dirty = (java.nio.ByteBuffer)value$; break;
    case 1: url = (java.lang.CharSequence)value$; break;
    case 2: content = (java.nio.ByteBuffer)value$; break;
    case 3: parsedContent = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: outlinks = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 5: metadata = (org.apache.gora.examples.generated.Metadata)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url.toString();
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value.toString();
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'url' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isUrlDirty(java.lang.CharSequence value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'content' field.
   */
  public java.nio.ByteBuffer getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.nio.ByteBuffer value) {
    this.content = value;
    setDirty(2);
  }
  
  /**
   * Checks the dirty status of the 'content' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isContentDirty(java.nio.ByteBuffer value) {
    return isDirty(2);
  }

  /**
   * Gets the value of the 'parsedContent' field.
   */
  public java.util.List<java.lang.CharSequence> getParsedContent() {
    return parsedContent;
  }

  /**
   * Sets the value of the 'parsedContent' field.
   * @param value the value to set.
   */
  public void setParsedContent(java.util.List<java.lang.CharSequence> value) {
    this.parsedContent = value;
    setDirty(3);
  }
  
  /**
   * Checks the dirty status of the 'parsedContent' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isParsedContentDirty(java.util.List<java.lang.CharSequence> value) {
    return isDirty(3);
  }

  /**
   * Gets the value of the 'outlinks' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getOutlinks() {
    return outlinks;
  }

  /**
   * Sets the value of the 'outlinks' field.
   * @param value the value to set.
   */
  public void setOutlinks(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.outlinks = value;
    setDirty(4);
  }
  
  /**
   * Checks the dirty status of the 'outlinks' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isOutlinksDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    return isDirty(4);
  }

  /**
   * Gets the value of the 'metadata' field.
   */
  public org.apache.gora.examples.generated.Metadata getMetadata() {
    return metadata;
  }

  /**
   * Sets the value of the 'metadata' field.
   * @param value the value to set.
   */
  public void setMetadata(org.apache.gora.examples.generated.Metadata value) {
    this.metadata = value;
    setDirty(5);
  }
  
  /**
   * Checks the dirty status of the 'metadata' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isMetadataDirty(org.apache.gora.examples.generated.Metadata value) {
    return isDirty(5);
  }

  /** Creates a new WebPage RecordBuilder */
  public static org.apache.gora.examples.generated.WebPage.Builder newBuilder() {
    return new org.apache.gora.examples.generated.WebPage.Builder();
  }
  
  /** Creates a new WebPage RecordBuilder by copying an existing Builder */
  public static org.apache.gora.examples.generated.WebPage.Builder newBuilder(org.apache.gora.examples.generated.WebPage.Builder other) {
    return new org.apache.gora.examples.generated.WebPage.Builder(other);
  }
  
  /** Creates a new WebPage RecordBuilder by copying an existing WebPage instance */
  public static org.apache.gora.examples.generated.WebPage.Builder newBuilder(org.apache.gora.examples.generated.WebPage other) {
    return new org.apache.gora.examples.generated.WebPage.Builder(other);
  }
  
  private static java.nio.ByteBuffer deepCopyToWriteOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }
  
  /**
   * RecordBuilder for WebPage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WebPage>
    implements org.apache.avro.data.RecordBuilder<WebPage> {

    private java.nio.ByteBuffer __g__dirty;
    private java.lang.CharSequence url;
    private java.nio.ByteBuffer content;
    private java.util.List<java.lang.CharSequence> parsedContent;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> outlinks;
    private org.apache.gora.examples.generated.Metadata metadata;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.examples.generated.WebPage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.examples.generated.WebPage.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing WebPage instance */
    private Builder(org.apache.gora.examples.generated.WebPage other) {
            super(org.apache.gora.examples.generated.WebPage.SCHEMA$);
      if (isValidValue(fields()[0], other.__g__dirty)) {
        this.__g__dirty = (java.nio.ByteBuffer) data().deepCopy(fields()[0].schema(), other.__g__dirty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.url)) {
        this.url = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.url);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.content)) {
        this.content = (java.nio.ByteBuffer) data().deepCopy(fields()[2].schema(), other.content);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.parsedContent)) {
        this.parsedContent = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[3].schema(), other.parsedContent);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.outlinks)) {
        this.outlinks = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[4].schema(), other.outlinks);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.metadata)) {
        this.metadata = (org.apache.gora.examples.generated.Metadata) data().deepCopy(fields()[5].schema(), other.metadata);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'url' field */
    public java.lang.CharSequence getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public org.apache.gora.examples.generated.WebPage.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.url = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'url' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearUrl() {
      url = null;
      fieldSetFlags()[1] = false;
      return this;
    }
    
    /** Gets the value of the 'content' field */
    public java.nio.ByteBuffer getContent() {
      return content;
    }
    
    /** Sets the value of the 'content' field */
    public org.apache.gora.examples.generated.WebPage.Builder setContent(java.nio.ByteBuffer value) {
      validate(fields()[2], value);
      this.content = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'content' field has been set */
    public boolean hasContent() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'content' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearContent() {
      content = null;
      fieldSetFlags()[2] = false;
      return this;
    }
    
    /** Gets the value of the 'parsedContent' field */
    public java.util.List<java.lang.CharSequence> getParsedContent() {
      return parsedContent;
    }
    
    /** Sets the value of the 'parsedContent' field */
    public org.apache.gora.examples.generated.WebPage.Builder setParsedContent(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.parsedContent = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'parsedContent' field has been set */
    public boolean hasParsedContent() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'parsedContent' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearParsedContent() {
      parsedContent = null;
      fieldSetFlags()[3] = false;
      return this;
    }
    
    /** Gets the value of the 'outlinks' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getOutlinks() {
      return outlinks;
    }
    
    /** Sets the value of the 'outlinks' field */
    public org.apache.gora.examples.generated.WebPage.Builder setOutlinks(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.outlinks = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'outlinks' field has been set */
    public boolean hasOutlinks() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'outlinks' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearOutlinks() {
      outlinks = null;
      fieldSetFlags()[4] = false;
      return this;
    }
    
    /** Gets the value of the 'metadata' field */
    public org.apache.gora.examples.generated.Metadata getMetadata() {
      return metadata;
    }
    
    /** Sets the value of the 'metadata' field */
    public org.apache.gora.examples.generated.WebPage.Builder setMetadata(org.apache.gora.examples.generated.Metadata value) {
      validate(fields()[5], value);
      this.metadata = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'metadata' field has been set */
    public boolean hasMetadata() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'metadata' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearMetadata() {
      metadata = null;
      fieldSetFlags()[5] = false;
      return this;
    }
    
    @Override
    public WebPage build() {
      try {
        WebPage record = new WebPage();
        record.__g__dirty = fieldSetFlags()[0] ? this.__g__dirty : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.url = fieldSetFlags()[1] ? this.url : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.content = fieldSetFlags()[2] ? this.content : (java.nio.ByteBuffer) defaultValue(fields()[2]);
        record.parsedContent = fieldSetFlags()[3] ? this.parsedContent : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.outlinks = fieldSetFlags()[4] ? this.outlinks : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[4]);
        record.metadata = fieldSetFlags()[5] ? this.metadata : (org.apache.gora.examples.generated.Metadata) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public WebPage.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends WebPage implements org.apache.gora.persistency.Tombstone {
  
      private Tombstone() { }
  
	  				  /**
	   * Gets the value of the 'url' field.
		   */
	  public java.lang.CharSequence getUrl() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'url' field.
		   * @param value the value to set.
	   */
	  public void setUrl(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'url' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isUrlDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'content' field.
		   */
	  public java.nio.ByteBuffer getContent() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'content' field.
		   * @param value the value to set.
	   */
	  public void setContent(java.nio.ByteBuffer value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'content' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isContentDirty(java.nio.ByteBuffer value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'parsedContent' field.
		   */
	  public java.util.List<java.lang.CharSequence> getParsedContent() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'parsedContent' field.
		   * @param value the value to set.
	   */
	  public void setParsedContent(java.util.List<java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'parsedContent' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isParsedContentDirty(java.util.List<java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'outlinks' field.
		   */
	  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getOutlinks() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'outlinks' field.
		   * @param value the value to set.
	   */
	  public void setOutlinks(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'outlinks' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isOutlinksDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'metadata' field.
		   */
	  public org.apache.gora.examples.generated.Metadata getMetadata() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'metadata' field.
		   * @param value the value to set.
	   */
	  public void setMetadata(org.apache.gora.examples.generated.Metadata value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'metadata' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isMetadataDirty(org.apache.gora.examples.generated.Metadata value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}