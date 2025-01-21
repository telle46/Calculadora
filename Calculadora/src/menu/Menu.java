package menu;

import java.util.Scanner;

public class Menu {
	private static Scanner teclado = new Scanner(System.in);

	/**
	 * 
	 * @return Devuelve los numeros a operar
	 */
	public int[] pedirNumeros() {
		int[] ret = new int[2];
		System.out.print("Operando 1: ");
		ret[0] = teclado.nextInt();
		System.out.print("Operando 2: ");
		ret[1] = teclado.nextInt();
		return ret;
	}

	/**
	 * @param Operaciones
	 * @return Devuelve que tipo de operacion se hara
	 */
	public String menuOpciones() {
		String ret = "";
		do {
			System.out.print("Operaciones [+, -, *, /, %]: ");
			ret = teclado.next();
		} while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) || (ret.equalsIgnoreCase("*"))
				|| (ret.equalsIgnoreCase("/")) || (ret.equalsIgnoreCase("%"))));
		return ret;
	}

	/**
	 * @param Seguir Operando
	 * @return Se devuelve si el cliente quiere seguir operando con la calculadora
	 */
	public boolean repetir() {
		boolean ret = false;
		String respuesta;
		do {
			System.out.print("�Desea continuar trabajando con la calculadora? [s / n]");
			respuesta = teclado.next();
		} while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))));

		if (respuesta.equalsIgnoreCase("s")) {
			ret = true;
		}
		return ret;
	}
}