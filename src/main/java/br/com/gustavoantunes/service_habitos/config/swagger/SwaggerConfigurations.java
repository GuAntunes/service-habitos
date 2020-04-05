package br.com.gustavoantunes.service_habitos.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 
 * @author gustavo
 * {@link http://localhost:8080/swagger-ui.html}
 */
@Configuration
public class SwaggerConfigurations {

	@Bean
	public Docket forumApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.gustavoantunes.service_habitos"))
				.paths(PathSelectors.ant("/**")).build();
	}
}
