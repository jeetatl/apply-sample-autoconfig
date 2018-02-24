package com.jeetatl.samples.spring.applysampleautoconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplySampleAutoconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplySampleAutoconfigApplication.class, args);
	}

	@Bean
	public Object getObj(@Qualifier("sampleProp2") Integer integer) {

		System.out.println(integer);
		return integer;
	}

	@Bean
	public Object getObj2(@Qualifier("sampleProp1") String str) {
		System.out.println(str);
		return str;
	}
}
