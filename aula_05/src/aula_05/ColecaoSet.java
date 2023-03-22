package aula_05;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ColecaoSet {

	public static void main(String[] args) {

		Set<String> setFrutas = new HashSet<String>();

		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("kiwi");
		setFrutas.add("Maça");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("KIWI");

		Iterator<String> isetFrutas = setFrutas.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());

		}

		for (var Fruta : setFrutas)
			System.out.println(Fruta.hashCode());

		System.out.println("Existe a fruta manga?" + setFrutas.contains("manga"));
		
		setFrutas.remove("Kiwi");
		
		for(var Frutas : setFrutas)
			System.out.println(Frutas);

	}

}
