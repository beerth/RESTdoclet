/*
 * #%L
 * restdoc-sample
 * %%
 * Copyright (C) 2012 IG Group
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.iggroup.oss.sample.web.controller.error;

import java.util.ArrayList;

import com.iggroup.oss.sample.web.controller.error.common.ErrorParameter;
import com.iggroup.oss.sample.web.controller.error.common.SampleError;
import com.iggroup.oss.sample.web.controller.error.common.SampleErrorCode;

/**
 * Duplicate reference error
 */
public class DuplicateReferenceError extends SampleError {

   private static final String REFERENCE = "reference";

   /**
    * Constructor
    * 
    * @param reference the reference that was not found
    */
   public DuplicateReferenceError(String reference) {

      super(SampleErrorCode.DUPLICATE_REFERENCE_ERROR);

      ArrayList<ErrorParameter> errorParameters =
         new ArrayList<ErrorParameter>();
      errorParameters.add(new ErrorParameter(REFERENCE, reference));
      setParameters(errorParameters);

   }

}