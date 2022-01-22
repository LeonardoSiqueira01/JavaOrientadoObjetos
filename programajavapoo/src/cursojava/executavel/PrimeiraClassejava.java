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
		String nt1 = JOptionPane.showInputDialog("qual o valor da nota 1 ?");
		String nt2 = JOptionPane.showInputDialog("qual o valor da nota 2 ?");
		String nt3 = JOptionPane.showInputDialog("qual o valor da nota 3 ?");
		String nt4 = JOptionPane.showInputDialog("qual o valor da nota 4 ?");




		/*new Aluno() é uma instancia (criacao de objeto)*/
		/*Agora tems um objeto real na memoria*/
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
		aluno1.setNota1(Double.parseDouble (nt1));
		aluno1.setNota2(Double.parseDouble(nt2));
		aluno1.setNota3(Double.parseDouble(nt3));
		aluno1.setNota4(Double.parseDouble(nt4));
	
		System.out.println(aluno1.toString()); /*Dscrição do objeto na memória*/
		System.out.println("Média do aluno =" + aluno1.getMediaNota() );
		System.out.println("Resultado =" + aluno1.getAlunoAprovado2());
	
	}

}
