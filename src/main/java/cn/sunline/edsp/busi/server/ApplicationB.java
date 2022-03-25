package cn.sunline.edsp.busi.server;

import cn.sunline.adp.boot.cedar.CedarMain;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *Online management segment startup class
 * @author liangjiaming
 */
public class ApplicationB 
{
	public static void main(String[] args) 
	{
		// Default configuration specification
		System.setProperty("ltts.vmid", "onlserver");
		System.setProperty("ltts.home", System.getProperty("user.dir"));
		System.setProperty("ltts.log.home", "logs");
		System.setProperty("log4j.configurationFile", "log4j2.xml");
		// i18n
		System.setProperty("i18n.enable", "true");
		System.setProperty("i18n.conf", "en");
		System.setProperty("env", "DEV");
		System.setProperty("apollo.configService", "http://10.22.4.79:8080");
		//start up
		CedarMain.main(args);
	}
}
