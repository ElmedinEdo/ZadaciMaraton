import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ImenaIOstvarenoVrijeme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Napisati program koji prolazi kroz fajl maraton.txt, a zatim ispisuje
		// imena ucesnika i njihova vremena sortirane prema vremenu koje su ostvarili od
		// najmanjeg prema najvecem.

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite ime fajla: ");

		try {

			String sourceFile = input.nextLine();

			File sFile = new File(sourceFile + ".txt");
			najboljeVrijeme(sFile);

		} catch (Exception ex) {
			System.out.println("Pogresno ime fajla! ");

		}

		input.close();
	}

	public static void najboljeVrijeme(File sourceFile) throws IOException {

		Scanner input = new Scanner(sourceFile);

		int[] rezultat = new int[25];

		int i = 0;

		while (input.hasNextLine()) {

			String s = input.nextLine();

			String[] list = s.split(" ");

			rezultat[i] = Integer.parseInt(list[1]);

			i++;

		}

		rezultat = Arrays.copyOfRange(rezultat, 0, i);

		Arrays.sort(rezultat);

		System.out.println("Poredak takmicara: " + " ");

		for (i = 0; i < rezultat.length; i++) {

			input = new Scanner(sourceFile);

			boolean found = false;

			do {

				String s = input.nextLine();

				String[] list = s.split(" ");

				if (Integer.parseInt(list[1]) == rezultat[i]) {

					System.out.println((i + 1) + "." + list[0] + ":" + list[1]);

					found = true;
				}

			} while (found == false);
		}
		input.close();
	}

}
