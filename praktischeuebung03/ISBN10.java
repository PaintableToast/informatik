public class ISBN10 {
	public final static void main(String[] args) {
		// überprüfen ob max 9stellig
		while(args[0].length() > 9 ) {
				System.out.print("Bitte nutze eine 9stellige Zahl: ");
				args[0] = StdIn.readString();
		}
			
		// gewichtete Quersumme
		short weight_q = 0;
		for(byte i = 0; i < args[0].length(); i++)
			weight_q += (args[0].charAt(i) - 48) * (i + 1);
		System.out.println("gewichtete Quersumme " + weight_q);

		// Itierte Alternierende Quersumme.
		boolean value = true;
		String weight_string = String.valueOf(weight_q);
		byte output = 0;
		for(byte a = 0; a < weight_string.length(); a++) { // 1234 = 4 - 3 - 2 + 1
			final int number = weight_string.charAt(a);
			output += value ? number - 48 : ((number - 48) * (-1));
			value = !value;
		}
		// +11 Rechnen beim letzten
		while(output < 0)
			output += 11;

		// Output
		System.out.println("Die Prüfziffer ist " + output);
	}
}
