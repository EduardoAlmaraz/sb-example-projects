package com.vault.example.vaultpropertiesmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.vault.example.config.AppProperties;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigurationProperties(value = {AppProperties.class})
@Slf4j
public class VaultPropertiesMapApplication implements CommandLineRunner {

	@Autowired
	AppProperties appProperties;

	public static void main(String[] args) {
		SpringApplication.run(VaultPropertiesMapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// imprimiendo Foo
		log.info(appProperties.getFoo());

		// imprimiendo valores de Bar
		appProperties.getBar().forEach((k,v) -> log.info("llave: {} > valor: {}", k, v));
		
	}

}
