package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
public static void main(String[] args) {
	
	Aluno aluno = new Aluno();
	aluno.setNome("Leonardo  Siqueira");
	aluno.setNomeEscola("jdev - treinamento");
	aluno.setIdade(22);
	
	Diretor diretor = new Diretor();
	diretor.setRegistroGeral("41414141");
	diretor.setNome("edigio");
	diretor.setIdade(66);
	
	Secretario secretario = new Secretario();
	secretario.setExperiencia("administração");
	secretario.setNumeroCpf("312341313112");
	secretario.setIdade(25);
	
	System.out.println(aluno);
	System.out.println(diretor);
	System.out.println(secretario);
	
	System.out.println(aluno.pessoaMaiorIdade() + " - "+ aluno.msgMaiorIdade());
	System.out.println(diretor.pessoaMaiorIdade());
	System.out.println(secretario.pessoaMaiorIdade());
	
	
}
}
