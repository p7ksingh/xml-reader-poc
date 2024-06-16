package com.example.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Application {
	
	private String name;
	private String version;
	
	@JacksonXmlElementWrapper(localName = "settings")
	@JacksonXmlProperty(localName = "setting")
	private List<Setting> settings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<Setting> getSettings() {
		return settings;
	}
	public void setSettings(List<Setting> settings) {
		this.settings = settings;
	}

}
