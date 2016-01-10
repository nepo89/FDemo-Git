/**
 * 
 */
package controller;

/**
 * @author hp
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dobry den, vazeni zakazniki.");
		System.out.println("Vitavame vam.");
		System.out.println("----------------------------");
		CZakaznik zakazniki[] = {   new CZakaznik("Puebla", "Teresa", "Tehovska 10", 'f'), 
									new CZakaznik("Bergues", "Alejandro", "Tehovska 10", 'm'),
									new CZakaznik("Bergue", "Jennifer", "Tehovska 10", 'f')};
		
		System.out.println("Prijmeno    Jmeno    Adresa    Rod");
		for(int i = 0; i < zakazniki.length; i++){
			System.out.println(zakazniki[i].getPrijmeno() + "  " + zakazniki[i].getJmeno() + "  " + zakazniki[i].getAdresa() + "  " + zakazniki[i].getRod());
		}
		
		CClovek reditel = new CClovek("Dvorak", "Petr", 42);
		System.out.println("Reditel: "+ reditel.toString());
	}

}
