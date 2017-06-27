import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.os.CommandLine

import static org.apache.commons.lang3.SystemUtils.IS_OS_LINUX
import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC

driver = { new ChromeDriver() }

baseUrl = "http://gebish.org"
