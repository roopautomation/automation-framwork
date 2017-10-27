package com.optum.synergy.reference.api.testCases;

import org.hamcrest.core.Is;
import org.json.JSONObject;
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
	public void test1(){
		 // use org.json JSONObject to define your json
		   JSONObject jsonObj = new JSONObject()
				                     .put("emailOptFlg","1")
				                     .put("preferredEmail", "automation@test.env")
		                             .put("preferredPhoneNumber","1212333333")
		                             .put("preferredPhoneType","Home");

		
		//String body="{\"preferredPhoneNumber\": \"1212333333\",\"preferredPhoneType\": \"Work\"}";
	 Response response= given().relaxedHTTPSValidation()
			 .header("hsid", "1040285b-203f-4bfd-b7cb-7968e2456c8a")
			 .log().all().contentType(ContentType.JSON)
			 .body(jsonObj.toString())
			 .post("https://tst-phs-services-np.ose-ctc-core.optum.com/phs/services/v1.0/secure/user/preferredcontact")
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
	
	 code.then().body("preferredPhoneType", equalTo("Home"));
	 code.then().body("preferredPhoneNumber", equalTo("1212333333"));
	 code.then().body("emailOptFlg", equalTo("1"));
	 code.then().body("emailAddress", equalTo("automation@test.env"));
		
	}
	
}
