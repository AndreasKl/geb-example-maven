import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.os.CommandLine

import static org.apache.commons.lang3.SystemUtils.IS_OS_LINUX
import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC

driver = { 
  System.setProperty('webdriver.chrome.driver', '/usr/lib/chromium/chromedriver')
  new ChromeDriver() 
}

baseUrl = "http://gebish.org"
