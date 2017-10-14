package com.optum.synergy.reference.api.stepDefinations;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Assert;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetMemberInfoStepDefination {

	private Response response;
	private RequestSpecification request;

	@Given("^Member exists with HSID as \"([^\"]*)\"$")
	public void member_exists_with_HSID_as(String hsid)   {
		request = (RequestSpecification) given().relaxedHTTPSValidation().header("hsid", hsid).log().all()
				.contentType(ContentType.JSON);
		System.out.println("HSID Data which is coming from Example table is " + hsid);
	}

	@When("^User retrieves member info as Json using endpont$")
	public void user_retrieves_member_info_as_Json_using_endpont()   {
		response = request.when()
				.get("https://tst-phs-services-np.ose-ctc-core.optum.com/phs/services/v1.0/secure/user");
	}

	@Then("^Response contains success message$")
	public void response_contains_success_message()   {
		System.out.println("Response code is >>>" + response.getStatusCode());
		Assert.assertEquals(200, response.getStatusCode());
	}

	@Then("^Response contains Name as \"([^\"]*)\"$")
	public void response_contains_Name_as(String name)   {
		System.out.println("Data which is coming from Example table is " + name);
		Assert.assertTrue("Name is not maching as per Feature", response.asString().contains(name));
		// System.out.println(response.);
	}

	@Then("^Response contains Phone number$")
	public void response_contains_Phone_number() throws Throwable {

	}

	@Then("^Response contains contains phone Type$")
	public void response_contains_contains_phone_Type() throws Throwable {

	}

}
