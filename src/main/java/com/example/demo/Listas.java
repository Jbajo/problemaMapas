package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Javier Bajo Chacon
 *
 */

public class Cadenas {
	
	/**
	 * 
	 * @param numeroEnString se pasa un numero en String
	 * @return true o false si parseable a int
	 */
	public static boolean esParseable(String numeroEnString){
		try {
		int numero = Integer.parseInt(numeroEnString);
		return true;
		} catch (Exception e) {
		return false;
		}
		}
	
	/**
	 * @param listaDeStrings lista con todos los Strings a parsear
	 * @return lista parseada
	 */
	public static ArrayList<String> parsearLista(List<String> listaDeStrings) {
		
		ArrayList<String> listaParseada = new ArrayList<>();
		ArrayList <Character> listaCompara = new ArrayList<> ();
		
		listaCompara.add('0');
		listaCompara.add('1');
		listaCompara.add('2');
		listaCompara.add('3');
		listaCompara.add('4');
		listaCompara.add('5');
		listaCompara.add('6');
		listaCompara.add('7');
		listaCompara.add('8');
		listaCompara.add('9');

		
		for (String string : listaDeStrings) {
			for(int j=0; j<string.length();j++)
			if(Cadenas.esParseable(String.valueOf(string.charAt(j)))&&listaCompara.contains(string.charAt(j))) {
				listaParseada.add(String.valueOf(string.charAt(j)));				
				
			}		
			
		}		
		
		return listaParseada;
	
	}
	
	/**
	 * @param mapDeStrings mapa de Strings con los elementos a añaadir en la lista
	 * @param listaDeStrings lista con los elementos ya añadidos
	 */
	
	public static void aniadirElementosLista (Map<String, String> mapDeStrings, List<String> listaDeStrings) {
		
		mapDeStrings.forEach((k,v)->listaDeStrings.add(k+","+v));
		
	}
	
	/**
	 * @param listaDeStrings lista de Strings a imprimir
	 */
	public static void imprimirElementos(List<String> listaDeStrings) {
		listaDeStrings.forEach((k)->System.out.println(k));
	}

}
