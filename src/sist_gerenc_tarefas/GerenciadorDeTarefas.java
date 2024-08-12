package sist_gerenc_tarefas;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
	
	/*3. Crie uma classe GerenciadorDeTarefas que utilize um ArrayList para armazenar as
	tarefas: */
	
	ArrayList<Tarefa> tarefas = new ArrayList<>();
	
	//a. Método adicionarTarefa(Tarefa tarefa) para adicionar uma nova tarefa.
	public void adicionarTarefa(Tarefa tarefa) 	{
		tarefas.add(tarefa);
	}
	
	//b. Método removerTarefa(String titulo) para remover uma tarefa pelo título.
	public void removerTarefa(String titulo) {
		for(Tarefa t: tarefas) {
			if(t.getTitulo().equals(titulo)) {
				tarefas.remove(t);
				System.out.println("Tarefa removida com sucesso!");
			} else {
				System.out.println("A tarefa não pôde ser removida. Verifique o título e tente novamente.");
			}
		}
	}
	
	//c. Método marcarComoConcluida(String titulo) para marcar uma tarefa como concluída.
	public void marcarComoConcluida(String titulo) {
		for(Tarefa t: tarefas) {
			if (t.getTitulo().equals(titulo)) {
				t.setConcluida(true);
				System.out.println("Tarefa concluída com sucesso!");
			} else {
				System.out.println("A tarefa não pôde ser concluída. Verifique o título e tente novamente.");
			}
		}
	}
	
	//d. Método listarTarefas() para exibir todas as tarefas, indicando se estão concluídas ou não.
	public void listarTarefas() {
	    for (Tarefa tarefa : tarefas) {
	        System.out.println(tarefa);
	    }
	}
	
	/*4. Crie um método main na classe GerenciadorDeTarefas para testar o sistema,
	incluindo a adição de algumas tarefas, a marcação de uma como concluída e a
	listagem de todas as tarefas.*/
	public static void main(String[] args) {
		
        //Instanciando um objeto do GerenciadorDeTarefas
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        //Adicionando algumas tarefas
        gerenciador.adicionarTarefa(new Tarefa("Estudar Java", "Estudar ArrayList e classes", false));
        gerenciador.adicionarTarefa(new Tarefa("Fazer compras", "Comprar frutas e legumes", false));
        //gerenciador.listarTarefas();   
        
       //Marcando uma tarefa como concluída
        gerenciador.marcarComoConcluida("Estudar Java");
        //gerenciador.listarTarefas();
        
        //Listagem de todas as tarefas
        gerenciador.listarTarefas();
    }
}


