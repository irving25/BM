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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/La Parrilla'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/button_Catlogos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Transpor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Transpor_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Btn_capturaT'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Catalogos/Transportistas/Transportistas/razon_social'), razon_s, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Catalogos/Transportistas/Transportistas/contrato'), contrato, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Date/fecha'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Date/year'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Date/Year2025'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Date/month'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Date/december'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Date/31December'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Aceptar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

