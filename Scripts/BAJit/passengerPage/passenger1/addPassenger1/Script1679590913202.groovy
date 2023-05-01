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

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('BAJit/passengerTab/passenger1/addPassenger/first_textBox'), 30)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/first_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/first_textBox'), first)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/last_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/last_textBox'), last)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/birdDate_dropDown'))

WebUI.selectOptionByLabel(findTestObject('BAJit/passengerTab/passenger1/addPassenger/birdDate_dropDown'), birtDate, false)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/day_dropDown'))

WebUI.selectOptionByLabel(findTestObject('BAJit/passengerTab/passenger1/addPassenger/day_dropDown'), day, false)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/year_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/year_textBox'), year)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/approxWgt_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/approxWgt_textBox'), approx)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/gender _dropDown'))

WebUI.selectOptionByLabel(findTestObject('BAJit/passengerTab/passenger1/addPassenger/gender _dropDown'), gender, false)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/email_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/email_textBox'), email)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/smsPhone_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/smsPhone_textBox'), phone)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/passport_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/passport_textBox'), pasport)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/passportCountry_dropDown'))

WebUI.selectOptionByLabel(findTestObject('BAJit/passengerTab/passenger1/addPassenger/passportCountry_dropDown'), pasportCountry, 
    false)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/passportExpirationDate_textBox'))

WebUI.setText(findTestObject('BAJit/passengerTab/passenger1/addPassenger/passportExpirationDate_textBox'), passportExpirationDate)

WebUI.scrollToElement(findTestObject('BAJit/passengerTab/passenger1/addPassenger/savePassenger_button'), 30)

WebUI.click(findTestObject('BAJit/passengerTab/passenger1/addPassenger/savePassenger_button'))

