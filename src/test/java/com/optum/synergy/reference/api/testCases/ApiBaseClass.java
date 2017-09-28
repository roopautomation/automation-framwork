package com.optum.synergy.reference.api.testCases;

import static com.jayway.restassured.RestAssured.*;

import org.junit.BeforeClass;
public class ApiBaseClass {
	
	@BeforeClass
	public void setUpURL(){
		baseURI="https://tst-phs-services-np.ose-ctc-core.optum.com";
		basePath="/phs/services/v1.0/secure/user";
		
	}

}
