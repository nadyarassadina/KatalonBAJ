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

WebUI.verifyTextPresent(billedFlightTimeLeg1, false)

WebUI.verifyTextPresent(billedFlightTimeLeg2, false)

WebUI.verifyTextPresent(flightCostLeg1, false)

WebUI.verifyTextPresent(flightCostLeg2, false)

WebUI.verifyTextPresent(flightCostNonPersistent, false)

WebUI.verifyTextPresent(flightCostTotal, false)

WebUI.verifyTextPresent(flightCostTotal, false)

WebUI.verifyTextPresent(highDensityAiportFee, false)

WebUI.verifyTextPresent(economicAdjustmentFee, false)

WebUI.verifyTextPresent(feeTotal, false)

WebUI.verifyTextPresent(federalExciseTax, false)

WebUI.verifyTextPresent(usSegmantTax, false)

WebUI.verifyTextPresent(usTransportationTax, false)

WebUI.verifyTextPresent(taxesTotal, false)

WebUI.verifyTextPresent(total, false)

