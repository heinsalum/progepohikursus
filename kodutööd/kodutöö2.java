package kujund;

import java.util.Scanner;
import java.lang.Math;

public class kodutöö2 {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		
		kujund ruudukülg = new kujund();
		kujund ristkülikukülg1 = new kujund();
		kujund ristkülikukülg1 = new kujund();
		
		System.out.print("Sisesta ruudu külg: ");
        ruudukülg = input.nextInt();
		
		System.out.print("Sisesta ristküliku esimene külg: ");
        ristkülikukülg1 = input.nextInt();
		
		System.out.print("Sisesta ristküliku teine külg: ");
        ristkülikukülg2 = input.nextInt();
		
		double pindalaruut = Math.pow(ruudukülg, 2.0);
		double pindalaristkülik = (ristkülikukülg1 * ristkülikukülg2);
		
		System.out.println("Ruudu pindala on: " + pindalaruut + " sentimeetrit.");
		System.out.println("Ristküliku pindala on: " + pindalaristkülik + " sentimeetrit.");
		
		double mahubsisse = (pindalaruut % pindalaristkülik);
		
		if (mahubsisse > 0 ) {
			System.out.println("Kui mahutada ruut ristküliku sisse, siis jäb järgi " + mahubsisse + " ruutsentimeetrit ruudust!");
		}
        else if (mahubsisse == 0) {
			System.out.println("Ruut on liiga suur ristküliku jaoks");
		}
	}
}