public class Einkaufswagen {
	public static void main(String args[]) {
		int[] reihe = {3, 14, 15, 9, 2} // 5 Reihen von Einkaufswagen.


		// Der folgende Code gibt die Reihen aus: 
		for(int i = 0; i<reihe.length; i++) {
			for(int j = 0; j < reihe[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
