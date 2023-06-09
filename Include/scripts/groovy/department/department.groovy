package department
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class department {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login department username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty department")
	def AddDepartement() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Department/submenu-department'))
		WebUI.click(findTestObject('Manage Data/Department/button-adddepartment'))
	}

	@Then("I click button save empty departement")
	def Save() {
		WebUI.click(findTestObject('Manage Data/Department/button-savedepartement'))
		WebUI.click(findTestObject('Manage Data/Department/button-okewajibisi'))
	}

	@When("I click add data departement")
	def AddDepart() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Department/submenu-department'))
		WebUI.click(findTestObject('Manage Data/Department/button-adddepartment'))
	}

	@Then("I click button cancel departement")
	def CancelDepart() {
		WebUI.click(findTestObject('Manage Data/Department/button-canceldepartment'))
	}

	@When("I add new data departement")
	def AddNewDepart() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Department/submenu-department'))
		WebUI.click(findTestObject('Manage Data/Department/button-adddepartment'))
		def departement_name = 'Departement_'+ GlobalVariable.RandomNumber
		WebUI.setText(findTestObject('Manage Data/Department/field-department'), departement_name)
	}

	@Then("I click button save departement")
	def SaveDepart() {
		WebUI.click(findTestObject('Manage Data/Department/button-savedepartement'))
		WebUI.click(findTestObject('Manage Data/Department/button-okeberhasil'))
	}

	@When("I add data registered departement")
	def AddDataRegisDepart() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Department/submenu-department'))
		WebUI.click(findTestObject('Manage Data/Department/button-adddepartment'))
		WebUI.setText(findTestObject('Manage Data/Department/field-department'), 'Sales')
	}

	@Then("I click button save registered departement")
	def Saveregistered() {
		WebUI.click(findTestObject('Manage Data/Department/button-savedepartement'))
		WebUI.click(findTestObject('Manage Data/Department/button-oketerdaftar'))
	}

	@When("I click button edit and edit data department")
	def ClickEdit() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Department/submenu-department'))
		WebUI.click(findTestObject('Manage Data/Department/button-editdepartment'))
		WebUI.clearText(findTestObject('Manage Data/Department/field-department'))
		WebUI.setText(findTestObject('Manage Data/Department/field-department'), 'GA Sys 2')
	}

	@Then("I click button save edit department")
	def Saveedit() {
		WebUI.click(findTestObject('Manage Data/Department/button-editpopupdepart'))
		WebUI.click(findTestObject('Manage Data/Department/button-ok_success_edit'))
	}
}