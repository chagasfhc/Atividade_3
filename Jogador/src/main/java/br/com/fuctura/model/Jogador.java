
package br.com.fuctura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jogador")
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String posicao;
	private String img;

	public Jogador(String nome) {
		this.nome = nome;
		System.out.println("Instanciei um jogador");

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Jogador(Long id, String nome, int idade, double altura, double peso, String posicao, String img) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.posicao = posicao;
		this.img = img;
	}

	public Jogador() {
		super();
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso
				+ ", posicao=" + posicao + ", img=" + img + "]";
	}
	

}