package com.example.springboot;


import org.springframework.boot.Banner;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringbootApplication {
	public static void main(String[] args) {
		   SpringApplication bootstrap = new SpringApplication(SpringbootApplication.class);
		   bootstrap.setBanner(new ResourceBanner(new ClassPathResource("banner.txt")));
	        bootstrap.setBannerMode(Banner.Mode.CONSOLE);
	        // 其他定制设置...
	        bootstrap.run(args);	}

}
