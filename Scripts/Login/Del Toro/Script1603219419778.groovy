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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/La parrilla login/select_Seleccionar UnidadLa ParrillaLa Enca_3f6097'))

WebUI.selectOptionByLabel(findTestObject('Login/La parrilla login/select_Seleccionar UnidadLa ParrillaLa Enca_3f6097'), 
    'Del Toro', false)

WebUI.click(findTestObject('Login/La parrilla login/button_Iniciar Sesin'))

WebUI.click(findTestObject('Login/La parrilla login/input_Sign in with your corporate ID_btn bt_b79ff6'))

WebUI.setText(findTestObject('Login/La parrilla login/input_Sign in_loginfmt'), 'iperez@firstmajestic.com')

WebUI.click(findTestObject('Login/La parrilla login/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Login/La parrilla login/input_Enter password_passwd'), 'ykGCkDCd7AS2UCfUpOmvYw==')

WebUI.click(findTestObject('Login/La parrilla login/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Login/La parrilla login/input_Sign in_idSIButton9'))

not_run: WebUI.delay(8)

