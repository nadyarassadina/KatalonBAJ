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

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/editLoopPlan_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/removeFromLoop_button'))

WebUI.click(findTestObject('AMS/oneLoop/loopTool_tab/nextLegFilters/saveLoop_button'))

WebUI.click(findTestObject('AMS/oneLoop/loopTool_tab/saveLoop/save_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/savedLoops_tab'))

WebUI.setText(findTestObject('AMS/oneLoop/savedLoops_tab/search_fields/loopName_textBox'), 'KATALON test')

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/search_fields/apply_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/loopNameKatalon'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/CreateFlightPlan_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/yesCreateFlightPlan_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/deactivateLoopPlan_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/yesDeactivate_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/deleteLoopPlan_button'))

WebUI.click(findTestObject('AMS/oneLoop/savedLoops_tab/actionsWithLoop/yesDelete_button'))

