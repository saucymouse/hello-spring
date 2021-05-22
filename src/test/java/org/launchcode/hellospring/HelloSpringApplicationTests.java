package org.launchcode.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.launchcode.hellospring.controllers.HelloController;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.launchcode.hellospring.controllers.HelloController.createMessage;

@SpringBootTest
class HelloSpringApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createMessageWorks() {
		String expected = "Saluton, Will";
		String actual = createMessage("esperanto", "Will");
		assertTrue(expected.equals(actual));
	}

}
