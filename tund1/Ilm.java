public class Ilm{
	public static String kooliminekuHinnang(int temperatuur){
		if(temperatuur<-28){return "Pead külmapüha";}
		return "Lähed kooli";
	}
	public static String riietusHinnang(int temperatuur, int sademed){
		if(temperatuur>20 && sademed<10){return "Soe on ja jopet pole vaja";}
		return "Veidi jahe, võta jope kaasa";	
	}	
	public static void main(String[] arg){
		int temperatuur=10;
		int sademed=5;
		System.out.println(kooliminekuHinnang(temperatuur));
		System.out.println(riietusHinnang(temperatuur, sademed));
	}
}