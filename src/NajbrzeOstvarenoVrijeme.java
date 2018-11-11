import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NajbrzeOstvarenoVrijeme {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// 1. Napisati program koji prolazi kroz fajl maraton.txt i ispisuje ime i
		// vrijeme ucesnika koji je najbrze istrcao maraton.

		if (args.length != 1) {

			System.out.print("Argument nije pronaden. ");

			System.exit(0);
		}

		File sourceFile = new File(args[0]);

		if (!sourceFile.exists()) {

			System.out.println("Source file nije pronaden! ");

			System.exit(1);
		}

		String ime = null;

		Scanner input = new Scanner(sourceFile);

		int min = Integer.MAX_VALUE;

		while (input.hasNextLine()) {

			String s = input.nextLine();

			String[] list = s.split(" ");

			if (Integer.parseInt(list[1]) < min) {

				min = Integer.parseInt(list[1]);

				ime = (list[0]);

			}
		}

		System.out.println("Ime i vrijeme ucesnika koji je najbrze istrcao maraton je: ");

		System.out.println(ime + ": " + min);

		input.close();

	}

}
