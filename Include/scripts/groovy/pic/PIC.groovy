package pic
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



class PIC {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login pic username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty pic")
	def AddNewsletter() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/PIC/submenu-pic'))
		WebUI.click(findTestObject('Manage Data/PIC/button-add_pic'))
	}

	@Then("I click button save empty pic")
	def Save() {
		WebUI.click(findTestObject('Manage Data/PIC/button-save'))
		WebUI.click(findTestObject('Manage Data/PIC/button-empty'))
	}
	
	@When("I click add data pic")
	def ClickAdd() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/PIC/submenu-pic'))
		WebUI.click(findTestObject('Manage Data/PIC/button-add_pic'))
	}
	
	@Then("I click button cancel pic")
	def Cancel() {
		WebUI.click(findTestObject('Manage Data/PIC/button-cancel'))
	}
}