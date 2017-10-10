package com.optum.synergy.reference.api.testCases;

import org.junit.Assert;

import com.jayway.restassured.http.ContentType;

public class ApiUtlity {

	public static void validateResponse(int actual) {

		Assert.assertEquals(200, actual);

	}

	public static void validateHeader(String header) {

	}

	public static void validateContent(String data) {

		Assert.assertTrue(!data.equals(null));
		
	}
	
	public static void validateContent(String actual,String expected) {

		Assert.assertEquals(expected, actual);
		
	}
	
	public static void validateJSONFormat(String type)
	{
		
		Assert.assertEquals(type, ContentType.JSON);
		
	}
	
	public static void validateXMLFormat(String type)
	{
		
		Assert.assertEquals(type, ContentType.XML);
		
	}
	
	

}
