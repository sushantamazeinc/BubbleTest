package com.bs.pageobjects;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class EntityAsString {
    public static void main(String[] args) {
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://api2.getmybubble.io/fetch1?data_category=PacLifeRiskClass&dget1=5&dget2=0&dget3=4ft%209inch&dget4=215");

        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();

            // Read the contents of an entity and return it as a String.
            String content = EntityUtils.toString(entity);
            String x= content.replace("{\"output\":\"{\\\"id\\\":\\\"0\\\",\\\"dput1\\\":\\\"", " ");
        	
        	String z=x.replace("\\\"}\"}", " ");
        	System.out.println(z);
            //System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
