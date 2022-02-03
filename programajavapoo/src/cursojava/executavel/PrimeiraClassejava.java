package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClassejava {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("informe o login");
		String senha = JOptionPane.showInputDialog("informe a senha");
		
		if(login.equalsIgnoreCase("admin")&& senha.equals("admin"))  {
		List<Aluno>alunos = new ArrayList<Aluno>();
		
	/*hashMap � uma lista que  dentro dela temos uma chave que identifica uma sequencia de valores tambem*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		
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
		for (int pos = 1; pos <=1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("nome da Disciplina "+pos+ " ?");
			String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina "+pos+ " ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
		
			aluno1.getDisciplinas().add(disciplina);
		}
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
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
		for (Aluno aluno : alunos) {/*separado em listas*/
			if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
				if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);	
				}else
					if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
		}	System.out.println("---------Lista dos aprovados---------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno = "+aluno.getNome()+" / resultado = "+ aluno.getAlunoAprovado()+ " com m�dia de = "+ aluno.getMediaNota());
			

		}System.out.println("---------Lista dos reprovados---------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno = "+aluno.getNome()+" / resultado = "+ aluno.getAlunoAprovado()+ " com m�dia de = "+ aluno.getMediaNota());
			
		
		}
		System.out.println("---------Lista dos alunos em recupera��o---------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno = "+aluno.getNome()+ " / resultado = "+ aluno.getAlunoAprovado()+ " com m�dia de = "+ aluno.getMediaNota());
			
	}}}}
		

