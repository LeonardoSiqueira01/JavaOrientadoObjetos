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
	
	 System.out.println("Nome do aluno = "+ aluno.getNome() + " inscrito no curso"+ aluno.getNomeEscola());
	 for (Disciplina d : aluno.getDisciplinas()) {
		System.out.println("--------------Disciplina do aluno-----------");
		System.out.println("Disciplina : "+ d.getDisciplina());
		System.out.println("As notas da disciplina são : "); 
		
		double notaMax = 0.0;
		for(int pos = 0; pos <d.getNota().length; pos++) {
			System.out.println("Nota "+pos +" é igual = "+d.getNota()[pos]);
			if (pos==0) {
				notaMax = d.getNota()[pos];
			}else {
				if (d.getNota()[pos]> notaMax) {
					notaMax = d.getNota()[pos];
				}
			}
			} System.out.println("A maior nota da disciplina = "+d.getDisciplina()+" e de valor :"+notaMax);
		}
	 }
 }

