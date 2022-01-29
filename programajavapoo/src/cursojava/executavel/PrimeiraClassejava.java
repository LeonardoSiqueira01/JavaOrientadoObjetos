package cursojava.executavel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClassejava {

	public static void main(String[] args) {
		
		List<Aluno>alunos = new ArrayList<Aluno>();
		
		List<Aluno>alunosAprovados = new ArrayList<Aluno>();
		List<Aluno>alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno>alunosReprovados = new ArrayList<Aluno>();



		for (int qtd= 1; qtd <=5; qtd++) {
		
		String nome =JOptionPane.showInputDialog("qual o nome do "+qtd+ "º aluno ? ");
		/*String idade = JOptionPane.showInputDialog("qual a idade do aluno?");
		String dataNascimento =JOptionPane.showInputDialog("qual a data de nascimento ? ");
		String rg = JOptionPane.showInputDialog("Qual o RG?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dtMatricula = JOptionPane.showInputDialog("qual a data da matricula?");
		String srMatriculado = JOptionPane.showInputDialog("Qual a serie ?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		

		/*new Aluno() é uma instancia (criacao de objeto)*/
		/*aluno1 ou alunox  é uma referencia para o objeto aluno*/
		
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
		
		
		/*deixando a criação de disciplinas dinamica*/
		for (int pos = 1; pos <=1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("nome da Disciplina "+pos+ " ?");
			String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina "+pos+ " ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
		
			aluno1.getDisciplinas().add(disciplina);
		}
		/*removendo alguma disciplina*/
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		//opcao sim é Zero 0, não é 1, 2 é cancelar
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
		for (Aluno aluno : alunos) {/*separado em listas*/
			if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else
				if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);	
				}else
					if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						alunosReprovados.add(aluno);
					}
		}	System.out.println("---------Lista dos aprovados---------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Aluno = "+aluno.getNome()+" / resultado = "+ aluno.getAlunoAprovado()+ " com média de = "+ aluno.getMediaNota());
			

		}System.out.println("---------Lista dos reprovados---------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Aluno = "+aluno.getNome()+" / resultado = "+ aluno.getAlunoAprovado()+ " com média de = "+ aluno.getMediaNota());
			
		
		}
		System.out.println("---------Lista dos alunos em recuperação---------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Aluno = "+aluno.getNome()+ " / resultado = "+ aluno.getAlunoAprovado()+ " com média de = "+ aluno.getMediaNota());
			
	}}}
		

