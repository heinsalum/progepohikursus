import java.util.*;
public class Proov3{
	public static void main(String[] arg){
		List<Isikukood> isikukoodid=new ArrayList<Isikukood>();
		Map<Integer, Integer> aastasagedused=new HashMap<Integer, Integer>();
		Map<Integer, Integer> kuusagedused=new HashMap<Integer, Integer>();
		isikukoodid.add(new Isikukood("39804300268"));
		isikukoodid.add(new Isikukood("39707280266"));
		isikukoodid.add(new Isikukood("39808290270"));
		for(Isikukood kood: isikukoodid){
			int aasta=kood.aastaarv4kohta();
			if(aastasagedused.get(aasta)==null){
				aastasagedused.put(aasta, 1);
			} else {
				int kogus=aastasagedused.get(aasta);
				aastasagedused.put(aasta, kogus+1);
			}
		}
		isikukoodid.stream().forEach(System.out::println);
		for(int i=0; i<isikukoodid.size(); i++){
			System.out.println(isikukoodid.get(i));
		}
		//lugege iga kuunime kohta, mitu inimest on seal sündinud
		for(Isikukood kood: isikukoodid){
			int kuu=kood.kuunr();
			if(kuusagedused.get(kuu)==null){
				kuusagedused.put(kuu, 1);
			} else {
				int kogus=kuusagedused.get(kuu);
				kuusagedused.put(kuu, kogus+1);
			}
		}
		System.out.println(aastasagedused);
		System.out.println(kuusagedused);
		isikukoodid.stream().forEach(System.out::println);
		for(int i=0; i<isikukoodid.size(); i++){
			System.out.println(isikukoodid.get(i));
		}
	}
}