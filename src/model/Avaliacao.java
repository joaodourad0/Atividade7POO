package model;
	
	public interface Avaliacao {
	    
	    default double gerarNota() {
	        return Math.random() * 10.0;
	    }

	    Object consultarAtividade(int posicao);
	    
	    void limparAtividades();
	}


