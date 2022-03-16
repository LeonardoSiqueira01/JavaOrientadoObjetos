package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
 public static void main(String[] args) {
	 double[] notas = {4.6,5.6,7.5,6.4};
	 double[] notasLogica = {1.26,4.6,6.5,8.4};
	 /*Criação do aluno*/
	 Aluno aluno = new Aluno();
	

	 aluno.setNome("Leonardo Siqueira");
	 aluno.setNomeEscola("Jdev Treinamento");
	 
	 /*Criação da Disciplina*/
	 Disciplina disciplina= new Disciplina();
	 disciplina.setDisciplina("Curso de Java");
	 disciplina.setNota(notas);
	 aluno.getDisciplinas().add(disciplina);
	 
	 
	 Disciplina disciplina2 = new Disciplina();
	 disciplina2.setDisciplina("Logica de programacao");
	 disciplina2.setNota(notasLogica);
	 aluno.getDisciplinas().add(disciplina2);
	
	 
	 Aluno aluno2 = new Aluno();
	 aluno2.setNome("Leonardo Siqueira22");
	 aluno2.setNomeEscola("Jdev Treinamento22");
	 
	 /*Criação da Disciplina*/
	 Disciplina disciplina3= new Disciplina();
	 disciplina3.setDisciplina("Curso de Java22");
	 disciplina3.setNota(notas);
	 aluno2.getDisciplinas().add(disciplina3);
	 
	 
	 Disciplina disciplina4 = new Disciplina();
	 disciplina4.setDisciplina("Logica de programacao22");
	 disciplina4.setNota(notasLogica);
	 aluno2.getDisciplinas().add(disciplina4);
	//--------------------------------------------------------------------
	 
	 Aluno[] arrayAlunos = new Aluno[2];
	 
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos =0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é "+  arrayAlunos[pos].getNome());
			for(Disciplina d: arrayAlunos[pos].getDisciplinas()) {
				System.out.println("nome da disciplina é "+ d.getDisciplina());
			for( int posnota = 0; posnota< d.getNota().length; posnota++) {
				System.out.println("A nota " + posnota+ " é : "+d.getNota()[posnota]);
			}
		}}
 } 
 }

