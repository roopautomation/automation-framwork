package com.optum.synergy.reference.api.stepDefinations;

import static com.jayway.restassured.RestAssured.*;

import org.junit.BeforeClass;

public class ApiBaseClass {
	
	@BeforeClass
	public static void setUpURL(){
		baseURI="https://tst-phs-services-np.ose-ctc-core.optum.com";
		basePath="/phs/services/v1.0/secure/user";
		
	}

}
