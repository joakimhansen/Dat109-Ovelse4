package Main;

import java.util.Scanner;

import Entities.Craps;
import Entities.Spiller;

public class Client {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Navn på spiller: ");
		Craps craps = new Craps(new Spiller(in.nextLine()));

		craps.spill();
		in.close();

	}

}
