package com.bs.testCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest {

 
@Test
 public void getweatherDetails()
 {
	 
 
  //Specify base URI
  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
  
  //Request object
  RequestSpecification httpRequest=RestAssured.given();
  
  //Response object
  Response response=httpRequest.request(Method.GET,"/Hyderabad");
  
  //print response in console window
  
  String responseBody=response.getBody().asString();
  System.out.println("Response Body is:" +responseBody);
}
}