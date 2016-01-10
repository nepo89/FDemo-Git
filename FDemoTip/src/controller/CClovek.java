/**
 * 
 */
package controller;

/**
 * @author hp
 *
 */
public class CClovek {
	//Private variables
	private String prijmeno;
	private String jmeno;
	private int roku;
	//Public methods
	public CClovek(String prijmeno, String jmeno, int roku) {
		super();
		this.prijmeno = prijmeno;
		this.jmeno = jmeno;
		this.roku = roku;
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
	public int getRoku() {
		return roku;
	}
	public void setRoku(int roku) {
		this.roku = roku;
	}
	public String toString() {
		return "CClovek [prijmeno=" + prijmeno + ", jmeno=" + jmeno + ", roku="
				+ roku + "]";
	}
}
