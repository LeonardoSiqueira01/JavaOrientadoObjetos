package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	
	public TelaTimeThread() {/*Executa oque tiver dentro no momento da abertura ou execução*/
		
		/*primeira parte concluida  - caracteristicas da tela*/
		setTitle("minha tela de time com thread");
		setSize(new Dimension(290, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		/*Sempre será o ultimo comando */
		setVisible(true);/*Torna a tela visivel para o usuario*/
}
	
}
