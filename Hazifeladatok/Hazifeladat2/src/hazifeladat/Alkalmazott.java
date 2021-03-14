package hazifeladat;

public class Alkalmazott {
	private String Nev;
	private int fizetes;
	
	
	
	
	public Alkalmazott(String nev,int fizetes) {
		this.Nev = nev;
		this.fizetes = fizetes;
		
	}
	public Alkalmazott(String nev) {
		
		this.Nev = nev;
		
	}
	
	@Override
	public String toString() {
		return "Nev: " + this.Nev + " Fizetes: " + this.fizetes;
		
	}
	
	public void fizNovel(int fizNovekmeny) {
		this.fizetes += fizNovekmeny;
	}
	
	public String getAdatok() {
		
		return "Nev: " + this.Nev + " Fizetes: " + this.fizetes;
		
	}
	
	public void setNev(String nev) {
		this.Nev = nev;
			
	}
	
	public void setFiz(int fizetes) {
		
		this.fizetes = fizetes;
	}
	
	public String getNev() {
		
		return this.Nev;
	}
	
	public int getFiz() {
		return this.fizetes;
		
	}
	
	public double getAdo() {
		return this.fizetes * (16/100.00);
		
	}
	
	
	public boolean getFizHatarokKozott(int also,int felso) {
		
		if(this.fizetes <= felso && this.fizetes >= also)
			return true;
		
		return false;
	}
}
