package model;

public class View {

	    public static void main(String[] args) {
	        ControleAvaliacoes controle = new ControleAvaliacoes();


	        Prova prova1 = new Prova(10);
	        Prova prova2 = new Prova(15);
	        controle.adicionarAvaliacao(prova1);
	        controle.adicionarAvaliacao(prova2);


	        prova1.realizarProva();
	        prova2.realizarProva();

	        
	        Atividade atividade1 = new Atividade("Java Programming", 5);
	        Atividade atividade2 = new Atividade("Database Design", 8);
	        controle.adicionarAvaliacao(atividade1);
	        controle.adicionarAvaliacao(atividade2);

	        atividade1.realizarAtividade();
	        atividade2.realizarAtividade();


	        for (int i = 0; i < 2; i++) {
	            System.out.println("Prova " + i + ": " + controle.consultarAtividade(i));
	        }
	        for (int i = 2; i < 4; i++) {
	            System.out.println("Atividade " + (i - 2) + ": " + controle.consultarAtividade(i));
	        }


	        controle.limparAtividades();
	    }
	}