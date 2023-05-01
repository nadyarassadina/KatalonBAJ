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

WebUI.selectOptionByLabel(findTestObject('BAJit/paymentPage/account_dropDown'), account, false)

WebUI.selectOptionByLabel(findTestObject('BAJit/paymentPage/paymentMethod_dropDown'), paymentMethod, false)

WebUI.setText(findTestObject('BAJit/paymentPage/amex/nameOnCard_textBox'), nameOnCard)

WebUI.setText(findTestObject('BAJit/paymentPage/amex/cardNumber_textBox'), cardNumber)

WebUI.selectOptionByLabel(findTestObject('BAJit/paymentPage/amex/expireMonth_dropDown'), expireMonth, false)

WebUI.selectOptionByLabel(findTestObject('BAJit/paymentPage/amex/year_dropDown'), year, false)

WebUI.setText(findTestObject('BAJit/paymentPage/amex/securityCode_textBox'), securityCode)

WebUI.setText(findTestObject('BAJit/paymentPage/amex/street_textBox'), street)

WebUI.setText(findTestObject('BAJit/paymentPage/amex/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('BAJit/paymentPage/amex/state_dropDown'), state, false)

WebUI.setText(findTestObject('BAJit/paymentPage/amex/zipCode_textBox'), zipCode)

WebUI.scrollToElement(findTestObject('BAJit/paymentPage/privacyPolicy_checkBox'), 30)

WebUI.click(findTestObject('BAJit/paymentPage/privacyPolicy_checkBox'))

WebUI.click(findTestObject('BAJit/paymentPage/termAndConditions_checkBox'))

WebUI.click(findTestObject('BAJit/paymentPage/amex/americanExpressPaymentAuthorization_checkBox'))

WebUI.click(findTestObject('BAJit/paymentPage/travelDocuments_checkBox'))

WebUI.setText(findTestObject('BAJit/paymentPage/electronicSignature_textBox'), 'NadyaCL Katalon')

WebUI.click(findTestObject('BAJit/paymentPage/pay_button'))

