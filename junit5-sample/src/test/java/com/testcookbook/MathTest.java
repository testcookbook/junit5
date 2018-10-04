package com.testcookbook;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathTest {
	
	@Test
	public void addingNumbers() {
		Math m = new Math();
		assertEquals(m.Add(2, 3), 5);
	}

}