package com.optum.synergy.reference.api.testCases;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.ResponseSpecificationImpl.HamcrestAssertionClosure;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class UpdatePhoneAndType 
{

	@Test
	public void test1()
	{
		String body="{\"preferredPhoneNumber\": \"1212333333\",\"preferredPhoneType\": \"Work\"}";
	 Response response= given().relaxedHTTPSValidation()
			 .header("hsid", "1040285b-203f-4bfd-b7cb-7968e2456c8a")
			 .log().all().contentType(ContentType.JSON)
			 .body(body)
			 .post("https://tst-phs-services-np.ose-ctc-core.optum.com/phs/services/v1.0/secure/user/preferredPhone")
	         .then().extract().response();
	 System.out.println("Response  is "+response.asString());
	 
	 
		
	}
	
	@Test
	public void test2()
	{
		
	 Response code= given().relaxedHTTPSValidation()
			 .header("hsid", "1040285b-203f-4bfd-b7cb-7968e2456c8a")
			 .log().all().contentType(ContentType.JSON)
			 .get("https://tst-phs-services-np.ose-ctc-core.optum.com/phs/services/v1.0/secure/user");
	
	 code.then().body("preferredPhoneType", equalTo("Work"));
	 code.then().body("preferredPhoneNumber", equalTo("1212333333"));
		
	}
	
}
