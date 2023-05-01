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

WebUI.click(findTestObject('BAJit/memberProfilePage/members_button'))

WebUI.click(findTestObject('BAJit/memberProfilePage/bookAJet_button'))

WebUI.setText(findTestObject('BAJit/flightSearch/departureAirportLeg1_textBox'), departureAirport)

WebUI.setText(findTestObject('BAJit/flightSearch/destinationAirportLeg1_textBox'), destinationAirport)

WebUI.click(findTestObject('BAJit/flightSearch/departureAirportLeg1_textBox'))

WebUI.click(findTestObject('BAJit/flightSearch/departureDateLeg1_textBox'))

WebUI.setText(findTestObject('BAJit/flightSearch/departureDateLeg1_textBox'), date)

WebUI.click(findTestObject('BAJit/flightSearch/departureAirportLeg1_textBox'))

WebUI.setText(findTestObject('BAJit/flightSearch/numberOfPaxLeg1_textBox'), pax)

WebUI.click(findTestObject('BAJit/flightSearch/searchTrip_button'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/selectFirstAircraft_button'), 30)

WebUI.click(findTestObject('BAJit/filterResults/selectFirstAircraft_button'))

WebUI.selectOptionByLabel(findTestObject('BAJit/paymentPage/account_dropDown'), account, false)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/privacyPolicy_checkBox'), 30)

WebUI.click(findTestObject('BAJit/paymentPage/privacyPolicy_checkBox'))

WebUI.click(findTestObject('BAJit/paymentPage/termAndConditions_checkBox'))

WebUI.click(findTestObject('BAJit/paymentPage/travelDocuments_checkBox'))

WebUI.setText(findTestObject('BAJit/paymentPage/electronicSignature_textBox'), 'NadyaCL Katalon')

WebUI.click(findTestObject('BAJit/paymentPage/pay_button'))

