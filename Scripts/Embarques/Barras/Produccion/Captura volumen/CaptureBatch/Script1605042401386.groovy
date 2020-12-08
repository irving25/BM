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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('Login/La Parrilla'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Produccion/button_Embarques'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Produccion/button_Barras'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Produccion/button_Produccin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Produccion/button_Captura Volumen'), FailureHandling.CONTINUE_ON_FAILURE)

for (def rowNum = 1; rowNum <= findTestData('Data Files/Embarques/Embarque1').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Object Repository/Embarques/Barras/Produccion/input_Cantidad de Barras_appearance-none bl_0c2793'), 
        findTestData('Data Files/Embarques/Embarque1').getValue(1, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/BarraIni'), findTestData('Data Files/Embarques/Embarque1').getValue(
            2, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Embarques/Barras/Produccion/button_Aceptar'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Embarques/Barras/Produccion/input_Lote_Bacth'), findTestData('Data Files/Embarques/Embarque1').getValue(
            3, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Ag'), findTestData('Data Files/Embarques/Embarque1').getValue(
            4, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Au'), findTestData('Data Files/Embarques/Embarque1').getValue(
            5, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Pb'), findTestData('Data Files/Embarques/Embarque1').getValue(
            6, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Zn'), findTestData('Data Files/Embarques/Embarque1').getValue(
            7, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Cu'), findTestData('Data Files/Embarques/Embarque1').getValue(
            8, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Fe'), findTestData('Data Files/Embarques/Embarque1').getValue(
            9, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Ni'), findTestData('Data Files/Embarques/Embarque1').getValue(
            10, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Cd'), findTestData('Data Files/Embarques/Embarque1').getValue(
            11, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Bi'), findTestData('Data Files/Embarques/Embarque1').getValue(
            12, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Mn'), findTestData('Data Files/Embarques/Embarque1').getValue(
            13, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Sb'), findTestData('Data Files/Embarques/Embarque1').getValue(
            14, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    for (def barras = 1; barras <= findTestData('Data Files/Embarques/Barras1').getRowNumbers(); barras++) {
        String aux = ('/html/body/div[1]/div/main/div/div/div/div[2]/div[5]/div[' + (barras * 3)) + ']/div/input'

        String aux1 = ('/html/body/div[1]/div/main/div/div/div/div[2]/div[5]/div[' + ((barras * 3) + 1)) + ']/div/input'

        serial = new TestObject('customObject')

        serial.addProperty('xpath', ConditionType.EQUALS, aux)

        peso = new TestObject('customObject')

        peso.addProperty('xpath', ConditionType.EQUALS, aux1)

        WebUI.setText(serial, findTestData('Data Files/Embarques/Barras1').getValue(1, barras), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(peso, findTestData('Data Files/Embarques/Barras1').getValue(2, barras), FailureHandling.CONTINUE_ON_FAILURE)
    }
}

WebUI.click(findTestObject('Embarques/Barras/Produccion/Btn_aceptar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4)

WebUI.closeBrowser()

