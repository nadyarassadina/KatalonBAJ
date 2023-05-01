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

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/conciergeOrders_tab'))

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/cateringQuotes_tab'))

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/newCateringQuote_button'))

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/currentCateringRequest_textBox'), currentCateringRequest)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/internalNote_textBox'), internalNote)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/noteForVendor_textBox'), noteForVendor)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/skipEmail_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/selectAVendor_dropDown'), vendor, 
    false)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/quotedAmount_textBox'), quotedAmount)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/internalNote_textBox'))

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/budgetOverageReason_textBox'), budgetOverage)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/clientPaymentType_dropDown'), clientPaymentType, 
    false)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/clientPartialPayment/selectPaymentReason_dropDown'), 
    clientPaymentReason, false)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/clientPartialPayment/clientAmount_textBox'), 
    clientAmount)

WebUI.setText(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/clientPartialPayment/clientPaymentNote_textBox'), 
    clientPaymentNote)

WebUI.click(findTestObject('AMS/5flightPage/conciergeOrders/leg1/catering/saveRequest_button'))

