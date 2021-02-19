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

//START APPS
Mobile.startApplication('C:\\Users\\Owner\\Downloads\\FINALPROJECTS-201016-121328 (1)\\FINAL PROJECTS\\MOBILE\\app-debug.apk', 
    false)

//LOGIN
Mobile.setText(findTestObject('Login/Stext_Username'), 'ayuliana', 3)

Mobile.setEncryptedText(findTestObject('Login/Stext_Password'), '+2G3Ue0AwU2iSQU+LsUv5w==', 3)

Mobile.tap(findTestObject('Login/Button_Login'), 3, FailureHandling.STOP_ON_FAILURE)

//ACCOUNTS
Mobile.tap(findTestObject('Login/Button_StripTiga'), 3)

Mobile.tap(findTestObject('Menu-menu Strip Tiga/Button_Accounts'), 3)

Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button Plus for Add Account'), 3)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stex_Account Name'), 'M Fachri', 0)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stext_Initial Balance (Optional)'), '1500000', 
    0)

Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_ADD'), 3)

Mobile.tap(findTestObject('Account/Input Add Account/Button_CANCEL'), 0)

Mobile.verifyElementText(findTestObject('Account/TView_Account Name Dewit Dwi'), 'M Fachri')

//LOGOUT
Mobile.tap(findTestObject('Login/Button_StripTiga'), 0)

Mobile.scrollToText('Logout', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/Button_Logout'), 0)

Mobile.closeApplication()

