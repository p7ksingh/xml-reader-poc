package com.example;

import java.io.IOException;

import com.example.model.Configuration;
import com.example.util.XmlUtil;

public class App 
{
  public static void main(String[] args)  {
	try {
		Configuration config = XmlUtil.getConfiguration("config.xml");
		
		System.out.println("Application Name : "+config.getApplication().getName());
	     System.out.println("Application version :"+config.getApplication().getVersion());
	
	config.getApplication().getSettings().forEach(
			setting -> System.out.println(
					"Setting : "+setting.getName() +" = "+setting.getValue()));
	
	config.getModules().forEach(
			
			module -> 
			{
			System.out.println("Module Id :"+ module.getId());
			System.out.println("Module name :"+module.getName());
			
			module.getParameters().forEach(
					parameter ->{
					System.out.println("parameter :"+parameter.getKey()+" = "+parameter.getValue());
					System.out.println("=================");
					});
			});
	
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
}
}
