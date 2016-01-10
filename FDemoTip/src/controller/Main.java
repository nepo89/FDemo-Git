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
		
		CClovek reditel = new CClovek("Dvorak", "Petr", 42);
		System.out.println("Reditel: "+ reditel.toString());
	}

}
