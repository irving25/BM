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

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Catlogos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Contratos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Captura'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Nm Contrato_numContract'), contrato)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar Tipo de ContratoBarrasCo_55f85c'), 
    tipo, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar ClienteRepublic Metals C_939819'), 
    cliente, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar RefineraMet Mex Peoles S_14df66'), 
    refineria, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar UnidadLa ParrillaLa Enca_c3bc0c'), 
    unidad, false)

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/input_Fecha Inicial_Fecha'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/span_octubre'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_enero'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_1'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/input_Vigencia_Date'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/span_octubre_react-datepicker__year-read-vi_094b71'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_2025'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/span_octubre 2025_react-datepicker__month-r_2a1220'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_diciembre'))

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_31'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Grs Pagable Plata_agPayableGrams'), grs_plata)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Porcentaje Pagable Plata_agPayablePercentage'), 
    porc_plata)

WebUI.setText(findTestObject('Catalogos/Contratos/Porcentaje_ant_pla'), porc_ant_plata)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Grs Pagables Oro_auPayableGrams'), grs_oro)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Porcentaje Pagable Oro_auPayablePercentage'), 
    por_pag_oro)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Porcentaje Anticipo Oro_auAdvPayableP_441ce7'), 
    por_ant_oro)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Cargo por Refinacin Onzas de Plata_pa_4a3ab3'), 
    carg_refinacion)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar TipoDore WeightDore OzDo_e78bf3'), 
    tipo_oz_ref, false)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Cargo por Refinacin Onzas de Oro_paya_8d40cb'), 
    carg_refinacion_oro)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Mnimo Asignable Plata_minAgAssignableAmount'), 
    min_asig_plata)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Mnimo Asignable Oro_minAuAssignableAmount'), min_asig_oro)

WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Dias de Cierre_closingDays'), dias)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar OnzaDore OzsDore Ag OzsD_090c4f'), 
    oz_refinar, false)

WebUI.setText(findTestObject('Catalogos/Contratos/Correo1'), correo1)

WebUI.setText(findTestObject('Catalogos/Contratos/Correo2'), correo2)

WebUI.setText(findTestObject('Catalogos/Contratos/Correo3'), correo3)

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Guardar'))

WebUI.delay(5)

