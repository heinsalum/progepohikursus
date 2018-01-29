public class Ilm{
	public static String kooliminekuHinnang(int temperatuur){
		if(temperatuur<-28){return "Pead külmapüha";}
		return "Lähed kooli";
	}
	//public static String riietusHinnang(int temperatuur, int sademed){
	//	if(temperatuur>20 && sademed<10){return "Soe on ja jopet pole vaja";}
	//	return "Veidi jahe, võta jope kaasa";	
	public static String riietusHinnang(int temperatuur, int sademed){
		if(temperatuur<-10){
			String[] talveriided={"pruun mantel", "vanaisa kasukas", "buhvaika"};
		return talveriided[(int)(Math.random()*talveriided.length)];
		}
		return (sademed>0) ? "vihmavari" : "jope"; //?-tõenäoline :-teisel juhul
	}	
	public static void main(String[] arg){
		int temperatuur=10;
		int sademed=5;
		//kui temp ja sademed sisestatakse käsurealt siis arvutatakse just neid väärtusi
		try{
			if(arg.length>0){temperatuur=Integer.parseInt(arg[0]);}
			if(arg.length>1){sademed=Integer.parseInt(arg[1]);}
		} catch(Exception e){
			//kasutab kujul njava Ilm [temperatuur] [sademed]
			System.out.println("java Ilm -15 2");
			return;
		}	
		System.out.println(kooliminekuHinnang(temperatuur));
		//System.out.println(riietusHinnang(temperatuur, sademed));
		System.out.println(riietusHinnang(temperatuur, 0));
	}
}