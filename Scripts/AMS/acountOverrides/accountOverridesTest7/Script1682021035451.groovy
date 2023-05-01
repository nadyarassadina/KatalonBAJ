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

WebUI.setText(findTestObject('AMS/3homePage/searchHomePage_field'), 'NadyaCL')

WebUI.click(findTestObject('AMS/3homePage/goHomePage_button'))

WebUI.click(findTestObject('AMS/4searchClientFlights/member/nadyaCLKatalon_object'))

WebUI.click(findTestObject('AMS/accountOverrides/accounts_tab'))

WebUI.click(findTestObject('AMS/accountOverrides/h10C0baj2.02023'))

WebUI.scrollToElement(findTestObject('AMS/accountOverrides/addOverride_button'), 30)

WebUI.click(findTestObject('AMS/accountOverrides/addOverride_button'))

WebUI.setText(findTestObject('AMS/accountOverrides/description_textBox'), 'test')

WebUI.click(findTestObject('AMS/accountOverrides/selectAll_checkBox'))

WebUI.click(findTestObject('AMS/accountOverrides/balanceCheck_checkBox'))

WebUI.click(findTestObject('AMS/accountOverrides/hoursCheck_checkBox'))

WebUI.click(findTestObject('AMS/accountOverrides/submit_button'))

