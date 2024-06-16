package com.example.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;



public class Configuration {
	
	private Application application;
	
	@JacksonXmlElementWrapper(localName = "modules")
	@JacksonXmlProperty(localName = "module")
	private List<Module> modules;
	
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}


}
