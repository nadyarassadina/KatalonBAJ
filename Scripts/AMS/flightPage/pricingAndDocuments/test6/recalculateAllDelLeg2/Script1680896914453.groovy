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

WebUI.click(findTestObject('AMS/5flightPage/pricingAndDocuments/pricingAndDocuments_tab'))

WebUI.scrollToElement(findTestObject('AMS/5flightPage/pricingAndDocuments/general/editConfirmedFlight_button'), 30)

WebUI.click(findTestObject('AMS/5flightPage/pricingAndDocuments/general/editConfirmedFlight_button'))

WebUI.click(findTestObject('AMS/5flightPage/pricingAndDocuments/edit/leg2/delete_icon'))

WebUI.click(findTestObject('AMS/5flightPage/pricingAndDocuments/edit/leg2/yesDelete_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/pricingAndDocuments/edit/selectAction_dropDown'), editAction, 
    false)

WebUI.setText(findTestObject('AMS/5flightPage/pricingAndDocuments/edit/reasonForChange_textBox'), reasonForChange)

WebUI.click(findTestObject('AMS/5flightPage/pricingAndDocuments/edit/showAdjusted_button'))

WebUI.verifyTextPresent(original, false)

WebUI.verifyTextPresent(newPrice, false)

WebUI.verifyTextPresent(differenceHours, false)

WebUI.verifyTextPresent(differenceMany, false)

WebUI.click(findTestObject('AMS/5flightPage/pricingAndDocuments/edit/submitAndSend_button'))

WebUI.verifyTextPresent('Success', false)

WebUI.refresh()

