package org.scalawebtest.integration.doc._012

import org.scalawebtest.core.{IntegrationFlatSpec, ResponseAccessors}

class ResponseCodeSpec extends IntegrationFlatSpec with ResponseAccessors {
  path = "/doesNotExist"
  "When accessing a resource which does not exist the response code" should "be 404" in {
    responseCode shouldBe 404
  }
}
