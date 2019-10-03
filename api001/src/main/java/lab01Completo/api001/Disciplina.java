package lab01Completo.api001;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Disciplina implements Comparable<Disciplina>{
	private Integer id = null;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String nome;
	private double nota;
	
	@JsonCreator
	public Disciplina(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome + ", nota=" + nota + "]";
	}

	@Override
	public int compareTo(Disciplina d) {
		if(this.nota > d.getNota())
			return 1;
		if(this.nota < d.getNota())
			return -1;
		return 0;
	}
	
	
}
