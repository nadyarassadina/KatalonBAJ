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

WebUI.scrollToElement(findTestObject('AMS/5flightPage/tripSheet/hoursBalance_value'), 30)

WebUI.verifyTextPresent(hoursBalance, false)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/tripSheet/accountBalance_value'), 30)

WebUI.verifyTextPresent(accountBalance, false)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/tripSheet/arriveLeg1_value'), 30)

WebUI.verifyTextPresent(arriveLeg1, false)

WebUI.verifyTextPresent(passenger1Leg1, false)

WebUI.verifyTextPresent(passenger2Leg1, false)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/tripSheet/pdf_icon'), 30)

WebUI.click(findTestObject('AMS/5flightPage/tripSheet/pdf_icon'))

WebUI.delay(30)

WebUI.switchToWindowTitle('Client Detail')

