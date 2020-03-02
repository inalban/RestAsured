package com.api.tests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTCallAPI {

	@Test
	public void updateWithPUTTest(){
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request= RestAssured.given().log().all();
		request.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk");
		request.contentType("/public-api/users");
		
		File file=new File("/Users/user/Documents/workspace/APITesting/src/main/java/com/api/test/updateuser.json");
		
		request.body(file);
		Response response=request.put("/public-api/users/6");
		
		System.out.println(response.prettyPrint());
	}
}
