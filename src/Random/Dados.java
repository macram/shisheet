package Random;

import java.util.ArrayList;

public class Dados {
	public static int tirarDado(int rango) {
		double resultado;
		resultado=Math.random()*rango; // Se le suma 1 si el valor del 0 es 10. 
		return (int)resultado;
	}
	
	public static ArrayList<Integer> tirarDados(int numero, int rango) {
		ArrayList<Integer> resultados=new ArrayList<Integer>();
		for (int i=0; i<numero; i++) {
			resultados.add(tirarDado(rango));
		}
		return resultados;
	}
		
	public static void main(String[] args) {
		System.out.println(tirarDado(6));
		System.out.println(tirarDado(100));
		System.out.println(tirarDados(5,10));
		System.out.println(tirarDados(10,10));
	}
}