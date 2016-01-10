package controller;

import java.util.LinkedList;

public class CSpravovatZakazniki {
	LinkedList zakazniki = null;
	
	public CSpravovatZakazniki() {
		zakazniki = new LinkedList();
	}

	public void ustavitZakazniki(CZakaznik [] novy_zakazniki){
		int velikost = novy_zakazniki.length;
		for(int i = 0; i < velikost; i++){
			zakazniki.add(novy_zakazniki[i]);
		}
	}
	
	public void zobrazit(){
		CZakaznik zakaznik_tmp = null;
		for(int i = 0; i < zakazniki.size(); i++){
			zakaznik_tmp = (CZakaznik)zakazniki.get(i);
			System.out.println(zakaznik_tmp.getPrijmeno() + "  " + zakaznik_tmp.getJmeno() + "  " + zakaznik_tmp.getAdresa() + "  " + zakaznik_tmp.getRod());
		}
	}
}
