public class Proov1{
	public static void main(String[] arg){
		Isikukood jaagup=new Isikukood("37605030299");
		Isikukood toomas=new Isikukood("50804250357");
		System.out.println("Aasta nr " + jaagup.aastaarv4kohta() + "kuu nr " + jaagup.kuunr() + " nimega " + jaagup.kuunimi() + " päeva nr " + jaagup.päevanr());
		System.out.println("Aasta nr " + toomas.aastaarv4kohta() + "Kuu nr " + toomas.kuunr() + " nimega " + toomas.kuunimi() + " päeva nr " + toomas.päevanr());
	}
}