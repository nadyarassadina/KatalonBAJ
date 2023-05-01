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

WebUI.scrollToElement(findTestObject('BAJit/filterResults/superMid_checkBox'), 30)

WebUI.click(findTestObject('BAJit/filterResults/superMid_checkBox'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/wi-fi_checkBox'), 30)

WebUI.click(findTestObject('BAJit/filterResults/wi-fi_checkBox'))

not_run: WebUI.scrollToElement(findTestObject('BAJit/filterResults/aircraftSuperMidFirst/firstAircraftSuperMid_img'), 30)

not_run: WebUI.click(findTestObject('BAJit/filterResults/aircraftSuperMidFirst/firstAircraftSuperMid_img'))

not_run: WebUI.verifyTextPresent(manufacturer, false)

not_run: WebUI.click(findTestObject('BAJit/filterResults/aircraftSuperMidFirst/close_button'))

WebUI.scrollToElement(findTestObject('BAJit/filterResults/aircraftSuperMidFirst/a_Select'), 30)

WebUI.click(findTestObject('BAJit/filterResults/aircraftSuperMidFirst/a_Select'))

