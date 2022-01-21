package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClassejava {
 
	public static void main(String[] args) {
		

		/*new Aluno() é uma instancia (criacao de objeto)*/
		/*Agora tems um objeto real na memoria*/
		/*aluno1 ou alunox  é uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.setNome("João da Silva");
		aluno1.setIdade(55);
		aluno1.setDataNascimento("18/10/1977");
		aluno1.setRegistroGeral("224.524.3123-1");
		aluno1.setNumeroCpf("132.413.345-66");
		aluno1.setNomeMae("Fernada");
		aluno1.setNomePai("Fernando");
		aluno1.setDataMatricula("12/10/2014");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		aluno1.setNota1(9);
		aluno1.setNota2(4);
		aluno1.setNota3(7);
		aluno1.setNota4(10);
		
			System.out.println("Nome é = "+ aluno1.getNome());	
			System.out.println("Idade é = "+aluno1.getIdade());
			System.out.println("A Data de Nascimento é = "+aluno1.getDataNascimento());
			System.out.println("A média da nota é = "+aluno1.getMediaNota());
			//OPERADOR TERNARIO :     ? =  SE VERDADE "APROVADO"           : = SENAO "REPROVADO"
			System.out.println("Resultado = " +(aluno1.getAlunoAprovado()?"aprovado" : "reprovado"));
			System.out.println("Resultado = "+aluno1.getAlunoAprovado2());
			/*========================================================================*/
		
			System.out.println("=========================================================");
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/
		aluno2.setNome("pedro");
		aluno2.setIdade(22);
		aluno2.setDataNascimento("22/05/2000");
		aluno2.setNota1(9);
		aluno2.setNota2(9);
		aluno2.setNota3(7);
		aluno2.setNota4(10);
		System.out.println("Nome é = "+ aluno2.getNome());	
		System.out.println("Idade é = "+aluno2.getIdade());
		System.out.println("A Data de Nascimento é = "+aluno2.getDataNascimento());
		System.out.println("A média da nota é = "+aluno2.getMediaNota());
		System.out.println("Resultado = "+aluno2.getAlunoAprovado2());
				
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/
		
		Aluno aluno4 = new Aluno("Maria"); /*MARIA ESTA SENDO PASSADA POR PARAMETRO NO CONSTRUTOR NOME PADRAO*/
	
		Aluno aluno5 = new Aluno("José", 40);
		
	}

}
