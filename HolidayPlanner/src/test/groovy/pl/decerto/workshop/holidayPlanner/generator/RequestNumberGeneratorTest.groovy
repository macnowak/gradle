package pl.decerto.workshop.holidayPlanner.generator

import spock.lang.Specification

import java.time.LocalDateTime

class RequestNumberGeneratorTest extends Specification {

	def "should generate number that contains current month"() {
		expect:
		RequestNumberGenerator.generate().contains(String.valueOf(LocalDateTime.now().getMonth().getValue()));

	}

}
