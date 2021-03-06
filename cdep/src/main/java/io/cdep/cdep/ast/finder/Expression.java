/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package io.cdep.cdep.ast.finder;

import io.cdep.annotations.Nullable;
import io.cdep.cdep.CreateStringVisitor;

abstract public class Expression {
  @Nullable
  private String string = null;

  @Nullable
  @Override
  public String toString() {
    if (string == null) {
      string = getClass().toString();
      string = string.substring(string.lastIndexOf(".") + 1);

      string = string + ": " + CreateStringVisitor.convert(this);
    }
    return string;
  }
}
