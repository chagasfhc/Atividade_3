package br.com.fuctura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import br.com.fuctura.model.Jogador;

@SpringBootApplication
public class JogadorApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JogadorApplication.class, args);

		Jogador j = context.getBean(Jogador.class);

		System.out.println("J:" + j.getNome());
	}

	@Bean
	public Jogador getBean() {
		Jogador j = new Jogador("Sou um Bean");
		return j;
	}

}
