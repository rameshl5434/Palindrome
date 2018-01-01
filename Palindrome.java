import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter a String");
		String str = br.readLine();
		String revstring = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}
		System.out.println(revstring);

		if (revstring.equalsIgnoreCase(str)) {
			System.out.println("The string is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}