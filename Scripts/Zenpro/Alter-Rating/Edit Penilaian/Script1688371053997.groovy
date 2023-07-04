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

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/input_Email_email'), 'fannysntest@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/input_Kata Sandi_password'), '8rnxVmT9pieEqmmF1SkAqw==')

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/button_Pelatihan Saya'))

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/Page_Pelatihan Saya/h4_Belajar Bahasa Inggris dari Nol'))

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/span_Ulasan'))

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/span_Edit Ulasan'))

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/divstarUnfilled5'))

//WebUI.click(findTestObject('Alter/Edit-Rating/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/btnstarFilled5'))
WebUI.sendKeys(findTestObject('Object Repository/Alter/Edit-Rating/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/textarea_S'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Alter/Edit-Rating/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/textarea_S'), 
    'Sangat Menarik')

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/button_Kirim'))

