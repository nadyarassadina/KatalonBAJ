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

WebUI.click(findTestObject('AMS/3homePage/mainMenuTabs/tools/tools_menuItem'))

WebUI.click(findTestObject('AMS/3homePage/mainMenuTabs/tools/oneloop_dropDownTab'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/addNewLoop_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/oneLoop/loopTool_tab/oneloopSettings/operator_dropDown'), operator, true)

WebUI.selectOptionByLabel(findTestObject('AMS/oneLoop/loopTool_tab/oneloopSettings/aircraft_dropDown'), aircraft, true)

WebUI.click(findTestObject('AMS/oneLoop/loopTool_tab/nextLegFilters/departFrom_field'))

WebUI.setText(findTestObject('AMS/oneLoop/loopTool_tab/nextLegFilters/departFrom_field'), departFrom)

WebUI.click(findTestObject('AMS/oneLoop/loopTool_tab/nextLegFilters/departTo_field'))

WebUI.setText(findTestObject('AMS/oneLoop/loopTool_tab/nextLegFilters/departTo_field'), departTo)

WebUI.setText(findTestObject('AMS/oneLoop/loopTool_tab/oneloopSettings/initialDepartureAirport_field'), departureAirport)

WebUI.click(findTestObject('AMS/oneLoop/loopTool_tab/oneloopSettings/initialDepartureDateTime_field'))

WebUI.setText(findTestObject('AMS/oneLoop/loopTool_tab/oneloopSettings/initialDepartureDateTime_field'), departureDate)

WebUI.click(findTestObject('AMS/oneLoop/loopTool_tab/nextLegFilters/searchLegs_button'))

