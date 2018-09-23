package teste.Control;

/**
 * 
 * @author djze5
 *Classe controle de Calculadora.
 */
public class Control {
	
	public boolean isButom = false;
	private static CotrolView controModel = new CotrolView();
	private static Control2Model modelControl = new Control2Model();
	
	
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
		modelControl.teclasPrecionadas(tecla, bork);
	}
	
	public static void setStringTela(String toTela) 
	{
		controModel.setTela(toTela);
	}
	
	public static String getTela() {
		return controModel.getTela();
	}
}
