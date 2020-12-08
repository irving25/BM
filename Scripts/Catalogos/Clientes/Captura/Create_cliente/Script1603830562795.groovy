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

WebUI.click(findTestObject('Object Repository/Catalogos/Clientes/button_Catlogos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Clientes/button_Clientes'))

WebUI.click(findTestObject('Object Repository/Catalogos/Clientes/button_Captura'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Razn Social_businessName'), razon)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Nombre Corto_Short Name'), nombrecorto)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Cuenta SAP_SAP Account'), sap)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Impuesto_Tax'), impuesto)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Contacto Nombre_firstName'), contactonomb)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Contacto Apellido_lastName'), contactoapel)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar PasAfghanistanAlbaniaAlg_68d26a'), 
    pais, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar EstadoFort-de-franceLa T_df5a38'), 
    estado, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar MunicipioFort-de-franceL_032379'), 
    municipio, false)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Ciudad (Opcional)_locality'), ciudad)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Direccin_Address'), direccion)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Cdigo Postal_Zip Code'), codigopostal)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar TipoTipo 1Tipo 2Sandstorm'), 
    tipo, false)

WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Instrucciones_Instructions'), instrucciones)

WebUI.setText(findTestObject('Catalogos/Clientes/Correo1'), correo1)

