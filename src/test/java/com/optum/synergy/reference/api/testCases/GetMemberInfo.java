package com.optum.synergy.reference.api.testCases;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.ResponseSpecificationImpl.HamcrestAssertionClosure;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GetMemberInfo 
{

	@Test
	public void test1()
	{
		
	 Response code= given().relaxedHTTPSValidation()
			 .header("hsid", "1040285b-203f-4bfd-b7cb-7968e2456c8a")
			 .log().all().contentType(ContentType.JSON)
			 .get("https://tst-phs-services-np.ose-ctc-core.optum.com/phs/services/v1.0/secure/user");
	 
	 System.out.println("Response code is "+code.getStatusCode());
	 
	 Assert.assertEquals(200, code.getStatusCode());
	 
	 String data=code.asString();
	 
	 
	 
	 boolean status=data.contains("Point");
 
	 Assert.assertTrue(status);
		
	}
	
	@Test
	public void test2()
	{
		
	 Response code= given().relaxedHTTPSValidation()
			 .header("hsid", "1040285b-203f-4bfd-b7cb-7968e2456c8a")
			 .log().all().contentType(ContentType.JSON)
			 .get("https://tst-phs-services-np.ose-ctc-core.optum.com/phs/services/v1.0/secure/user");
	
	 code.then().body("lastName", equalTo("Jalio"));
	 code.then().body("", equalTo(""));
		
	}
	
}
