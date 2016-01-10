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
		CSpravovatZakazniki spravovatZ = new CSpravovatZakazniki();
		spravovatZ.ustavitZakazniki(zakazniki);
		
		System.out.println("Prijmeno    Jmeno    Adresa    Rod");
		spravovatZ.zobrazit();
		
		
		zakazniki[0] = new CZakaznik("Puebla", "Teresa", "Tehovska 10", 'f'); 
		zakazniki[1] = new CZakaznik("Bergues", "Alejandro", "Tehovska 10", 'm');
		
		spravovatZ.ustavitZakazniki(zakazniki);
		spravovatZ.zobrazit();
		
		CClovek reditel = new CClovek("Dvorak", "Petr", 42);
		System.out.println("----------------------------");
		System.out.println("Reditel: "+ reditel.toString());
		System.out.println("----------------------------");
	}

}
