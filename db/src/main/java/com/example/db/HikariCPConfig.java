package com.example.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPConfig {

	
	private static HikariDataSource dataSource;
	
	public HikariCPConfig() {
	}
		public static void configurationInit() {
			ConfigurationFileReader configReader =new ConfigurationFileReader();
			HikariConfig config =new HikariConfig();
			config.setJdbcUrl(configReader.getProperty("db.url"));
			config.setJdbcUrl(configReader.getProperty("db.username"));
			config.setJdbcUrl(configReader.getProperty("db.password"));
			
			config.addDataSourceProperty("cachePrepStms", "true");
			//Broj na karakteri na statement-ot
			config.addDataSourceProperty("prepStmsSize", "200");
			config.addDataSourceProperty("prepStmsCacheSqlLimit", "2048");
			
			datasourse = new HikariDataSource(config);
		}
}
