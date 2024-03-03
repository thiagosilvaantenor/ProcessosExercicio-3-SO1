package view;

import javax.swing.JOptionPane;
import controller.DistroController;

public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Olá, esse projeto vai mostrar qual o nome da distribuição e versão do seu sistema operacional Linux\nPortanto, ele apenas funciona em sistemas operacionais Linux!");
		
		DistroController distro = new DistroController();
		distro.exibeDistro();
	}

}
