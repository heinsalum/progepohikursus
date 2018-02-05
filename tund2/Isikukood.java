public class Isikukood{
	protected String andmed;
	public Isikukood(String uusKood){
		andmed=uusKood;
	}
	public String kuunimi(){
		String[] kuunimed={"", "jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"}; 
	return kuunimed[kuunr()];
	}
	public int kuunr(){
		return Integer.parseInt(andmed.substring(3, 5));
	}
	public int päevanr(){
		return Integer.parseInt(andmed.substring(5, 7));
	}	
	public int aastanr(){
		return Integer.parseInt(andmed.substring(1, 3));
	}
	public int aastaarv4kohta(){
		if(andmed.substring(0, 1).equals("1") || andmed.substring(0, 1).equals("2")){/*kaks püstkriipsu tähendab "või"*/
			return 1800 + aastanr();
		}
		if(andmed.substring(0, 1).equals("3") || andmed.substring(0, 1).equals("4")){
			return 1900 + aastanr();
		}
		if(andmed.substring(0, 1).equals("5") || andmed.substring(0, 1).equals("6")){
			return 2000 + aastanr();
		}
		return -1;
	}
	//teine lahendamismoodus
	/*public int aastaarv4kohta(){
		return(18+(Integer.parseInt(andmed.substring(0, 1))-1)/2)*100+Integer.parseInt(andmed.substring(1, 3));
	}	*/
	@Override
	public String toString(){
		return päevanr()+". "+kuunimi()+" "+ aastaarv4kohta();
	}
}