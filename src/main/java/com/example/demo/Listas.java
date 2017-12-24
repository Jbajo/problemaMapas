package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class Listas{
	
	/**
	 * 
	 * @param numeroEnString
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
	 * 
	 * @param listaDeStrings lista con todos los Strings a parsear
	 * @return lista parseada
	 */
	public static ArrayList<String> parsearLista(List<String> listaDeStrings) {
		
		ArrayList<String> listaParseada = new ArrayList<>();
				
		for (String string : listaDeStrings) {
			for(int j=0; j<string.length();j++)
			if(Listas.esParseable(String.valueOf(string.charAt(j)))) {
				listaParseada.add(String.valueOf(string.charAt(j)));				
				
			}		
			
		}				
		return listaParseada;
	
	}
	
	/**
	 * 
	 * @param mapDeStrings mapa de Strings con los elementos a añadir en la lista
	 * @param lista en la que se añadirán los elementos
	 */
	
	public static void aniadirElementosLista (Map<String, String> mapDeStrings, List<String> listaDeStrings) {
		
		mapDeStrings.forEach((k,v)->listaDeStrings.add(k + "," +v));	
		
	}
	
	/**
	 * 
	 * @param listaDeStrings lista de Strings a imprimir
	 */
	public static void imprimirElementos(List<String> listaDeStrings) {
	
		listaDeStrings.forEach((k)->System.out.println(k));
	}

}
