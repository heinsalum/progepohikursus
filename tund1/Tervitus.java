public class Tervitus{
	public static void main(String[] arg){
		System.out.println("Tere");
		int temperatuur=55;
		if(temperatuur<-28){
			System.out.println("Külmapüha");
		} else {
			//kui õues on soojem kui 20 kraadi
			//siis soovita lühikesi varrukaid
			if(temperatuur>20){
				System.out.println("Pane T-särk selga");
			} else {
				System.out.println("Võta jope kaasa");
			}
		}
	}
}