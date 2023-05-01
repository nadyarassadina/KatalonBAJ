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

WebUI.click(findTestObject('BAJit/memberProfilePage/bookAJet_button'))

WebUI.setText(findTestObject('BAJit/flightSearch/departureAirportLeg1_textBox'), departureAirport1)

WebUI.setText(findTestObject('BAJit/flightSearch/destinationAirportLeg1_textBox'), destinationAirport1)

WebUI.click(findTestObject('BAJit/flightSearch/departureAirportLeg1_textBox'))

WebUI.click(findTestObject('BAJit/flightSearch/departureDateLeg1_textBox'))

WebUI.setText(findTestObject('BAJit/flightSearch/departureDateLeg1_textBox'), date1)

WebUI.click(findTestObject('BAJit/flightSearch/departureAirportLeg1_textBox'))

WebUI.setText(findTestObject('BAJit/flightSearch/numberOfPaxLeg1_textBox'), pax1)

WebUI.click(findTestObject('BAJit/flightSearch/return_button'))

WebUI.setText(findTestObject('BAJit/flightSearch/departureDateLeg2_textBox'), date2)

WebUI.click(findTestObject('BAJit/flightSearch/searchTrip_button'))

