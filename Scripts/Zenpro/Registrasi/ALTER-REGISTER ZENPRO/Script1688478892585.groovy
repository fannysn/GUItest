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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://zenpro.id/')

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Kursus Online Bersertifikat dan Pelati_305123/span_Daftar'))

WebUI.setText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Nama Lengkap_name'), 'kang testing')

WebUI.setText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Email_email'), GlobalVariable.registerMail)

WebUI.setEncryptedText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Kata Sandi_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.sendKeys(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Kata Sandi_password'), Keys.chord(
        Keys.ENTER))

WebUI.delay(5)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.callTestCase(findTestCase('Zenpro/Registrasi/getOTPYahoo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(currentWindow)

OTP = GlobalVariable.mailOTP

WebUI.setText(findTestObject('Registrasi_Zenpro.id/Page_/otp1'), OTP[0])

WebUI.setText(findTestObject('Registrasi_Zenpro.id/Page_/otp2'), OTP[1])

WebUI.setText(findTestObject('Registrasi_Zenpro.id/Page_/otp3'), OTP[2])

WebUI.setText(findTestObject('Registrasi_Zenpro.id/Page_/otp4'), OTP[3])

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_/span_Verifikasi'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Meningkatkan performa kerja'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Lanjut'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Pengembangan Diri'))

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/btn_Lanjut_Atminat belajar'))

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/option_PilihTingkatPendidikan'))

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/option_Sarjana'))

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/option_PilihTingkatPengalaman'))

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/option_kurang dr 1 tahun'))

WebUI.setText(findTestObject('Registrasi_Zenpro.id/Page_/setDate'), '11/10/1999')

WebUI.setText(findTestObject('Registrasi_Zenpro.id/Page_/form_phoneNumber'), '81445671223')

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/btn_Gender_Female'))

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/btn_Lanjut_AtCeritakan Dirimu'))

WebUI.click(findTestObject('Registrasi_Zenpro.id/Page_/btn_Tutup'))

