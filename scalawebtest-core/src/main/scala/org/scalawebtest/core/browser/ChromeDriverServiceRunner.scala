package org.scalawebtest.core.browser

import java.io.File

import org.openqa.selenium.chrome.ChromeDriverService

object ChromeDriverServiceRunner {
  //before test suite
//  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe")
  System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver")

  val service: ChromeDriverService = new ChromeDriverService.Builder()
    .usingDriverExecutable(new File(System.getProperty("webdriver.chrome.driver")))
    .usingAnyFreePort.build

  service.start()
  println("Started WireMock Server and tampered camel configuration and mock data")

  //after test suite
  sys addShutdownHook {

    service.stop()
    println("Stopped WireMock Server and reverted camel configuration")
  }

}

