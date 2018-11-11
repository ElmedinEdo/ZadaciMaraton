import java.util.Scanner;

public class BrojLinija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dana, 17.01. po najvecem snijegu ucesnici BILD IT Osnove su trcali maraton
		// velike duzine na podrucju
		// grada Javatown. Vremena koja su ucesnici ostvarili nalaze se u fajlu
		// maraton.txt u sledecem formatu:
		// imeUcesnika vrijemeKojeJeOstvario tj. ime ucesnika i njegovo vrijeme u
		// minutama su odvojeni
		// space-om.

		// 6.Napisati program koji ispisuje koliko ima linija u fajlu koji se nalazi na
		// sledecoj adresi:
		// http://www.textfiles.com/science/astronau.txt

		System.out.println("Unesite adresu: ");

		String URLString = new Scanner(System.in).next();

		try {

			java.net.URL url = new java.net.URL(URLString);

			int characters = 0, count = 0;

			Scanner input = new Scanner(url.openStream());

			while (input.hasNext()) {

				String line = input.nextLine();

				characters += line.length();
				count++;

			}

			System.out.println("Linija u fajlu ima: " + count);

		}

		catch (java.net.MalformedURLException ex) {
			System.out.println("Pogresan URL ");

		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: ne postoji takav file ");
		}

	}

}
