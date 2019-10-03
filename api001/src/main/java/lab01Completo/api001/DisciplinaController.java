package lab01Completo.api001;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisciplinaController {

	@Autowired DisciplinaService disciplinaService;
	
	@PostMapping("v1/api/disciplinas")
	public ResponseEntity<Disciplina> addDisciplina(@RequestBody Disciplina disciplina) {
		return new ResponseEntity<Disciplina>(disciplinaService.addDisciplina(disciplina), HttpStatus.OK);
	}
	
	@GetMapping("v1/api/disciplinas")
	public ResponseEntity<HashMap> exibeDisciplinas(){
		return new ResponseEntity<HashMap>(disciplinaService.exibeDisciplinas(), HttpStatus.OK);
	}
	
	@GetMapping("v1/api/disciplinas/{id}")
	public ResponseEntity<Disciplina> exibeDisciplina(@PathVariable("id") int id){
		return new ResponseEntity<Disciplina> (disciplinaService.exibeDisciplina(id), HttpStatus.OK);
	}
	
	@DeleteMapping("v1/api/disciplinas/{id}")
	public ResponseEntity<Disciplina> deletaDisciplina(@PathVariable("id") int id){
		return new ResponseEntity<Disciplina> (disciplinaService.deletaDisciplina(id), HttpStatus.OK);
	}
	
	@PutMapping("v1/api/disciplinas/{id}/nome")
	public ResponseEntity<Disciplina> alteraNome(@PathVariable("id") int id, @RequestBody Disciplina info){
		return new ResponseEntity<Disciplina> (disciplinaService.alteraNome(id, info.getNome()), HttpStatus.OK);
	}
	
	@PutMapping("v1/api/disciplinas/{id}/nota")
	public ResponseEntity<Disciplina> alteraNota(@PathVariable("id") int id, @RequestBody Disciplina info){
		return new ResponseEntity<Disciplina> (disciplinaService.alteraNota(id, info.getNota()), HttpStatus.OK);
	}
	
	@RequestMapping("v1/api/ranking")
	public ResponseEntity<List> rankingDisciplina(){
		return new ResponseEntity<List>(disciplinaService.rankingDisciplina(), HttpStatus.OK);
	}
	
}














