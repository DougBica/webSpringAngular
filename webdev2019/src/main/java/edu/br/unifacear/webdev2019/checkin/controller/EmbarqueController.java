package edu.br.unifacear.webdev2019.checkin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.br.unifacear.webdev2019.checkin.entity.Embarque;
import edu.br.unifacear.webdev2019.checkin.service.EmbarqueService;

@CrossOrigin
@RestController
@RequestMapping(value="/scp/private/embarque")
public class EmbarqueController {
	
	@Autowired
	EmbarqueService embarqueService;
	
	@PreAuthorize("hasRole('GERENCIAR_PRIMEIRO_CHECKIN')")
	@GetMapping
	public List<Embarque> listarTodos(){
		return embarqueService.listarAll();
	}
	
	@PreAuthorize("hasRole('GERENCIAR_PRIMEIRO_CHECKIN')")
	@GetMapping(value="/{id}")
	public Embarque listarUm(@PathVariable Long id) {
		return embarqueService.listarOne(id);
	}
	
	@PreAuthorize("hasRole('GERENCIAR_PRIMEIRO_CHECKIN')")
	@PostMapping
	public Embarque inserirEmbarque(@RequestBody Embarque embarque) {
		return embarqueService.inserirEmbarque(embarque);
	}
	
	@PreAuthorize("hasRole('GERENCIAR_PRIMEIRO_CHECKIN')")
	@PatchMapping
	public Embarque atualizarEmbarque(@RequestBody Embarque embarque) {
		return embarqueService.alterarEmbarque(embarque);
	}
	
	@PreAuthorize("hasRole('GERENCIAR_PRIMEIRO_CHECKIN')")
	@DeleteMapping
	public void deletarEmbarque(@RequestBody Embarque embarque) {
		embarqueService.deletarEmbarque(embarque);
	}
	
	@PreAuthorize("hasRole('GERENCIAR_PRIMEIRO_CHECKIN')")
	@GetMapping(value="/checkin/{id}")
	public List<Embarque> findByCheckin(@PathVariable Long id) {
		return embarqueService.findByCheckin(id);
	}
	
}
