package teste;

import java.awt.EventQueue;

/**
 * 
 * @author djze5
 *Classe controle de Calculadora.
 */
public class Control {
	
	private static String operando = "";
	private static String operador = "";
	private static String lastOperato = "";
	public boolean isButom = false;
	private static CotrolView controModel = new CotrolView();
	
	
	/**
	 * Esse metodo inicializa o programa.
	 */
	public static void main(String[] args) {
		controModel.inicializarTela();
	}
	
	/**
	 * Metodo que recebe as teclas que foram precionadas.
	 * repassa para o model exercer as regras de negocio.
	 * @param tecla recebe a tecla precionada
	 * @param bork indica se a tecla foi precionada via teclado ou interface gráfica.
	 */
	public static void teclasPrecionadas(int tecla,boolean bork) {
		
	}
}
