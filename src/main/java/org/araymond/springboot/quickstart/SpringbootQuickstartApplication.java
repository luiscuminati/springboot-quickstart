package org.araymond.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Anthony on 14/05/2015.
 */
@SpringBootApplication
public class SpringbootQuickstartApplication {
	public static void main(String[] args) {
		SpringApplication.run(new Class[]{SpringbootQuickstartApplication.class, ARWebMvcConfigurerAdapter.class}, args);
	}
}
