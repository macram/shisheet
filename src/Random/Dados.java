package Random;

import java.util.ArrayList;

public class Dados {

	/* Permite simular la tirada de un único dado de valor máximo RANGO.
	 * Por ejemplo, para simular la tirada de un dado de diez caras el método será llamado
	 * de la siguiente manera: "tirarDado(10);".
	 */
	public static int tirarDado(int rango) {
		double resultado;
		resultado=Math.random()*rango; // Se le suma 1 si el valor del 0 es 10. 
		return (int)resultado;
	}
	
	/* Simula el lanzamiento de un conjunto "NUMERO" de dados, con un valor máximo de RANGO. 
	 * El resultado se devuelve en un array. 
	 */
	public static ArrayList<Integer> tirarDados(int numero, int rango) {
		int dado,vecesTiradas;
		ArrayList<Integer> resultados=new ArrayList<Integer>();
		for (int i=0; i<numero; i++) {
			resultados.add(tirarDado(rango));
		}
		return resultados;
	}
	
	/*
	 * En SHI, al realizar la ficha de PJ se repiten las tiradas de habilidades con valor menor
	 * a 40 hasta un máximo de tres veces (la tercera repetición se toma sí o sí). Cambiar valor
	 * si procede, o en su lugar, poner null si no se aplica esta regla.
	 * Este método realiza NÚMERO tiradas de dados de RANGO caras, y si un valor es menor a VALORMINIMO,
	 * se repite hasta un máximo de 3 veces (esto último está hardcodeado). 
	 */	
	public static ArrayList<Integer> tirarDados(int numero, int rango, int valorMinimo) {
		int dado,vecesTiradas;
		ArrayList<Integer> resultados=new ArrayList<Integer>();
		for (int i=0; i<numero; i++) {
			dado=0; vecesTiradas=0;
			do {
				dado=tirarDado(rango);
				vecesTiradas++;
			}
			while (dado<valorMinimo && vecesTiradas<3);
			resultados.add(dado);
		}
		return resultados;
	}
	
	public static void main(String[] args) {
		System.out.println(tirarDados(6,100));
		System.out.println(tirarDados(6,100,40));
	}
}