package com.zensar.productmanagement;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServletConfig implements
		WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	public void customize(ConfigurableServletWebServerFactory factory) {
		//factory.setPort(5000);
	}
}