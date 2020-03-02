package com.api.tests;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import javafx.scene.shape.QuadCurve;

import static io.restassured.RestAssured.*;
public class GETCallAPI {

	//BDD Aproach
	@Test(priority=1, enabled=false)
	public void getUserAPITest(){
		
		RestAssured.baseURI = "https://gorest.co.in";
		given().log().all()
		.contentType("application/json")
		.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk")
		.when().log().all()
		.get("/public-api/users")
		.then().log().all()
		.statusCode(200)
		.and()
		.header("server", "nginx")
		.header("X-Rate-Limit-Limit", "30");
		
		
	}
	@Test(priority=2, enabled=false)
	public void getSingleUserAPITest(){
		
		RestAssured.baseURI = "https://gorest.co.in";
		given().log().all()
		.contentType("application/json")
		.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk")
		.when().log().all()
		.get("/public-api/users?first_name=Maureen")
		.then().log().all()
		.statusCode(200)
		.and()
		.header("server", "nginx")
		.header("X-Rate-Limit-Limit", "30");
		
		
	}
	@Test(priority=3, enabled=true)
	public void getUserWithQueryAPITest(){
		
		RestAssured.baseURI = "https://gorest.co.in";
		given().log().all()
		.contentType("application/json")
		.header("Authorization", "Bearer 6BLyibXlLeDEBnxBAXTtuU6897eu0r45Z6dk")
		.queryParam("first_name", "Maureen")
		.queryParam("gender", "female")
		.queryParam("status", "active")
		.when().log().all()
		.get("/public-api/users")
		.then().log().all()
		.statusCode(200)
		.and()
		.header("server", "nginx")
		.header("X-Rate-Limit-Limit", "30");
		
		
	}
}
