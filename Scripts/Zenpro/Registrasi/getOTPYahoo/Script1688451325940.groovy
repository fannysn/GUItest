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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mail.yahoo.com/')

WebUI.click(findTestObject('Object Repository/ymailPage/Page_Yahoo Mail/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/ymailPage/Page_Yahoo/input_Enter Country Code_username'), GlobalVariable.registerMail)

WebUI.click(findTestObject('Object Repository/ymailPage/Page_Yahoo/input_aol.com_signin'))

WebUI.setText(findTestObject('Object Repository/ymailPage/Page_Yahoo/input_to finish signin_password'), GlobalVariable.registerMailPassword)

WebUI.click(findTestObject('Object Repository/ymailPage/Page_Yahoo/button_Next'))

WebUI.setText(findTestObject('Object Repository/ymailPage/Page_(1 unread) - izza.test1yahoo.com - Yahoo Mail/input_Yahoo Mail_select-input react-typeahe_333923'), 
    'Berikut kode OTP akun Zenius Kamu')

WebUI.click(findTestObject('Object Repository/ymailPage/Page_(1 unread) - izza.test1yahoo.com - Yahoo Mail/span_Lanjutan_D_F ab_C gl_C W_6D6F'))

WebUI.click(findTestObject('Object Repository/ymailPage/Page_(1 unread) - izza.test1yahoo.com - Yahoo Mail/span_Selamat datang di Yahoo'))

def OTP = WebUI.getText(findTestObject('ymailPage/getOTP'))

println(OTP)

GlobalVariable.mailOTP = OTP

