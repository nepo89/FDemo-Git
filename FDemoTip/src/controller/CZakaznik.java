package controller;

public class CZakaznik {
	private String prijmeno;
	private String jmeno;
	private String adresa;
	private char rod;
	
	public CZakaznik(String prijmeno, String jmeno, String adresa, char rod) {
		super();
		this.prijmeno = prijmeno;
		this.jmeno = jmeno;
		this.adresa = adresa;
		this.rod = rod;
	}
	public String getPrijmeno() {
		return prijmeno;
	}
	public void setPrijmeno(String prijmeno) {
		this.prijmeno = prijmeno;
	}
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public char getRod() {
		return rod;
	}
	public void setRod(char rod) {
		this.rod = rod;
	}
	public String toString() {
		return "Zakaznik [prijmeno=" + prijmeno + ", jmeno=" + jmeno
				+ ", adresa=" + adresa + ", rod=" + rod + "]";
	}		
}
