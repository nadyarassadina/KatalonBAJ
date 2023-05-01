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

WebUI.callTestCase(findTestCase('AMS/logInAsSuperAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AMS/3homePage/mainMenuTabs/home/home_menuItem'))

WebUI.setText(findTestObject('AMS/3homePage/searchHomePage_field'), 'Nadya')

WebUI.click(findTestObject('AMS/3homePage/goHomePage_button'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AMS/4searchClientFlights/member/firstFlights_tab'))

WebUI.click(findTestObject('AMS/4searchClientFlights/member/secondFlights_tab'))

WebUI.click(findTestObject('AMS/4searchClientFlights/member/firstFlight_link'))

WebUI.scrollToElement(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlight_tab'), 30)

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlight_tab'))

WebUI.scrollToElement(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'), 30)

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'))

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/yesCancel_button'))

WebUI.scrollToElement(findTestObject('AMS/4searchClientFlights/member/secondFlight_link'), 30)

WebUI.click(findTestObject('AMS/4searchClientFlights/member/secondFlight_link'))

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlight_tab'))

WebUI.scrollToElement(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'), 30)

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'))

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/yesCancel_button'))

WebUI.scrollToElement(findTestObject('AMS/4searchClientFlights/member/secondFlight_link'), 30)

WebUI.click(findTestObject('AMS/4searchClientFlights/member/secondFlight_link'))

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlight_tab'))

WebUI.scrollToElement(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'), 30)

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'))

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/yesCancel_button'))

WebUI.scrollToElement(findTestObject('AMS/4searchClientFlights/member/secondFlight_link'), 30)

WebUI.click(findTestObject('AMS/4searchClientFlights/member/secondFlight_link'))

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlight_tab'))

WebUI.scrollToElement(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'), 30)

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/cancelFlightPlan_button'))

WebUI.click(findTestObject('AMS/5flightPage/cancelFlight_tab/yesCancel_button'))

WebUI.closeBrowser()

