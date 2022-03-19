package cursojava.thread;

import java.beans.JavaBean;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*thread processando em paralelo*/
		new Thread() {
			public void run() {/*executa oque nos queremos*/for(int pos = 0; pos <10; pos++) {
				
				
				/*Quero executar esse envio com um tempo de parada, ou com tempo determinado*/
				System.out.println("Execuntando alguma rotina, por exemplo envio de email");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				/*codigo da rotina*/
			}};
		}.start();/*Start liga a Thread que fica processando paralelamente*/
		/*codigo da rotina que eu quero executar em paralelo*/
		for(int pos = 0; pos <10; pos++) {
			
		
			/*Quero executar esse envio com um tempo de parada, ou com tempo determinado*/
			System.out.println("Execuntando alguma rotina, por exemplo envio de email");
			Thread.sleep(1000);
		} /*fim do codigo*/
		
		/*codigo do sistema do usuario continua o fluxo de trabalho*/
		System.out.println("Chegou ao fim do codigo de teste de thread");
		
		/*fluxo do sistema, cadastro de venda, uma emissao de nota fiscal, algo do tipo
		 * */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}

}
