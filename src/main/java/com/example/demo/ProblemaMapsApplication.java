package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class ProblemaMapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemaMapsApplication.class, args);
		
		Map<String, String> mapDeStrings = new HashMap<>();
		mapDeStrings.put("item1", "4394ddddddd");
		mapDeStrings.put("item2","ooooooo234");
		mapDeStrings.put("clave1", "pepeNoPodiaFaltar2345");

		List<String> listaDeStrings = new ArrayList<>();
		listaDeStrings.add("wq32453js23");
		listaDeStrings.add("SDJRD2332");
		listaDeStrings.add("234324234rt,,,,3");
		listaDeStrings.add("23nhdfe098sdf23");
		
		List<String> listaParseable = new ArrayList<>();
		
		Listas.aniadirElementosLista(mapDeStrings,listaDeStrings); 	
		Listas.imprimirElementos(listaDeStrings);		
		System.out.println("------------------");
		listaParseable = Listas.parsearLista(listaDeStrings);
		Listas.imprimirElementos(listaParseable);
		
			
		}
	}

