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

WebUI.scrollToElement(findTestObject('BAJit/filterResults/turboProp_checkBox'), 30)

WebUI.click(findTestObject('BAJit/filterResults/turboProp_checkBox'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/forTestMinimumBillTime/turboPropSelect_button'), 30)

WebUI.click(findTestObject('BAJit/filterResults/forTestMinimumBillTime/turboPropSelect_button'))

WebUI.verifyTextPresent(turboAircraft, false)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/checkingCalculations/billedFlightTime/billedFlightTime_value'), 
    30)

WebUI.verifyTextPresent(turboTime, false)

WebUI.scrollToElement(findTestObject('BAJit/flightSearch/searchTrip_button'), 30)

WebUI.click(findTestObject('BAJit/flightSearch/searchTrip_button'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/lightJet_checkBox'), 30)

WebUI.click(findTestObject('BAJit/filterResults/lightJet_checkBox'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/forTestMinimumBillTime/lightJetSelect_button'), 30)

WebUI.click(findTestObject('BAJit/filterResults/forTestMinimumBillTime/lightJetSelect_button'))

WebUI.verifyTextPresent(lightJetAircraft, false)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/checkingCalculations/billedFlightTime/billedFlightTime_value'), 
    30)

WebUI.verifyTextPresent(lightTime, false)

WebUI.scrollToElement(findTestObject('BAJit/flightSearch/searchTrip_button'), 30)

WebUI.click(findTestObject('BAJit/flightSearch/searchTrip_button'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/midSize_checkBox'), 30)

WebUI.click(findTestObject('BAJit/filterResults/midSize_checkBox'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/forTestMinimumBillTime/midSizeSelect_button'), 30)

WebUI.click(findTestObject('BAJit/filterResults/forTestMinimumBillTime/midSizeSelect_button'))

WebUI.verifyTextPresent(midSizeAircraft, false)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/checkingCalculations/billedFlightTime/billedFlightTime_value'), 
    30)

WebUI.verifyTextPresent(midSizeTime, false)

WebUI.scrollToElement(findTestObject('BAJit/flightSearch/searchTrip_button'), 30)

WebUI.click(findTestObject('BAJit/flightSearch/searchTrip_button'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/superMid_checkBox'), 30)

WebUI.click(findTestObject('BAJit/filterResults/superMid_checkBox'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/forTestMinimumBillTime/superMidSelect_button'), 30)

WebUI.click(findTestObject('BAJit/filterResults/forTestMinimumBillTime/superMidSelect_button'))

WebUI.verifyTextPresent(superMidAircraft, false)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/checkingCalculations/billedFlightTime/billedFlightTime_value'), 
    30)

WebUI.verifyTextPresent(superMidTime, false)

WebUI.scrollToElement(findTestObject('BAJit/flightSearch/searchTrip_button'), 30)

WebUI.click(findTestObject('BAJit/flightSearch/searchTrip_button'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/heavy_checkBox'), 30)

WebUI.click(findTestObject('BAJit/filterResults/heavy_checkBox'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/forTestMinimumBillTime/heavySelect_button'), 30)

WebUI.click(findTestObject('BAJit/filterResults/forTestMinimumBillTime/heavySelect_button'))

not_run: WebUI.verifyTextPresent(heavyAircraft, false)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/checkingCalculations/billedFlightTime/billedFlightTime_value'), 
    30)

WebUI.verifyTextPresent(heavyTime, false)

