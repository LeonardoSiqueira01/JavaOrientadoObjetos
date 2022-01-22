package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClassejava {

	public static void main(String[] args) {
		
		String nome =JOptionPane.showInputDialog("qual o nome do aluno ? ");
		String idade = JOptionPane.showInputDialog("qual a idade do aluno?");
		String dataNascimento =JOptionPane.showInputDialog("qual a data de nascimento ? ");
		String rg = JOptionPane.showInputDialog("Qual o RG?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dtMatricula = JOptionPane.showInputDialog("qual a data da matricula?");
		String srMatriculado = JOptionPane.showInputDialog("Qual a serie ?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String disciplina1 = JOptionPane.showInputDialog("disciplina 1?");
		String nt1 = JOptionPane.showInputDialog("qual o valor da nota 1 ?");
		String disciplina2 = JOptionPane.showInputDialog("disciplina 2?");
		String nt2 = JOptionPane.showInputDialog("qual o valor da nota 2 ?");
		String disciplina3 = JOptionPane.showInputDialog("disciplina 3?");
		String nt3 = JOptionPane.showInputDialog("qual o valor da nota 3 ?");
		String disciplina4 = JOptionPane.showInputDialog("disciplina 4?");
		String nt4 = JOptionPane.showInputDialog("qual o valor da nota 4 ?");




		/*new Aluno() é uma instancia (criacao de objeto)*/
		/*aluno1 ou alunox  é uma referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno(); 
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dtMatricula);
		aluno1.setSerieMatriculado(srMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		aluno1.getDisciplina().setNota1(Double.parseDouble(nt1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nt2));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nt3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nt4));
	
		System.out.println(aluno1.toString()); /*Dscrição do objeto na memória*/
		System.out.println("Média do aluno =" + aluno1.getMediaNota() );
		System.out.println("Resultado =" + aluno1.getAlunoAprovado());
	
		/*EQUALS E HASHCODE(DIFERENCIAR OBJETOS)*/
		/*
		Aluno aluno1 = new Aluno();
		aluno1.setNome("alex");
		aluno1.setNumeroCpf("475641");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("alex");
		aluno2.setNumeroCpf("47564");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("alunos são iguais");
		}else {
			System.out.println("alunos não sao iguais");
		}*/
	}

}
