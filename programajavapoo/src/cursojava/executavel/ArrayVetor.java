package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
 public static void main(String[] args) {
	
	 /*Array pode ser de todos tipos de dados e objetos tamb�m*/
	 
	
	 
String posicoes = JOptionPane.showInputDialog("Quantas posicoes o array deve ter?");

/*Array sempre deve ter a quantidade de posi��es definidas*/
double notas[] = new double[Integer.parseInt(posicoes)];


for (int pos=0; pos<notas.length;pos++) {
String valor=JOptionPane.showInputDialog("Qual o valor da nota = " +(pos+1));
notas[pos]=Double.valueOf(valor);
}

	 //*Length retorna um inteiro, usar num for na parte de tamanho de um array*//
	 for(int pos=0; pos< notas.length; pos++) {
		 System.out.println("Nota "+(pos+1)+ " = "+notas[pos]);
	 }
	 
	
}
 }

