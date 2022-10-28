package fr.diginamic.props;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TestConfigurationProps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> base = new ArrayList<String>();
		
		ResourceBundle properties = ResourceBundle.getBundle("application");
		base.add(properties.getString("database.url"));
		base.add(properties.getString("database.user"));
		base.add(properties.getString("database.password"));
		for(String i : base) {
			System.out.println(i);
		}
	}

}
