package lab01Completo.api001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {
	
	private int id = 0;
	private HashMap<Integer, Disciplina> disciplinas = 
			new HashMap<Integer, Disciplina>();
	
	public Disciplina addDisciplina(Disciplina disciplina) {
		disciplinas.put(id, disciplina);
		disciplina.setId(id);
		this.id++;
		return disciplina;
	}
	
	
	public Disciplina addDisciplina(String nome, double nota) {
		Disciplina disciplina = new Disciplina(nome, nota);
		disciplina.setId(id);
		this.id++;
		return disciplina;
	}
	
	public HashMap exibeDisciplinas() {
		return disciplinas;
	}
	
	public Disciplina exibeDisciplina(int id) {
		if(id<0 && id > disciplinas.size())
			return null;
		return disciplinas.get(id);
	}
	
	public Disciplina deletaDisciplina(int id) {
		if(id<0 && id > disciplinas.size())
			return null;
		return disciplinas.remove(id);
	}
	
	
	public Disciplina alteraNome(int id, String nomeNovo) {
		if(id<0 && id > disciplinas.size())
			return null;
		
		disciplinas.get(id).setNome(nomeNovo);
		return disciplinas.get(id);
	}
	
	
	public Disciplina alteraNota(int id, double notaNova) {
		if(id<0 && id > disciplinas.size())
			return null;
		
		disciplinas.get(id).setNota(notaNova);
		return disciplinas.get(id);
	}
	
	public List<Disciplina> rankingDisciplina(){
		List<Disciplina> ranking = new ArrayList(disciplinas.values());
		Collections.sort(ranking);
		
		return ranking;
	}
}





























