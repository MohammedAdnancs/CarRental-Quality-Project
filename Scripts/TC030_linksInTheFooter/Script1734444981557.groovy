import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

// Smooth scroll function
def scrollToElementSmoothly(TestObject testObject) {
    String jsScript = """
        arguments[0].scrollIntoView({
            behavior: 'smooth',
            block: 'center'
        });
    """
    WebElement element = WebUI.findWebElement(testObject, 10)
    WebUI.executeJavaScript(jsScript, Arrays.asList(element))
}

// Hover, Scroll Smoothly, and Click on 'Driver'
scrollToElementSmoothly(findTestObject('Object Repository/Page_React App/a_Driver'))
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/a_Driver'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/a_Driver'))
WebUI.delay(0.5)

// Hover, Scroll Smoothly, and Click on 'Car'
scrollToElementSmoothly(findTestObject('Object Repository/Page_React App/a_Car'))
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/a_Car'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/a_Car'))
WebUI.delay(0.5)

// Hover, Scroll Smoothly, and Click on 'Community'
scrollToElementSmoothly(findTestObject('Object Repository/Page_React App/a_Community'))
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/a_Community'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/a_Community'))
WebUI.delay(0.5)

// Hover, Scroll Smoothly, and Click on 'Download'
scrollToElementSmoothly(findTestObject('Object Repository/Page_React App/a_Download'))
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/a_Download'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/a_Download'))
WebUI.delay(0.5)

// Hover, Scroll Smoothly, and Click on 'Why choose us'
scrollToElementSmoothly(findTestObject('Object Repository/Page_React App/a_Why choose us'))
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/a_Why choose us'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/a_Why choose us'))
WebUI.delay(0.5)

// Hover, Scroll Smoothly, and Click on 'Our story'
scrollToElementSmoothly(findTestObject('Object Repository/Page_React App/a_Our story'))
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/a_Our story'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/a_Our story'))
WebUI.delay(0.5)

// Hover, Scroll Smoothly, and Click on the first image
scrollToElementSmoothly(findTestObject('Object Repository/Page_React App/img'))
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/img'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/img'))

// Hover, Scroll Smoothly, and Click on the second image
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/img_1'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/img_1'))

// Hover, Scroll Smoothly, and Click on the third image
WebUI.delay(0.5)
WebUI.mouseOver(findTestObject('Object Repository/Page_React App/img_1_2'))
WebUI.delay(0.5)
WebUI.click(findTestObject('Object Repository/Page_React App/img_1_2'))

WebUI.closeBrowser()