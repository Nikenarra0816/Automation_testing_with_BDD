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

WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : 'gdsechead', ('password') : '123qwe*'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tender/menu-tender'))

WebUI.click(findTestObject('Tender/button-add-vendor'))

WebUI.setText(findTestObject('Tender/field-namakontraktor'), namaKontraktor)

WebUI.setText(findTestObject('Tender/field-vendorpic'), vendorPIC)

WebUI.setText(findTestObject('Tender/field-email'), email)

WebUI.setText(findTestObject('Tender/field-alamatkantor'), 'Jakarta')

WebUI.setText(findTestObject('Tender/field-telepon'), '087676554453')

WebUI.setText(findTestObject('Tender/field-namavendorttd'), 'Gilang')

WebUI.setText(findTestObject('Tender/field-jabatanvendorttd'), 'SPV')

WebUI.click(findTestObject('Tender/button-save'))

WebUI.click(findTestObject('Tender/button-ok tender'))

WebUI.click(findTestObject('Tender/button-okkosong'))

WebUI.click(findTestObject('Tender/button-cancel'))

WebUI.click(findTestObject('Tender/button-ok terdaftar'))

WebUI.click(findTestObject('Tender/button-option'))

WebUI.click(findTestObject('Tender/option-detail'))

WebUI.click(findTestObject('Tender/detail-project'))

WebUI.click(findTestObject('Tender/button-downloadcontract'))

WebUI.click(findTestObject('Tender/button-canceldetail'))

