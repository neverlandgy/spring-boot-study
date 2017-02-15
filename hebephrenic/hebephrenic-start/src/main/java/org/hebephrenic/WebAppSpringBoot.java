package org.hebephrenic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
// @ComponentScan(basePackages={"org.hebephrenic.common","org.hebephrenic.portal"})
// @SpringBootApplication 包含向下扫描
// @ImportResource("classpath:applicationContext.xml") // 优先使用Java config
public class WebAppSpringBoot extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebAppSpringBoot.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebAppSpringBoot.class, args);
		
//		new SpringApplicationBuilder()
//				.sources(WebAppSpringBoot.class)
//				.addCommandLineProperties(false)
//				.web(true)
////				.banner(new ResourceBanner(new ClassPathResource("banner.txt")))// 默认加载banner.txt
//				.run(args);

	}
}
