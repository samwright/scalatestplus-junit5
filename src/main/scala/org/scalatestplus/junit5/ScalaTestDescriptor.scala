/*
 * Copyright 2001-2013 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatestplus.junit5

import org.junit.platform.engine.support.descriptor.AbstractTestDescriptor
import org.junit.platform.engine.{TestDescriptor, UniqueId}

/**
 * <code>TestDescriptor</code> for a test in ScalaTest suite.
 *
 * @param theUniqueId The unique ID.
 * @param suiteClass The display name for this test.
 */
class ScalaTestDescriptor(theUniqueId: UniqueId, displayName: String) extends AbstractTestDescriptor(theUniqueId, displayName) {
  /**
   * Type of this <code>ScalaTestDescriptor</code>.
   *
   * @return <code>TestDescriptor.Type.TEST</code>
   */
  override def getType: TestDescriptor.Type = TestDescriptor.Type.TEST
}