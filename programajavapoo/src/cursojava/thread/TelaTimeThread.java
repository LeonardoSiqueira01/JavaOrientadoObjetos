package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	private JPanel jPanel = new JPanel(new GridBagLayout()); /*Painel de Componente*/
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	
	public TelaTimeThread() {/*Executa oque tiver dentro no momento da abertura ou execu��o*/
		/*primeira parte concluida  - caracteristicas da tela*/
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(290, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
			GridBagConstraints gridBagConstraints = new GridBagConstraints(); 
			/*controlador de posicionamento de componentes*/
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			
			descricaoHora.setPreferredSize(new Dimension(200, 25));
			jPanel.add(descricaoHora, gridBagConstraints);
			mostraTempo.setPreferredSize(new Dimension(200,25));
			gridBagConstraints.gridy ++;
			jPanel.add(mostraTempo, gridBagConstraints);
			
			descricaoHora2.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy ++;
			jPanel.add(descricaoHora2, gridBagConstraints);
			mostraTempo2.setPreferredSize(new Dimension(200,25));
			gridBagConstraints.gridy ++;
			jPanel.add(mostraTempo2, gridBagConstraints);
			
			add(jPanel, BorderLayout.WEST);
			
		
		/*Sempre ser� o ultimo comando */
		setVisible(true);/*Torna a tela visivel para o usuario*/
}
	
}