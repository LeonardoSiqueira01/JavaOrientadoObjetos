package cursojava.classes;

import java.util.Objects;

/*Essa classe disciplina servirá para todos objetos e instancias de notas e materias*/
public class Disciplina {

	/*2 atributos na classe disciplina*/
	private String Disciplina;
	private double Nota;
	
	/*getters e setters dos atributos*/
	public double getNota() {
		return Nota;
	}

	public void setNota(double nota) {
		Nota = nota;
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	@Override/*equals e hashcode*/
	public int hashCode() {
		return Objects.hash(Disciplina, Nota);
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
		return Objects.equals(Disciplina, other.Disciplina)
				&& Double.doubleToLongBits(Nota) == Double.doubleToLongBits(other.Nota);
	}

	@Override
	public String toString() {
		return "Disciplina [Nota=" + Nota + ", Disciplina=" + Disciplina + "]";
	}

	
}
