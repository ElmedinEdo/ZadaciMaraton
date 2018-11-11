import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ImenaPoAbecedi {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// 7. Napisati program koji ucitava imena iz fajla imena.txt, a zatim ih
		// ispisuje sortirane po abecedi

		if (args.length != 1) {

			System.out.print("Argument nije pronaden. ");

			System.exit(0);
		}

		File sourceFile = new File(args[0]);

		if (!sourceFile.exists()) {

			System.out.println("Source file nije pronaden! ");

			System.exit(1);
		}

		Scanner input = new Scanner(sourceFile);

		ArrayList<String> sort = new ArrayList<String>();

		while (input.hasNextLine()) {

			sort.add(input.nextLine());

		}
		Collections.sort(sort);

		System.out.println("Sortiranje imena po abecedi: ");
		System.out.println("");

		for (int i = 0; i < sort.size(); i++) {

			System.out.println(sort.get(i));

		}

		input.close();
	}

}
