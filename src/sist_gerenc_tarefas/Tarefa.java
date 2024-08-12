package sist_gerenc_tarefas;

public class Tarefa {
	
	/*1. Crie uma classe Tarefa com os seguintes atributos:
		a. String titulo
		b. String descricao
		c. boolean concluida
	2. Implemente os métodos necessários na classe Tarefa:
		a. Construtor para inicializar os atributos.
		b. Métodos getters e setters.
		c. Método toString() para exibir as informações da tarefa.*/
	
	//atributos encapsulados
	protected String titulo;
	protected String descricao;
	protected boolean concluida;
	
	//construtor para inicializar os atributos
	public Tarefa(String titutlo, String descricao, boolean concluida) {
		this.titulo = titutlo;
		this.descricao = descricao;
		this.concluida = concluida;
	}

	//métodos getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitutlo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	//método toString para exibir as informações da tarefa
	public String toString() {
		return "Tarefa [titulo=" + titulo + ", descricao=" + descricao + ", concluida=" + concluida + "]";
	}
}
