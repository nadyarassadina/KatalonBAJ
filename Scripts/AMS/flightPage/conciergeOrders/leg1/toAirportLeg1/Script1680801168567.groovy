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

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/toAirport_tab'), 30)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/toAirport_tab'))

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/newPickupQuote_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/selectQuoteTypedropDown'), quoteType, 
    false)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/customerPickupAddress1_textBox'), 
    address1)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/customerPickupAddressCity_textBox'), 
    city)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/selectState_dropDown'), 
    state, false)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/customerPickupAddressZip_textBox'), 
    zip)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/customerPickupAddress2_textBox'))

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/internalN'), internalNote)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/note'), noteForVendor)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/skipEmail_button'), 
    30)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/skipEmail_button'))

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/sUV_textBox'), suv)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/selectAVendor_dropDown'), 
    30)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/selectAVendor_dropDown'), 
    vendor, false)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/quotedAmount_textBox'), 
    30)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/quotedAmount_textBox'), quotedAmount)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/clientPaymentType_dropDown'), 
    clientPaymentType, false)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/clientFull/clientPaymentReason_dropDown'), 
    clientPaymentReason, false)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/clientFull/clientPaymentNote_textBox'), 
    30)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/clientFull/clientPaymentNote_textBox'), 
    clientPaymentNote)

WebUI.scrollToElement(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/saveRequest_button'), 
    30)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/toAirport/executiveService/saveRequest_button'))

