package cursojava.executavel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClassejava {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int qtd= 1; qtd <=2; qtd++) {
		
		String nome =JOptionPane.showInputDialog("qual o nome do "+qtd+ "� aluno ? ");
		/*String idade = JOptionPane.showInputDialog("qual a idade do aluno?");
		String dataNascimento =JOptionPane.showInputDialog("qual a data de nascimento ? ");
		String rg = JOptionPane.showInputDialog("Qual o RG?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF");
		String mae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dtMatricula = JOptionPane.showInputDialog("qual a data da matricula?");
		String srMatriculado = JOptionPane.showInputDialog("Qual a serie ?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		

		/*new Aluno() � uma instancia (criacao de objeto)*/
		/*aluno1 ou alunox  � uma referencia para o objeto aluno*/
		
		Aluno aluno1 = new Aluno(); 
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dtMatricula);
		aluno1.setSerieMatriculado(srMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		
		/*deixando a cria��o de disciplinas dinamica*/
		for (int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("nome da Disciplina "+pos+ " ?");
			String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina "+pos+ " ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setDisciplina(notaDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
		
			aluno1.getDisciplinas().add(disciplina);
		}
		/*removendo alguma disciplina*/
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		//opcao sim � Zero 0, n�o � 1, 2 � cancelar
		if (escolha == 0) {
			int continuarRemover = 0;
			int posicao = 1;
			
			
			while(continuarRemover == 0) {	
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
			//posicao de listas//
		aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao); /*OBS: os valores de uma lista sempre  se iniciam em zero "0" entao lembre-se de na hr
		 que for declarar o valor a ser removido por -1 antes do fechamento dos parenteses*/
		posicao ++;
		continuarRemover = JOptionPane.showConfirmDialog(null, "continuar a Remover?");
		}}
		alunos.add(aluno1);
		}	
		for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase("leo")) {
			System.out.println(aluno.toString()); /*Descri��o do objeto na mem�ria*/
			System.out.println("M�dia do aluno =" + aluno.getMediaNota() );
			System.out.println("Resultado =" + aluno.getAlunoAprovado());
			System.out.println("---------------------------------------------------");
			break;
			}
		}}
		
	
		
	}

