/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 the "License";
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalawebtest.integration.gauge

import org.scalawebtest.integration.ScalaWebTestBaseSpec

class NavigationSpec extends ScalaWebTestBaseSpec {
  path = "/elementsList.jsp"

  "The navigation" should "contain three items" in {
    currentPage fits
      <ul>
        <li class="list_item"/>
        <li class="list_item"/>
        <li class="list_item"/>
      </ul>
  }
  it should "contain elements with link and description" in {
    currentPage fits
      <li class="list_item">
        <a class="link" href="/test-link1.html">
          <div class="title">Link 1</div>
        </a>
      </li>
  }
}
