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

//As a user, I want to purchase an item from sourcedemo
WebUI.callTestCase(findTestCase('Login/Positive Case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Product List/addtocartBtn_saucelabs_onesie'), 0)

WebUI.click(findTestObject('Product List/addtocartBtn_saucelabs_onesie'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Product List/shopping_cartIcon'), 0)

WebUI.click(findTestObject('Product List/shopping_cartIcon'))

WebUI.click(findTestObject('Cart Page/checkout_btn'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Checkout Page/your_informationpage'), 0)

WebUI.click(findTestObject('Checkout Page/firstname'))

WebUI.setText(findTestObject('Checkout Page/firstname'), 'Martha')

WebUI.click(findTestObject('Checkout Page/lastname'))

WebUI.setText(findTestObject('Checkout Page/lastname'), 'Gultom')

WebUI.click(findTestObject('Checkout Page/postal_code'))

WebUI.setText(findTestObject('Checkout Page/postal_code'), '12940')

WebUI.click(findTestObject('Checkout Page/continue_btn'))

WebUI.verifyElementPresent(findTestObject('Checkout Page/Checkout Transaction/overview_page'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Checkout Page/Checkout Transaction/finish_btn'))

WebUI.scrollToElement(findTestObject('Checkout Page/Checkout Transaction/checkout_complete'), 0)

WebUI.verifyTextPresent('THANK YOU FOR YOUR ORDER', false)

