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

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/checkingCalculations/billedFlightTime/billedFlightTime_value'), 
    30)

WebUI.verifyTextPresent(billedFlightTime, false)

WebUI.click(findTestObject('BAJit/paymentPage/checkingCalculations/flightCosts/flightCostsOpen_button'))

WebUI.verifyTextPresent(flightCostLeg1, false)

WebUI.verifyTextPresent(flightCostNonPersistent, false)

WebUI.verifyTextPresent(flightCostTotal, false)

WebUI.click(findTestObject('BAJit/paymentPage/checkingCalculations/flightCosts/flightCostClose_button'))

WebUI.click(findTestObject('BAJit/paymentPage/checkingCalculations/fees/feesOpen_button'))

WebUI.verifyTextPresent(highDensityAiportFee, false)

WebUI.verifyTextPresent(economicAdjustmentFee, false)

WebUI.verifyTextPresent(internationalHandingFee, false)

WebUI.verifyTextPresent(feeTotal, false)

WebUI.click(findTestObject('BAJit/paymentPage/checkingCalculations/fees/feesClose_button'))

WebUI.click(findTestObject('BAJit/paymentPage/checkingCalculations/taxes/taxesOpen_button'))

WebUI.verifyTextPresent(usTransportationTax, false)

WebUI.verifyTextPresent(taxesTotal, false)

WebUI.click(findTestObject('BAJit/paymentPage/checkingCalculations/taxes/taxesClose_button'))

WebUI.verifyTextPresent(total, false)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/privacyPolicy_checkBox'), 30)

WebUI.click(findTestObject('BAJit/paymentPage/privacyPolicy_checkBox'))

WebUI.click(findTestObject('BAJit/paymentPage/termAndConditions_checkBox'))

WebUI.click(findTestObject('BAJit/paymentPage/travelDocuments_checkBox'))

WebUI.setText(findTestObject('BAJit/paymentPage/electronicSignature_textBox'), signature)

WebUI.click(findTestObject('BAJit/paymentPage/pay_button'))

WebUI.verifyTextPresent(message, false)

