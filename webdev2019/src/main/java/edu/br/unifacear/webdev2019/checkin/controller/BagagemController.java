package edu.br.unifacear.webdev2019.checkin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.br.unifacear.webdev2019.checkin.entity.Bagagem;
import edu.br.unifacear.webdev2019.checkin.service.BagagemService;

@CrossOrigin
@RestController
@RequestMapping(value="/scp/public/bagagem")
public class BagagemController {
	
	@Autowired
	private BagagemService bagagemservice;
	
	@GetMapping
	public List <Bagagem> listBagagem(){
		return bagagemservice.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Bagagem buscaBagagem(@PathVariable Long id) {
		return bagagemservice.findOne(id);
	}
	
	@GetMapping(value="/listarpcheckin/{id}")
	public List<Bagagem> listarid(@PathVariable Long id){
		return bagagemservice.listaridBagagem(id);
	}
	
	@PostMapping
	public Bagagem inserirBagagem(@RequestBody Bagagem bagagem) {
		return bagagemservice.inserirBagagem(bagagem);
	}
	
	@PatchMapping(value="/atualizar")
	public void alterarBagagem(@RequestBody Bagagem bagagem) {
		bagagemservice.alterarBagagem(bagagem);
	}
	
	@DeleteMapping(value="/{id}")
	public void deteleBagagem(@PathVariable Long id) {
		bagagemservice.deletarBagagem(id);
	}
	
}