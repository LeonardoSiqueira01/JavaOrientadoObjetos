package cursojava.thread;

import java.beans.JavaBean;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*thread processando em paralelo do envio de e-mail*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		
		/*Codigo do sistema do usuario continua o fluxo de trabalho*/
		System.out.println("Chegou ao fim do codigo de teste da thread");
		/*fluxo do sistema, cadastro de venda, uma emissao de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}


	
	private static Runnable thread1 = new Runnable() {
		public void run() {
			/*executa oque nos queremos*/
			for(int pos = 0; pos <10; pos++) {
			
			/*Quero executar esse envio com um tempo de parada, ou com tempo determinado*/
			System.out.println("Execuntando alguma rotina, por exemplo envio de e-mail");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*codigo da rotina*/
		}
		}
	};
	/*---------------------------------------------------------------------------------------*/
	private static Runnable thread2 = new Runnable() {
		
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
		}
		}
	};
}
