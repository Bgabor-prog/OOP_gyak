package hazifeladat;

public class AlkFut {

	public static void main(String[] args) {
		
		Alkalmazott alk = adatok();
		
		
		System.out.println(alk.toString());
		
		
	}

	private static Alkalmazott adatok() {
		
		Alkalmazott alk = null;
		
		String Nev = "Josh";
		int fizetes = 250000;
		
		alk = new Alkalmazott (Nev,fizetes);
		
		return alk;
	}

}
