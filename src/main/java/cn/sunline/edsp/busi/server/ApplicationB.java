package cn.sunline.edsp.busi.server;

import cn.sunline.adp.boot.cedar.CedarMain;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Online management segment startup class
 *
 * @author liangjiaming
 */
public class ApplicationB {
    public static void main(String[] args) {
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
        //指定启动工程的配置文件。部署时可以用运行命令修改。Java -jar spring.profiles.active = XXX
        System.setProperty("spring.profiles.active", "local");
        //start up
        CedarMain.main(args);
        //=======================================测试是否拿到bootstrap.yml配置====================================================================
        Properties properties = null;
        try {
            properties = PropertiesLoaderUtils.loadAllProperties("bootstrap.yml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("[bootstrap.yml]dashboard的配置是：" + properties.getProperty("dashboard"));

    }
}
