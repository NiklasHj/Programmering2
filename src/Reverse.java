import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) {

		String ord = "niklas";
		ArrayList<String> list = new ArrayList<String>();

		String resultat = reverseString(ord, ord.length() - 1, list);

		System.out.println(resultat);
	}

	public static String reverseString(String ord, int index, ArrayList<String> letters) {
		String result = "";

		String s = String.valueOf(ord.charAt(index));
		letters.add(s);

		if (index != 0) {
			reverseString(ord, --index, letters);
		}

		for (String bokstav : letters)
		{
			result += bokstav;
		}

		return result;
	}
}
