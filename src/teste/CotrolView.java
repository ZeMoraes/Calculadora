package teste;

import java.awt.EventQueue;

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
	
}
