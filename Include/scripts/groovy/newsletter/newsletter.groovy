package newsletter
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



class newsletter {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login newsletter username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty newsletter")
	def AddNewsletter() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Newsletter/submenu-newsletter'))
		WebUI.click(findTestObject('Manage Data/Newsletter/button-addnewsletter'))
	}

	@Then("I click button save empty newsletter")
	def Save() {
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-save'))
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-oke_empty'))
	}

	@When("I click add data newsletter")
	def ClickAdd() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Newsletter/submenu-newsletter'))
		WebUI.click(findTestObject('Manage Data/Newsletter/button-addnewsletter'))
	}

	@Then("I click button cancel newsletter")
	def Cancel() {
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-cancel'))
	}

	@When("I add new data newsletter")
	def ClickNewData() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Newsletter/submenu-newsletter'))
		WebUI.click(findTestObject('Manage Data/Newsletter/button-addnewsletter'))
		WebUI.setText(findTestObject('Manage Data/Newsletter/input-title_newsletter'), 'News Feature')
		WebUI.setText(findTestObject('Manage Data/Newsletter/input-content'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea')
		WebUI.click(findTestObject('Manage Data/Newsletter/checklist-publish'))
		WebUI.uploadFile(findTestObject('Manage Data/Newsletter/upload-img'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyImage\\file.jpeg')
	}

	@Then("I click button save newsletter")
	def SaveNewsletter() {
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-save'))
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-okesukses'))
	}

	@When("I click button edit and edit newsletter")
	def ClickEdit() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Newsletter/submenu-newsletter'))
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-option_edit'))
		WebUI.clearText(findTestObject('Manage Data/Newsletter/input-title_newsletter'))
		WebUI.setText(findTestObject('Manage Data/Newsletter/input-title_newsletter'), 'News Wording')
	}

	@Then("I click button save edit newsletter")
	def SaveEditNewsletter() {
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-edit'))
		WebUI.click(findTestObject('Manage Data/Newsletter/btn-oke_edit'))
	}
}