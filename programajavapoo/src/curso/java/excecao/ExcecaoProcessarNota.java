package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception{

	public ExcecaoProcessarNota(String erro) {
		super("erro no processamento das notas do aluno : "+ erro);
	}
}
