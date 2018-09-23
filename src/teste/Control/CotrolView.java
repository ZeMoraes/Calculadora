package teste.Control;

import java.awt.EventQueue;

import teste.View.View;

public class CotrolView {
	private static View window = new View();
	
	public void inicializarTela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void setTela(String operando) {
		window.textField.setText(operando);
	}
	
	public String getTela() {
		return window.textField.getText();
	}
	
	
}
