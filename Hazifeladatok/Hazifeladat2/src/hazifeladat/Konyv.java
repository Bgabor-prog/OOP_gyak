package hazifeladat;


public class Konyv {
	
	
	private String cim;
	private String szerzo;
	private int ev;
	private double ar;
	
	
	
	public Konyv (String cim,String szerzo,int ev,double ar) {
		this.cim = cim;
		this.szerzo = szerzo;
		this.ev = ev;
		this.ar = ar;
		
	}
	
	public Konyv (String cim,String szerzo) {
		this.cim = cim;
		this.szerzo = szerzo;
			
	}
	public void arNov(double szazalek) {
		this.ar = this.ar + (this.ar *(szazalek/100.00));
		
	}


	@Override
	public String toString() {
		return "Konyv cim: " + cim + " Szerzo:" + szerzo + " Ev:" + ev + " Ar:" + ar;
	}


	public String getCim() {
		return cim;
	}


	public void setCim(String cim) {
		this.cim = cim;
	}


	public String getSzerzo() {
		return szerzo;
	}


	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}


	public int getEv() {
		return ev;
	}


	public void setEv(int ev) {
		this.ev = ev;
	}


	public double getAr() {
		return ar;
	}


	public void setAr(int ar) {
		this.ar = ar;
	}
	
	
}
