package pl.decerto.workshop.holidayPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("pl.decerto.workshop.holidayPlanner")
public class HolidayPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidayPlannerApplication.class, args);
	}
}
