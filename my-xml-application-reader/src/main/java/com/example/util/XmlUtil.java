package com.example.util;

import java.io.IOException;
import java.io.InputStream;

import com.example.model.Configuration;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlUtil {
	
	private static final XmlMapper XML_MAPPER = new XmlMapper();
	
	public static Configuration getConfiguration(String fileName) throws  IOException {
		
		try(InputStream inputStream = XmlUtil.class.getClassLoader().getResourceAsStream(fileName)){
			
		if(inputStream == null) {
			throw new IllegalStateException("File not found" +fileName);
		}
	
	return	XML_MAPPER.readValue(inputStream, Configuration.class);
	
	}
	}
}
