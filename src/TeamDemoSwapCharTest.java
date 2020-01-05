import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeamDemoSwapCharTest {

	@Test
	void swapLast2Characters() {
		assertEquals("tema", TeamDemoSwapChar.teamDemo ("team"));
		//assertEquals("tema", TeamDemoSwapChar.teamDemo ("team"));
	
		
	}
	
	@Test
	void swapNoCharacters() {
		assertEquals("", TeamDemoSwapChar.teamDemo (""));
	
		
	}
	@Test
	void twoCharacters() {
		assertEquals("jt", TeamDemoSwapChar.teamDemo ("tj"));
	
		
	}
}
