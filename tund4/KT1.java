import java.util.Scanner;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class KT1{
	public static void main(String[] arg) throws Exception{
		Scanner input = new Scanner(System.in);
        int kassmass1;
        int kassmass2;
		int kassmass3;
		int koermass1;
		int koermass2;
		
		//joonis
		BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 300);
		String address="http://www.tlu.ee/~jaagup/veeb1/loomad.txt";
		BufferedReader br=new BufferedReader(new InputStreamReader(new URL(address).openStream()));
		String rida=br.readLine();
		rida=br.readLine();
		while(rida!=null){
			String[] m=rida.split(",");
			if(m[0].equals("kass")){g.setColor(Color.gray);}
			else{g.setColor(Color.red);}
			g.fillRect(Integer.parseInt(m[1])/30, 300-Integer.parseInt(m[2])*2, 5, 5);
			rida=br.readLine();
		}
		
		//masside keskmine(kassid ja koerad eraldi)
		br=new BufferedReader(new InputStreamReader(new URL(address).openStream()));
		rida=br.readLine();
		if(!rida.startsWith("liik")){
			System.out.println("kassid või koerad");
			return;
		}
		int kassidemassidekeskmine=0;
		int koerademassidekeskmine=0;
		int kokkukasse = 0;
		int kokkukoeri = 0;
		while(rida!=null){
			System.out.println(rida);
			String[] m=rida.split(",");
			if(m[0].equals("kass")){
				kokkukasse = kokkukasse + 1;
				kassidemassidekeskmine+=Integer.parseInt(m[1]) / kokkukasse;
			}
			if(m[0].equals("koer")){
				kokkukoeri = kokkukoeri + 1;
				koerademassidekeskmine+=Integer.parseInt(m[1]) / kokkukoeri;
			}
			rida=br.readLine();
			rida=br.readLine();
		}
		
		//kõrguste keskmine
		
		//kõrguste keskmine
		
		//punkt 3 teha veel
		
		System.out.println("Kasside masside keskmine: "+ kassidemassidekeskmine);
		System.out.println("Koerade masside keskmine: "+ koerademassidekeskmine);
		
        System.out.print("Sisesta esimese kassi mass: ");
        kassmass1 = input.nextInt();
		
		System.out.print("Sisesta teise kassi mass: ");
        kassmass2 = input.nextInt();
		
		System.out.print("Sisesta kolmanda kassi mass: ");
        kassmass3 = input.nextInt();
		
		System.out.print("Sisesta esimese koera mass: ");
        koermass1 = input.nextInt();
		
		System.out.print("Sisesta teise koera mass: ");
        koermass2 = input.nextInt();
		
		double masssummakoer = koermass1 + koermass2;
		System.out.print("Koerade masside summa: "+ masssummakoer +"\n");
		double masssummakass = kassmass1 + kassmass2 + kassmass3;
		System.out.print("Kasside masside summa: "+ masssummakass +"\n");
		
		if (masssummakoer > masssummakass){
			System.out.println("Koerade masside summa on suurem");
		}
		else if (masssummakoer < masssummakass){
			System.out.println("Kasside masside summa on suurem");
		}
		else if (masssummakoer > masssummakass){
			System.out.println("Kasside ja koerade masside summad on võrdsed");
		}
	}
}