package hazifeladat;

public class Szemelyek {
 
	
	private String Nev;
	private int suly;
	private float magassag;
	
	public float testTomegIndex() {
		float testtomegindex = suly / (magassag*magassag);
		
		return testtomegindex;
	}
	
	public String ttiAlkat() {
		
		String alkat = "Sovany";
		String alkat1 = "Kover";
		String alkat3 = "Normal";
		if(testTomegIndex() < 18.5) {
			
			return alkat; 
		}else if(testTomegIndex() > 25) {
			return alkat1;
			
		}else {
			
			return alkat3;
		}
		
		
	}
	
	public void setNev(String nev) {
		this.Nev = nev;
		
	}
	
	public String getNev() {
		
		return this.Nev;
	}
	public void setSuly(int suly) {
		
		this.suly = suly;
		
	}  
	public int getSuly() {
		
		return this.suly;
	}
	
	public void setMagassag(float magassag) {
		
		this.magassag = magassag;
		
	}
	public float getMagassag() {
		
		return this.magassag;
	}
	
	
	public String getAdatok() {
		
		return " Nev: " + this.Nev + " Suly: " + this.suly + " Magassag: " + this.magassag + " Tti: " + testTomegIndex() + " Alkat: " + ttiAlkat();
		
	}
}