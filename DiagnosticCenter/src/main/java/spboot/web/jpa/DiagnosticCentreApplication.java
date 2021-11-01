package spboot.web.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EntityScan(basePackages = "spboot.web.jpa")
@SpringBootApplication
@EnableSwagger2
public class DiagnosticCentreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagnosticCentreApplication.class, args);
	}

	@Bean
	public Docket generateApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("spboot.web.jpa")).build();
	}
}
