package cursojava.executavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.callback.TextOutputCallback;

public class SplitArray {
	public static void main(String[] args) {
		String texto = "Leo,curso java, 80,70,90, 89";
	
		String[] valoresArray = texto.split(",");
		System.out.println("Nome: "+valoresArray[0]);
		System.out.println("Curso: "+valoresArray[1]);
		System.out.println("nota 1: "+valoresArray[2]);
		System.out.println("nota 2: "+valoresArray[3]);
		System.out.println("nota 3: "+valoresArray[4]);
		System.out.println("nota 4:"+valoresArray[5]);
		

	/*Convertendo um Array em uma lista*/
	List<String> list = Arrays.asList(valoresArray);
	
	for (String valoString : list) {
		System.out.println(valoString);
	}
		
		/*converter uma lista para array*/
	String[] ConversaoArray = list.toArray(new String[6]);
	System.out.println(ConversaoArray);
	for(int pos = 0;pos<ConversaoArray.length;pos++) {
		System.out.println(ConversaoArray[pos]);
	}
	
	}
}
