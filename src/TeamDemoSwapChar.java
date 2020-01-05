
public class TeamDemoSwapChar {

	public static void main(String[] args) {
	}
		public static String teamDemo(String str) {
			int strLength = str.length();
			if (str.length() == 0) {
				return str;
			}
			char lastCharacter = str.charAt(strLength -1);
			char secToLastCharacter = str.charAt(strLength -2);
			
			return "" + str.substring(0,2) + lastCharacter + secToLastCharacter;

	}

}
