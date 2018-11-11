import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProsjecnoVrijemeUcesnikaMaratona {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// 4. Napisati program koji prolazi kroz fajl maraton.txt i ispisuje prosjecno
		// vrijeme koje je bilo potrebno ucesnicima da zavrse maraton.

		if (args.length != 1) {

			System.out.print("Argument nije pronaden. ");

			System.exit(0);
		}

		File sourceFile = new File(args[0]);

		if (!sourceFile.exists()) {

			System.out.println("Source file nije pronaden! ");

			System.exit(1);
		}

		int suma = 0;
		int i = 0;

		Scanner input = new Scanner(sourceFile);

		while (input.hasNextLine()) {

			String s = input.nextLine();

			String[] list = s.split(" ");

			i++;

			suma = suma + Integer.parseInt(list[1]);

		}
		System.out.println("Prosjecno vrijeme koje je bilo potrebno ucesnicima da zavrse maraton iznosi: ");
		System.out.println(suma / (double) i);

		input.close();
	}

}
