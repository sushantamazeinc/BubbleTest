package com.bs.testCases;

public class abcd {
public static void main(String[] args) {
	String a="{\"output\":\"{\\\"id\\\":\\\"0\\\",\\\"dput1\\\":\\\"Standard Tobacco\\\"}\"}";
	System.out.println(a);
	
	String x= a.replace("{\"output\":\"{\\\"id\\\":\\\"0\\\",\\\"dput1\\\":\\\"", " ");
	
	String z=x.replace("\\\"}\"}", " ");
	System.out.println(z);
//	System.out.println(y);
//	String y=a.replace("/","vvv");
//	System.out.println(x);
//	System.out.println(y);
}
}
