package teste.Model;

import teste.Control.Control;

public class Model2Control {
	
	public void setTela(String operando) {
		Control.setStringTela(operando);
	}
	
	public String getTela() {
		return Control.getTela();
	}
}
