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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://skillacademy.com/')

WebUI.click(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Kursus  Kelas Online Bersertifikat Ter_36758b/span_'))

WebUI.click(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Kursus  Kelas Online Bersertifikat Ter_36758b/span_DaftarMasuk'))

WebUI.click(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/p_Daftar'))

WebUI.setText(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/input_Perluas Wawasan, Perbanyak Kesempatan_60b7c3'), 
    'fanny')

WebUI.setText(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/input_dengan akun Prakerja kamu_css-1j6p4yb'), 
    'fannysep279@gmail.com')

WebUI.setText(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/input_Email tidak valid_css-1j6p4yb'), 
    'fannysep279@gmail.com')

WebUI.setText(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/input_Email tidak valid_css-12etelp'), 
    '85174376654')

WebUI.setEncryptedText(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/input_Nomor telepon tidak valid_css-1j6p4yb'), 
    '8rnxVmT9pieEqmmF1SkAqw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/input_Password tidak valid_css-1j6p4yb'), 
    '8rnxVmT9pieEqmmF1SkAqw==')

WebUI.click(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/div_Password tidak valid_css-1tcue33'))

WebUI.click(findTestObject('Object Repository/Skill Academy/Registrasi_SkillAcademy/Page_Skill Academy/p_DAFTAR (1)'))

WebUI.closeBrowser()

