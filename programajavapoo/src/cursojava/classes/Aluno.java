package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Essa é nossa classe/objeto que representa o Aluno*/
public class Aluno {

	/*Esses são os atributos do Aluno*/
		private String nome;
	    private int idade;
		private  String dataNascimento;
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}
		/*Listas */
		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}
		
		private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		
		public Aluno() { /* Construtor Java = Cria os dados na memoria - Sendo padrão do Java*/
			
		}
		 
		public Aluno (String nomePadrao) {  
			nome = nomePadrao;
		}
		
		public Aluno (String nomePadrao, int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}
		
		
		
		/*Veremos os métodos SETTERS e GETTERS do Objeto*/
		/*SET é para adicionar ou receber dados para os atributos*/
		/*GET é para resgatar ou obter o valor do atributo*/
		
		@Override
		public String toString() {
			return "Aluno nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado+ "";
		}
		/*Void recebe e RETURN retorna*/
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getRegistroGeral() {
			return registroGeral;
		}
		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}
		public String getNumeroCpf() {
			return numeroCpf;
		}
		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}
		public String getNomeMae() {
			return nomeMae;
		}
		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}
		public String getNomePai() {
			return nomePai;
		}
		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}
		public String getDataMatricula() {
			return dataMatricula;
		}
		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}
		public String getNomeEscola() {
			return nomeEscola;
		}
		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}
		public String getSerieMatriculado() {
			return serieMatriculado;
		}
		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		public double getMediaNota() {
			double SomaNotas = 0.0;
			for (Disciplina disciplina : disciplinas) {
				SomaNotas+=disciplina.getNota();
			}
			return SomaNotas / disciplinas.size();
		}
		public String getAlunoAprovado() {
			double media = this.getMediaNota();
			if (media>=5) {
			if(media>=7) {
				return "aprovado";
			} return "recuperacao";
			}else {
				return "reprovado";
			}
		}
	

		
		@Override
		public int hashCode() {
			return Objects.hash(nome, numeroCpf);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
		}
		
		
		}
		
		
		
		


