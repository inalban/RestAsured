package com.api.tests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTCallAPI {

	@Test
	public void createUserWithPOSTTest(){
		
		RestAssured.baseURI= "https://gorest.co.in";
		RequestSpecification request=RestAssured.given().log().all();
		request.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk");
		
		request.contentType("application/jason");
		
		File file=new File("/Users/user/Documents/workspace/RestAssuredTesting/src/test"
				+ "/java/com/api/tests/createuser.json");
		request.body(file);
		
		Response response=request.post("/public-api/users");
		
		System.out.println(response.prettyPrint());
		
		
		
		
		
	}
}
