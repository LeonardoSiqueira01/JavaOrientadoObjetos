package cursojava.thread;

import java.beans.JavaBean;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*thread processando em paralelo do envio de e-mail*/
		new Thread() {
			public void run() {
				/*executa oque nos queremos*/
				for(int pos = 0; pos <10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada, ou com tempo determinado*/
				System.out.println("Execuntando alguma rotina, por exemplo envio de email");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Dá um tempo*/
				
			}/*Fim do codigo em paralelo*/
				};
		}.start();/*Start liga a Thread que fica processando paralelamente por tras*/
		
		System.out.println("Chegou ao fim do codigo de teste de thread");
		/*codigo da rotina que eu quero executar em paralelo*/
	
		//**********************DIVISAO DAS THREADS*********************************//
		
		new Thread() {
			public void run() {
				/*executa oque nos queremos*/
				for(int pos = 0; pos <10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada, ou com tempo determinado*/
				System.out.println("Execuntando alguma rotina, por exemplo envio de nota fiscal");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				/*codigo da rotina*/
			}};
		}.start();/*Start liga a Thread que fica processando paralelamente*/

		/*codigo do sistema do usuario continua o fluxo de trabalho*/
		for(int pos = 0; pos <10; pos++) {
		
		}
		/*fluxo do sistema, cadastro de venda, uma emissao de nota fiscal, algo do tipo
		 * */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}

}
