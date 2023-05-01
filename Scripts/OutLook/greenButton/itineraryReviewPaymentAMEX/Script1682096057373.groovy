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

WebUI.scrollToElement(findTestObject('greenButton/itineraryReviewPayment/privacyPolicy_checkBox'), 30)

WebUI.click(findTestObject('greenButton/itineraryReviewPayment/privacyPolicy_checkBox'))

WebUI.click(findTestObject('greenButton/itineraryReviewPayment/termsAndConditions_checkBox'))

WebUI.click(findTestObject('greenButton/itineraryReviewPayment/travelDocuments_checkBox'))

WebUI.scrollToElement(findTestObject('greenButton/itineraryReviewPayment/paymentMethod_dropDown'), 30)

WebUI.selectOptionByLabel(findTestObject('greenButton/itineraryReviewPayment/paymentMethod_dropDown'), paymentMethod, false)

WebUI.setText(findTestObject('greenButton/itineraryReviewPayment/amex/nameOnCard_textBox'), nameOnCard)

WebUI.setText(findTestObject('greenButton/itineraryReviewPayment/amex/cardNumber_textBox'), cardNumber)

WebUI.selectOptionByLabel(findTestObject('greenButton/itineraryReviewPayment/amex/month_dropDown'), expireMonth, false)

WebUI.selectOptionByLabel(findTestObject('greenButton/itineraryReviewPayment/amex/year_dropDown'), year, false)

WebUI.setText(findTestObject('greenButton/itineraryReviewPayment/amex/cvv_textBox'), cvv)

WebUI.setText(findTestObject('greenButton/itineraryReviewPayment/amex/street_textBox'), street)

WebUI.setText(findTestObject('greenButton/itineraryReviewPayment/amex/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('greenButton/itineraryReviewPayment/amex/state_dropDown'), state, false)

WebUI.setText(findTestObject('greenButton/itineraryReviewPayment/amex/zip_textBox'), zipCode)

WebUI.verifyTextPresent(convenienceFee, false)

WebUI.scrollToElement(findTestObject('greenButton/itineraryReviewPayment/amex/americanExpress_checkBox'), 30)

WebUI.click(findTestObject('greenButton/itineraryReviewPayment/amex/americanExpress_checkBox'))

WebUI.setText(findTestObject('greenButton/itineraryReviewPayment/electronicSignature_textBox'), signature)

WebUI.click(findTestObject('greenButton/itineraryReviewPayment/pay_button'))

WebUI.delay(10)

WebUI.closeBrowser()

