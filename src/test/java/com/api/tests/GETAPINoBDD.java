package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETAPINoBDD {

	@Test
	public void getUserAPITest(){
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request= RestAssured.given().log().all();
		request.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk");
		
		Response response= request.get("public-api/users");
		System.out.println(response.asString());//to print all result in Json
		System.out.println(response.prettyPrint());//to print on the consol appropirate format
		
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		String server=response.getHeader("Server");
		Assert.assertEquals(server, "nginx");
		
	}
	@Test
	public void getUserByParamsTest(){
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request= RestAssured.given().log().all();
		request.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk");
		request.queryParam("first_name", "Judah");
		request.queryParam("status", "active");
		
		Response response= request.get("public-api/users");
		System.out.println(response.asString());//to print all result in Json
		System.out.println(response.prettyPrint());//to print on the consol appropirate format
		
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		String server=response.getHeader("Server");
		Assert.assertEquals(server, "nginx");
	}
}
