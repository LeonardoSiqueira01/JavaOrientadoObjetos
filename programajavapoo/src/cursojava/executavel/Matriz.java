package cursojava.executavel;

public class Matriz {
  public static void main(String[] args) {
	
	  int notas[][]= new int[2][3];
	  notas[0][0]= 80;
	  notas[0][1]= 90;
	  notas[0][2]=70;
	  
	  notas[1][0]=60;
	  notas[1][1]=20;
	  notas[1][2]=30;
	  
	  
	   //percorre as linhas 
	   for (int poslinha =0; poslinha < notas.length; poslinha++) {
		   System.out.println("========MATRIZ  ========");
		   
		   //Para cada linha percore as colunas array
		   for(int poscoluna=0; poscoluna< notas[poslinha].length; poscoluna++) {
			   System.out.println("valor da matriz : "+ notas[poslinha][poscoluna]);
		   }
	   }
}
}
