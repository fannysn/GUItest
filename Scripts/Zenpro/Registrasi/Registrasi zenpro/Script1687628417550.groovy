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

WebUI.navigateToUrl('https://zenpro.id/')

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Kursus Online Bersertifikat dan Pelati_305123/span_Daftar'))

WebUI.setText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Nama Lengkap_name'), 'fanny septi nurcahyani')

WebUI.setText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Email_email'), 'nurartgyawahyupratama@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Kata Sandi_password'), 
    '8rnxVmT9pieEqmmF1SkAqw==')

WebUI.sendKeys(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Sign up/input_Kata Sandi_password'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_/input_kodeOTP'), '7')

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_/span_Verifikasi'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Meningkatkan performa kerja'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Lanjut'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Pengembangan Diri'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Lanjut'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/body_iframe srchttpswww.googletagmanager.co_21fd16'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/li_Sarjana'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/body_iframe srchttpswww.googletagmanager.co_21fd16_1'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/li_Kurang dari 1 tahun'))

WebUI.setText(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/input_Nomor Telepon_phone-number'), 
    '81445671223')

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/img'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Lanjut'))

WebUI.click(findTestObject('Object Repository/Registrasi_Zenpro.id/Page_Onboarding/span_Tutup'))

WebUI.closeBrowser()

