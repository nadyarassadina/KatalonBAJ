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

WebUI.click(findTestObject('AMS/5flightPage/goodToGoSent/goodToGoSent_tab'))

WebUI.click(findTestObject('AMS/5flightPage/goodToGoSent/leg1_checkBox'))

WebUI.click(findTestObject('AMS/5flightPage/goodToGoSent/leg2_checkBox'))

WebUI.setText(findTestObject('AMS/5flightPage/goodToGoSent/note_textBox'), note)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/goodToGoSent/pdf_icon'), 30)

WebUI.click(findTestObject('AMS/5flightPage/goodToGoSent/pdf_icon'))

WebUI.delay(15)

WebUI.switchToWindowTitle('Client Detail')

WebUI.click(findTestObject('AMS/5flightPage/goodToGoSent/sendGoodToGo_button'))

WebUI.verifyTextPresent('Success', false)

