package model;

import java.util.ArrayList;
import java.util.List;

public class ControleAvaliacoes implements Avaliacao {
    private List<Avaliacao> avaliacoes;

    public ControleAvaliacoes() {
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public Object consultarAtividade(int posicao) {
        for (Avaliacao avaliacao : avaliacoes) {
            Object atividade = avaliacao.consultarAtividade(posicao);
            if (atividade != null) {
                return atividade;
            }
        }
        return null;
    }

    public void limparAtividades() {
        for (Avaliacao avaliacao : avaliacoes) {
            avaliacao.limparAtividades();
        }
    }
}