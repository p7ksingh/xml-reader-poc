package com.example.model;



import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlParser {

    public Configuration parseXml(String filePath) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(new File(filePath), Configuration.class);
    }
}
