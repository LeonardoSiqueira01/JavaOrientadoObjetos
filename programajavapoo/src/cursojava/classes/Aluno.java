package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

/*Essa é nossa classe/objeto que representa o Aluno*/
public class Aluno extends Pessoa {

	/*Esses são os atributos do Aluno*/
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;	
		/*Lista de disciplina */
		private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

		/*setter da lista disciplina*/
		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		} /*getter da lista disciplina*/
		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}
		/*Construtor Java*/
		public Aluno() { /* Construtor Java = Cria os dados na memoria - Sendo padrão do Java*/
			
		}
		/*Construtor Java*/
		public Aluno (String nomePadrao) {  
			super.nome = nomePadrao;
		}
		/*Construtor Java*/
		public Aluno (String nomePadrao, int idadePadrao) {
			super.nome = nomePadrao;
			super.idade = idadePadrao;
		}
		
	
		
		/*Veremos os métodos SETTERS e GETTERS do Objeto*/
		/*SET é para adicionar ou receber dados para os atributos*/
		/*GET é para resgatar ou obter o valor do atributo*/
		
		@Override /*toString*/
		public String toString() {
			return "Aluno nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado+ "";
		}
		/*Setters e Getters dos atributos do aluno*/
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
				return StatusAluno.APROVADO;
			} return StatusAluno.RECUPERACAO;
			}else {
				return StatusAluno.REPROVADO;
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
		
		@Override /*Identifica método sobreescrito*/
		public boolean pessoaMaiorIdade() {
			return super.pessoaMaiorIdade();
		}
		
		public String msgMaiorIdade() {
			return this.pessoaMaiorIdade() ? "Obaaa aluno é maior de idade" : "vish.. você é menor de idade";
				
		}
		@Override
		public double salario() {
			// TODO Auto-generated method stub
			return 1500;
		}
		
		
		
		}
		
		
		
		


