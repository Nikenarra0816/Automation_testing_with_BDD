package area
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



class area {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login area username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty area")
	def AddArea() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Area/submenu-area'))
		WebUI.click(findTestObject('Manage Data/Area/button-add_area'))
	}

	@Then("I click button save empty area")
	def Save() {
		WebUI.click(findTestObject('Manage Data/Area/button-save'))
		WebUI.click(findTestObject('Manage Data/Area/button-oke_empty'))
	}

	@When("I click add data area")
	def AddDataArea() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Area/submenu-area'))
		WebUI.click(findTestObject('Manage Data/Area/button-add_area'))
	}

	@Then("I click button cancel area")
	def CancelArea() {
		WebUI.click(findTestObject('Manage Data/Area/button-cancel'))
	}

	@When("I add new data area")
	def AddNewArea() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Area/submenu-area'))
		WebUI.click(findTestObject('Manage Data/Area/button-add_area'))
		def Codearea = '' + GlobalVariable.RandomNumber
		WebUI.setText(findTestObject('Manage Data/Area/input-areacode'), Codearea)
		WebUI.setText(findTestObject('Manage Data/Area/input-areaname'), 'Jogja Baru')
		WebUI.setText(findTestObject('Manage Data/Area/input-area_address'), 'Jl Jogja No 38')
		WebUI.setText(findTestObject('Manage Data/Area/input-latitude'), '7°35\'19.0"S 111°588\'29.8"E')
		WebUI.setText(findTestObject('Manage Data/Area/input-longitude'), '8°45\'11.0"S 111°22\'11.1"E')
		WebUI.setText(findTestObject('Manage Data/Area/input-telepon'), '0851567786111')
		WebUI.setText(findTestObject('Manage Data/Area/input-pimpinan'), 'Gunawan S')
		WebUI.setText(findTestObject('Manage Data/Area/input-jumlah_karyawan'), '55')
		WebUI.setText(findTestObject('Manage Data/Area/input-luas_lahan'), '60')
	}

	@Then("I click button save area")
	def SaveRegisArea() {
		WebUI.click(findTestObject('Manage Data/Area/button-save'))
		WebUI.click(findTestObject('Manage Data/Area/button-oke_success'))
	}

	@When("I add data registered area")
	def AddDataRegisteredArea() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Area/submenu-area'))
		WebUI.click(findTestObject('Manage Data/Area/button-add_area'))
		WebUI.setText(findTestObject('Manage Data/Area/input-areacode'), '687')
		WebUI.setText(findTestObject('Manage Data/Area/input-areaname'), 'Sidoarjo')
		WebUI.setText(findTestObject('Manage Data/Area/input-area_address'), 'Jl Sidoarjo No 31')
		WebUI.setText(findTestObject('Manage Data/Area/input-latitude'), '7°35\'18.0"S 111°53\'29.8"E')
		WebUI.setText(findTestObject('Manage Data/Area/input-longitude'), '8°45\'15.0"S 111°22\'11.1"E')
		WebUI.setText(findTestObject('Manage Data/Area/input-telepon'), '085156755614')
		WebUI.setText(findTestObject('Manage Data/Area/input-pimpinan'), 'Fahrul')
		WebUI.setText(findTestObject('Manage Data/Area/input-jumlah_karyawan'), '25')
		WebUI.setText(findTestObject('Manage Data/Area/input-luas_lahan'), '50')
	}

	@Then("I click button save registered area")
	def SaveRegisteresArea() {
		WebUI.click(findTestObject('Manage Data/Area/button-save'))
		WebUI.click(findTestObject('Manage Data/Area/button-okeregisterd'))
	}

	@When("I click button edit and edit data area")
	def ClickEditArea() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Area/submenu-area'))
		WebUI.click(findTestObject('Manage Data/Area/button-option_edit'))
		WebUI.clearText(findTestObject('Manage Data/Area/input-areaname'))
		WebUI.setText(findTestObject('Manage Data/Area/input-areaname'), 'Palembang')
	}

	@Then("I click button save edit area")
	def SaveEditArea() {
		WebUI.click(findTestObject('Manage Data/Area/button-klikedit'))
		WebUI.click(findTestObject('Manage Data/Area/button-ok_successedit'))
	}
}