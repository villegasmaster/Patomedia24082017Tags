package org.patomediatags.configuration;

import java.io.IOException;
import java.util.Properties;

public class PropertiesConf {
	
	// ASI ES LA LLAMADA: Configuration.getInstance().getProperty(Configuration.DATABASE_SERVER)
	
	 Properties properties = null;
	 
	 /** Configuration file name */
	    public final static String CONFIG_FILE_NAME = "macros.properties";

	private PropertiesConf() {
        this.properties = new Properties();
        try {
            properties.load(PropertiesConf.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//Configuration
 
    /**
     * Implementando Singleton
     *
     * @return
     */
    public static PropertiesConf getInstance() {
        return ConfigurationHolder.INSTANCE;
    }
 
    private static class ConfigurationHolder {
 
        private static final PropertiesConf INSTANCE = new PropertiesConf();
    }
 
    /**
     * Retorna la propiedad de configuración solicitada
     *
     * @param key
     * @return
     */
    public String getProperty(String ads, String type) {
    	String key = ads + "." + type;
        return this.properties.getProperty(key);
    }//getProperty
}

