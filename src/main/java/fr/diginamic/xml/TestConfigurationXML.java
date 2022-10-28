package fr.diginamic.xml;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> basexml = new ArrayList<String>();
		Configurations configs = new Configurations(); 
		try {
		XMLConfiguration config = configs.xml("file.xml");
		String nomBase = config.getString("database[@nom]");
		String host = config.getString("database.host");
		basexml.add(config.getString("database.user"));
		System.out.println(nomBase);
		basexml.add(nomBase);
		basexml.add(host);
		for(String i : basexml) {
			System.out.println(i);
		}
		
		} catch (ConfigurationException e) {
		e.printStackTrace();
		}
		
	}

}
