package teste.Control;

import teste.Model.Model;

public class Control2Model {
	public boolean isButom = false;
	private static Model calculadora = new Model();

	public void teclasPrecionadas(int tecla, boolean bork) {
		calculadora.recebeTecla(tecla, bork);
	}
	
	
}
