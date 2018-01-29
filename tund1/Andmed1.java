import java.util.Arrays;
public class Andmed1{
	public static void main(String[] arg){;
		Arrays.sort(arg); //sorteerib
		System.out.println(Arrays.toString(arg));
		for(int i=0; i<arg.length; i++){
			System.out.println(i+": "+arg[i]); //suurendab i peale iga käsku
		}
		for(String a: arg){
			System.out.println(a);
		}
		Arrays.stream(arg).forEach(System.out::println);
	}
}
