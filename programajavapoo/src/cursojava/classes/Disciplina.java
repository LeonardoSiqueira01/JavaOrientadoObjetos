package cursojava.classes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/*Essa classe disciplina servirá para todos objetos e instancias de notas e materias*/
public class Disciplina {

	/*2 atributos na classe disciplina*/
	private String Disciplina;
	/*Cada disciplina tera 4 notas durante o ano inteiro*/
	private double[] Nota = new double[4];
	
	/*getters e setters dos atributos*/
	

	public String getDisciplina() {
		return Disciplina;
	}

	public double[] getNota() {
		return Nota;
	}

	public void setNota(double[] nota) {
		Nota = nota;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(Nota);
		result = prime * result + Objects.hash(Disciplina);
		return result;
	}

	public double getMediaNotas() {
		double somaTotal =0;
		for (int  pos = 0; pos < Nota.length;  pos++) {
			somaTotal += Nota[pos];	
		}
		return somaTotal/4;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(Disciplina, other.Disciplina) && Arrays.equals(Nota, other.Nota);
	}

	@Override
	public String toString() {
		return "Disciplina [Nota=" + Nota + ", Disciplina=" + Disciplina + "]";
	}

	
}
