package com.api.tests;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETECallAPI {
	@Test
	public void deleteUserWithPOSTTest(){
		
		RestAssured.baseURI= "https://gorest.co.in";
		RequestSpecification request=RestAssured.given().log().all();
		request.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk");
		
		Response response=request.delete("/public-api/users/5");
		
		System.out.println(response.prettyPrint());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		JsonPath js=response.jsonPath();
		System.out.println(js.get("result"));
		Assert.assertNull(js.get("result"));
		
		
		
		
	}
}
