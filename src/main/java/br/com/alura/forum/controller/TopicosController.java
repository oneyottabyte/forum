package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@RestController
public class TopicosController {

	public List<TopicoDTO> lista(){
		Topico topico = new Topico("Duvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		return TopicoDTO.converter(Arrays.asList(topico,topico,topico));
	}
}
