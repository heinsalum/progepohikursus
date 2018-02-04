import java.util.Scanner;
import java.lang.Math;

public class kodutöö1 {
    
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kaal;
        int pikkus;

        System.out.print("Sisesta kaal: ");
        kaal = input.nextInt();

        System.out.print("Siesta pikkus: ");
        pikkus = input.nextInt();

        double pikkusmeetrites = pikkus / 100;
        double kmi = kaal / Math.pow(pikkusmeetrites, 2.0);

        System.out.println("Sinu kehamassiindeks on: " + kmi);

        if (kmi < 18.5 ) {
            System.out.print("Sa oled alakaaluline! Võta ühendust toitumisspetsialistiga!");
        }

        else if (kmi >= 18.5 && kmi < 25) {
            System.out.print("Sa oled normaalkaalus. Jätka samas vaimus!");
        }

        else if (kmi >= 25 && kmi < 30) {
            System.out.print("Sa oled ülekaaluline! Võta ühendust toitumisspetsialistiga!");
        }

        else if (kmi >= 30) {
            System.out.print("Sa oled rasvunud! Võta ühendust toitumisspetsialistiga!");
        }
    }
}