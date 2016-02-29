package pl.decerto.workshop.holidayPlanner.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import pl.decerto.workshop.holidayPlanner.generator.RequestNumberEnpoint;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(RequestNumberEnpoint.class);
	}



}
