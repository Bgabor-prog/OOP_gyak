package hazifeladat;
import java.util.Scanner;

public class SzemelyekFut {

	
	public static void main(String[] args) {
		
		Szemelyek ujsz = new Szemelyek();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a szemely adatait!");
		System.out.println("Adja meg a szemely nevet: ");
		String Nev = sc.nextLine();
		ujsz.setNev(Nev);
		System.out.println("Adja meg a szemely sulyat(egesz kg-ban): ");
		int Suly = sc.nextInt();
		ujsz.setSuly(Suly);
		System.out.println("Adja meg a szemely magassagat(meterben): ");
		float Magassag = sc.nextFloat();
		sc.close();
		ujsz.setMagassag(Magassag);
		
		System.out.println(ujsz.getNev());
		System.out.println(ujsz.getSuly());
		System.out.println(ujsz.getMagassag());
		
		System.out.println(ujsz.getAdatok());
		
		
	}
}
