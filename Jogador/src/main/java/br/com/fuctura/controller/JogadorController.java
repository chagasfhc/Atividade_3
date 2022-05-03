package br.com.fuctura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@Controller
public class JogadorController {

	@Autowired
	JogadorRepository repo;

	@Autowired
	Jogador j;

	@GetMapping("/jogador/listar")
	public String listar(Model model) {

		// model.addAttribute("tituloDaPagina", "Minha Pagina de Jogadores");

		List<Jogador> l = repo.findAll();
		model.addAttribute("jogadores", l);
		return "/jogador/listar";
	}

	@GetMapping("/jogador/cadastrar")
	public String cadastrar() {
		return "/jogador/cadastrar";
	}

	@PostMapping("/jogador/cadastrar")
	public String cadastrar(@RequestParam("idade") int idadeDoJogador,
			@RequestParam(name = "nome") String nomeDoJogador, @RequestParam(name = "posicao") String posicaoDoJogador,
			@RequestParam("peso") double pesoDoJogador, @RequestParam("altura") double alturaDoJogador,
			@RequestParam(name = "img") String imgDoJogador) {
		System.out.println("Nome: " + nomeDoJogador);
		System.out.println("Idade: " + idadeDoJogador);
		System.out.println("Posição: " + posicaoDoJogador);
		System.out.println("Peso: " + pesoDoJogador);
		System.out.println("Altura: " + alturaDoJogador);
		System.out.println("Imagem: " + imgDoJogador);

		Jogador j = new Jogador();
		j.setIdade(idadeDoJogador);
		j.setNome(nomeDoJogador);
		j.setPosicao(posicaoDoJogador);
		j.setPeso(pesoDoJogador);
		j.setAltura(alturaDoJogador);
		j.setImg(imgDoJogador);

		repo.save(j);

		return "/jogador/cadastrar";
	}

	@GetMapping("/jogador/remover")
	public String remover() {
		return "/jogador/remover";
	}

	@PostMapping("/jogador/remover")
	public String remover(@RequestParam(name = "nome2") String nomeDoJogador, Model model) {

		System.out.println(nomeDoJogador);

		return "/jogador/remover";
	}

	@GetMapping("/jogador/atualizar")
	public String atualizar() {
		return "/jogador/atualizar";
	}

}
