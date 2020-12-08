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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/La Parrilla'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/button_Catlogos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Transpor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Operador'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Btn_capturaO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Catalogos/Transportistas/Operator/Transportadora'), transportador, false)

WebUI.setText(findTestObject('Catalogos/Transportistas/Operator/Nombre'), nombre, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Catalogos/Transportistas/Operator/Licencia'), licencia, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Date/input_Vigencia Licencia_Fecha'))

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Date/span_octubre_react-datepicker__year-read-vi_094b71'))

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Date/div_2025'))

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Date/span_octubre 2025_react-datepicker__month-r_2a1220'))

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Date/div_diciembre'))

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Date/div_31'))

WebUI.setText(findTestObject('Catalogos/Transportistas/Operator/Date/input_Numero IMSS_imss'), imss)

not_run: WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Aceptar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

