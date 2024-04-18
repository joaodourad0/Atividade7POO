package model;

import java.util.ArrayList;
import java.util.List;

public class Atividade implements Avaliacao {
    private String assunto;
    private int numeroPaginas;
    private List<String> atividadesRealizadas;

    public Atividade(String assunto, int numeroPaginas) {
        this.assunto = assunto;
        this.numeroPaginas = numeroPaginas;
        this.atividadesRealizadas = new ArrayList<>();
    }

 
    public Object consultarAtividade(int posicao) {
        if (posicao >= 0 && posicao < atividadesRealizadas.size()) {
            return atividadesRealizadas.get(posicao);
        }
        return null;
    }

 
    public void limparAtividades() {
        atividadesRealizadas.clear();
    }

  
    public void realizarAtividade() {
        atividadesRealizadas.add(assunto);
    }


    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}