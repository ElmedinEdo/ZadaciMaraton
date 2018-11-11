import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class NajboljiMaratonci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. Napisati program koji prolazi kroz fajl maraton.txt, pronalazi ucesnike
		// koji su zavrsili maraton za manje od 300 minuta, zatim sprema
		// njihova imena i vrijeme u novi fajl pod nazivom najboljiMaratonci.txt

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite ime fajla: ");

		try {

			String file = input.nextLine();

			File sourceFile = new File(file + ".txt");
			maratonci(sourceFile);

		} catch (Exception ex) {
			System.out.println("Pogresno ime fajla! ");

		}

		input.close();
	}

	public static void maratonci(File sourceFile) throws IOException {

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

		File create = new File("najboljiMaratonci.txt");
		create.createNewFile();

		PrintWriter writer = new PrintWriter(new FileWriter(create));

		for (i = 0; i < rezultat.length; i++) {

			input = new Scanner(System.in);

			input = new Scanner(sourceFile);

			boolean found = false;

			do {

				String s = input.nextLine();

				String[] list = s.split(" ");

				if (rezultat[i] < 300) {

					if (Integer.parseInt(list[1]) == rezultat[i]) {

						System.out.println((i + 1) + "." + list[0] + ": " + list[1]);

						writer.write(list[0] + " " + list[1]);

						writer.println("");

						found = true;
					}

				} else {

					break;
				}
			} while (found == false);
		}

		writer.close();
	}

}
