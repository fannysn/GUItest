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

WebUI.click(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Kursus Online Bersertifikat dan Pelati_305123/span_Masuk'))

WebUI.setText(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Kursus Online Bersertifikat dan Pelati_305123/input_Email_email'), 
    'fannysntest@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Kursus Online Bersertifikat dan Pelati_305123/input_Kata Sandi_password'), 
    '8rnxVmT9pieEqmmF1SkAqw==')

WebUI.sendKeys(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Kursus Online Bersertifikat dan Pelati_305123/input_Kata Sandi_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Kursus Online Bersertifikat dan Pelati_305123/span_Pelatihan Saya'))

WebUI.click(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Saya/span_Lanjutkan Latihan'))

WebUI.click(findTestObject('Object Repository/ratingggg/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/path'))

WebUI.setText(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/textarea_b'), 
    'b')

WebUI.setText(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/textarea_ba'), 
    'ba')

WebUI.setText(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/textarea_bag'), 
    'bag')

WebUI.setText(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/textarea_bagu'), 
    'bagu')

WebUI.setText(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/textarea_bagus'), 
    'bagus')

WebUI.click(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/span_Kirim'))

WebUI.click(findTestObject('Object Repository/Penilaian_Zenpro.id/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/span_Ulasan'))

WebUI.closeBrowser()

