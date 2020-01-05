
public class TeamDemoSwapChar {

	public static void main(String[] args) {
	}
		public static String teamDemo(String str) {
			int strLength = str.length();
			char lastCharacter = str.charAt(strLength -1);
			char secToLastCharacter = str.charAt(strLength -2);
			
			return "" + lastCharacter + secToLastCharacter;

	}

}
