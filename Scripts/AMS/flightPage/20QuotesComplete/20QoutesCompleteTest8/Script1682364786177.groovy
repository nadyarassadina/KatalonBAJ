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

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/20QuotesComplete_tab'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/showAircraftPrices'))

WebUI.verifyTextPresent('AIRCRAFT PRICES', false)

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/aircraftPricesClose_button'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/operator_dropDown'), operator1, false)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/aircraft_dropDown'), aircraft1, false)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/quoteType_dropDown'), quoteType1, 
    false)

WebUI.setText(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/operatorQuote_textBox'), operatorQuote1)

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/save_button'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/operator_dropDown'), operator2, false)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/aircraft_dropDown'), aircraft2, false)

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/quoteType_dropDown'), quoteType2, 
    false)

WebUI.setText(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/operatorQuote_textBox'), operatorQuote2)

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/addNewQuote/save_button'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/groupQuote/addQuoteGroup_button'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/groupQuote/2LegsCheckBoxes/leg1_checkBox'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/groupQuote/2LegsCheckBoxes/leg2_checkBox'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/groupQuote/save_button'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/groupQuote/applyGroupQuote_button'))

WebUI.click(findTestObject('AMS/5flightPage/20QuotesComplete/groupQuote/yesApplyGroupQuote_button'))

