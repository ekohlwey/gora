/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.gora.persistency;

import org.apache.avro.Schema; 
import org.apache.avro.util.Utf8;
import org.apache.gora.persistency.ListGenericArray; 
import org.junit.Assert;
import org.junit.Test;

/**
 * Testcase for ListGenericArray class
 */
public class TestListGenericArray {
  
  @Test
  public void testHashCode() {
    ListGenericArray array = new ListGenericArray(Schema.create(Schema.Type.STRING)); 
    boolean stackOverflowError = false;
    array.add(new Utf8("array test")); 
    try {
      int hashCode = array.hashCode();
    }
    catch (StackOverflowError e) {
      stackOverflowError = true;
    }
    Assert.assertFalse(stackOverflowError);
  }
}
