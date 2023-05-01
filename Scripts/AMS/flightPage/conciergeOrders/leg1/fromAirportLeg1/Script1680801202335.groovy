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

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/fromAirport_tab'), 30)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/fromAirport_tab'))

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/newDropoffQuote_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/selectQuoteType_dropDown'), quoteType, 
    false)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/rentalCar/membershipNumber_textBox'), membershipNumber)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/rentalCar/selectAVendor_dropDown'), 
    vendor, false)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/rentalCar/internalNote_textBox'), internalNote)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/rentalCar/quotedAmount_textBox'), quotedAmount)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/rentalCar/save_button'), 30)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/fromAirport/rentalCar/save_button'))

WebUI.verifyTextPresent('Success', false)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/general/sendConfirmationToClient_button'), 30)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/general/sendConfirmationToClient_button'))

WebUI.verifyTextPresent('Success', false)

