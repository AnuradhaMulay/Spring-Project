package com.yash.pojo;

public class DriverClass {
	private String driverClassName;
	private String url;
	private String user;
	private String password;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void getValues(){
		System.out.println("driverClassName = "+driverClassName);
		System.out.println("url = "+url);
		System.out.println("user = "+user);
		System.out.println("password = "+password);
		
	}

}
