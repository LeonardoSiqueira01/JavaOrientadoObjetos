package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClassejava {

	public static void main(String[] args) throws FileNotFoundException {
	try { lerArquivo();
		
		
		String login = JOptionPane.showInputDialog("informe o login");
		String senha = JOptionPane.showInputDialog("informe a senha");
		
		 
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { /*se true acessa, se false não acessa*/
			
		List<Aluno>alunos = new ArrayList<Aluno>();
		
	/*hashMap é uma lista que  dentro dela temos uma chave que identifica uma sequencia de valores tambem*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		 
		for (int qtd= 1; qtd <=1; qtd++) {
		
		String nome =JOptionPane.showInputDialog("qual o nome do "+qtd+ "º aluno ? ");
		String idade = JOptionPane.showInputDialog("qual a idade do aluno?");
		/*String dataNascimento =JOptionPane.showInputDialog("qual a data de nascimento ? ");
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
		aluno1.setIdade(Integer.valueOf(idade));
		/*aluno1.setDataNascimento(dataNascimento);
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
		//	disciplina.setNota(Double.valueOf(notaDisciplina));
		
			aluno1.getDisciplinas().add(disciplina);
		}
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
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
			System.out.println("Aluno = "+aluno.getNome()+" / resultado = "+ aluno.getAlunoAprovado()+ " com média de = "+ aluno.getMediaNota());

		}System.out.println("---------Lista dos reprovados---------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno = "+aluno.getNome()+" / resultado = "+ aluno.getAlunoAprovado()+ " com média de = "+ aluno.getMediaNota());
			
		
		}
		System.out.println("---------Lista dos alunos em recuperação---------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno = "+aluno.getNome()+ " / resultado = "+ aluno.getAlunoAprovado()+ " com média de = "+ aluno.getMediaNota());
			
	}}else {
		JOptionPane.showMessageDialog(null, "acesso não autorizado!");
	}
	
		
	}catch (Exception e) {
		StringBuilder saida = new StringBuilder();
		
		e.printStackTrace();/*imprime erro no console java*/
		
		
		JOptionPane.showMessageDialog(null, "erro ao processar notas");	/*Mensagem de erro ou causa*/

		
		System.out.println("mensagem do erro:"+e.getMessage());
		
		for (int posicao = 0; posicao < e.getStackTrace().length;posicao++) {
			saida.append("\n classe de erro: "+e.getStackTrace()[posicao].getClassName());  
			saida.append("\n método de erro: "+e.getStackTrace()[posicao].getMethodName());
			saida.append("\n linha de erro: "+e.getStackTrace()[posicao].getLineNumber());
			saida.append("\n Class: "+e.getClass().getName());

		}
		JOptionPane.showMessageDialog(null, "erro de convercao de numero" + saida.toString());
	}finally {	/*Sempre é executado ocorrendo erros ou não. Porque */
/*Finally sempre é usado quando se precisa executar um processo acontecendo erro ou não no sistema*/
		JOptionPane.showMessageDialog(null, "obrigado por aprender Java comigo");
	}}
	public static void lerArquivo() throws FileNotFoundException  {
try {
		File file = new File("c://lines.txt");
		Scanner scanner = new Scanner(file);	
	} catch (FileNotFoundException e) {
		throw new FileNotFoundException(e.getMessage());
	} }
	
	}
	

		

