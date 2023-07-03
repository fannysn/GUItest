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

WebUI.setText(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/input_Email_email'), 'izza.test1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/input_Kata Sandi_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Alter/Edit-Rating/LoginPage/span_Masuk'))

WebUI.setText(findTestObject('Alter/Pelatihan Page/txt_SearchBar'), 'Menjadi Seorang Chef dengan Memasak Masakan Populer Khas Indonesia')

WebUI.sendKeys(findTestObject('Alter/Pelatihan Page/txt_SearchBar'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Alter/Pelatihan Page/ChooseFirst'))

def tittle = WebUI.getText(findTestObject('Alter/Pelatihan Page/tittle_forVerify'))

WebUI.click(findTestObject('Alter/Pelatihan Page/btn_Beli Pelatihan'))

if (WebUI.verifyElementPresent(findTestObject('Alter/Pelatihan Page/verifyTransaksiAktif'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Alter/Pelatihan Page/btn_PopUp_LanjutkanPembayaran'))
}

WebUI.check(findTestObject('Alter/Pelatihan Page/radio_paymenMethod_counter'))

WebUI.click(findTestObject('Alter/Pelatihan Page/counterMethod_ChooseIndomaret'))

WebUI.delay(5)

WebUI.navigateToUrl('https://zenpro.id/profile?state=my_orders')

//WebUI.click(findTestObject('null'))
//WebUI.verifyElementText(findTestObject('Alter/Pelatihan Page/tittle_forVerify_popUp'), tittle)
//WebUI.click(findTestObject('Alter/Pelatihan Page/btn_LihatDetail'))
WebUI.verifyTextPresent(tittle, false)

