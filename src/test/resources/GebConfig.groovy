import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.os.CommandLine

driver = { 
  System.setProperty('webdriver.chrome.driver', '/usr/lib/chromium/chromedriver')
  new ChromeDriver() 
}

baseUrl = "http://gebish.org"
