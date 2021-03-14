package hazifeladat;
import java.time.LocalDate; 


public class Konyvfut {
	
	public static void main(String[] args) {
		getYear();
		
		
		Konyv k1 = konyvAdat();
		System.out.println(k1.toString());
		k1.arNov(10);
		System.out.println(k1.toString());
		
	}

	private static int getYear() {
		LocalDate currentDate = LocalDate.now();
		int year = currentDate.getYear();
		
		return year;
	}

	private static Konyv konyvAdat() {
		
		Konyv k1 = null;
		String cim = "Gyuruk ura";
		String szerzo = "Tolkien";
		int ev = getYear();
		double ar = 2500;
		
		 k1 = new Konyv (cim,szerzo,ev,ar);
		 return k1;
	}

}
