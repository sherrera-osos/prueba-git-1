package Ventana;

import javax.swing.JFrame;

public class VentanaSwingGit extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public VentanaSwingGit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejemplo Git");
		
		setVisible(true);
	}

	
	
	
	
	public static void main(String[] args) {
		new VentanaSwingGit();

	}

}
