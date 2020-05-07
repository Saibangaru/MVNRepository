package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {

		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}

	public String getUrl()

	{

		String url = pro.getProperty("url");
		return url;
	}

	public String getUname() {
		String username = pro.getProperty("username");
		return username;

	}

	public String getPassWord() {
		String userpassword = pro.getProperty("password");
		return userpassword;
	}

	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

}
