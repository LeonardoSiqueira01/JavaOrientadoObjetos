package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		System.out.println("Fila rodando");
	
		while(true) {
			Iterator iteracao = pilha_fila.iterator();
		synchronized (pilha_fila) {/*bloquear o acesso a esta lista por outros processos*/
			/*enquanto conter dados na lista irá processar*/
			while(iteracao.hasNext()) {
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*pega o objeto atual*/
			/*processar 10mil notas fiscais*/
			/*gerar uma lista enorme de pdf*/
			/*gerar um envio em massa de email*/
			System.out.println("----------------------------");
			System.out.println(processar.getNome());
			System.out.println(processar.getEmail());

			iteracao.remove();
			try {
				Thread.sleep(1000); /*da um tempo para descarga de memoria*/
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
		}
		while(iteracao.hasNext()) {/*enquanto conter dados na lista irá processar*/
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*pega o objeto atual*/
			/*processar 10mil notas fiscais*/
			/*gerar uma lista enorme de pdf*/
			/*gerar um envio em massa de email*/
			iteracao.remove();
			try {
				Thread.sleep(100); /*da um tempo para descarga de memoria*/
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	} 
	
		try {
			Thread.sleep(1000);/*processou toda lista, da um tempo para limpeza de memoria*/
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}}
}