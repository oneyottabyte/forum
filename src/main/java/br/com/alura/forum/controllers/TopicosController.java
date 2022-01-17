package br.com.alura.forum.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controllers.dto.TopicoDTO;
import br.com.alura.forum.models.Topico;
import br.com.alura.forum.repositories.TopicoRepository;

@RestController
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		List<Topico> topicos = topicoRepository.findAll();
		return TopicoDTO.converter(topicos);
	}
}
