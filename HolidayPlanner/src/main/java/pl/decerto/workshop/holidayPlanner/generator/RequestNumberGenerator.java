package pl.decerto.workshop.holidayPlanner.generator;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class RequestNumberGenerator {

	public static String generate() {
		LocalDateTime now = LocalDateTime.now();
		return new StringJoiner("/").add(String.valueOf(now.getDayOfMonth())).add(String.valueOf(now.getMonth().getValue())).toString();
	}
}
