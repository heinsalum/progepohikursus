public class Proov1{
    public static void main(String[] arg){
        Konto k1=new Konto("EE9678");
		Konto k2=new Konto("EE6969");
        System.out.println(k1.kasOlemas());
        System.out.println(k1.lisaSumma(5));
		System.out.println(k2.kasOlemas());
        System.out.println(k2.lisaSumma(5));
        Kontor k=new Kontor();
        System.out.println(k.kontoSisu("ABC"));
        System.out.println(k.kontoSisu("EE9678")); 
		System.out.println(k.ylekanne("EE9678", "EE6969", 2));
    }
}