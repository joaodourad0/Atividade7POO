package model;

import java.util.ArrayList;
import java.util.List;


public class Prova implements Avaliacao {
 private int numeroQuestoes;
 private double mediaNotas;
 private List<Double> atividadesRealizadas;

 public Prova(int numeroQuestoes) {
     this.numeroQuestoes = numeroQuestoes;
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

 public void realizarProva() {
     double nota = gerarNota();
     atividadesRealizadas.add(nota);
     mediaNotas = calcularMedia();
 }


 public double calcularMedia() {
     double totalNotas = 0.0;
     for (double nota : atividadesRealizadas) {
         totalNotas += nota;
     }
     return atividadesRealizadas.isEmpty() ? 0.0 : totalNotas / atividadesRealizadas.size();
 }


 public int getNumeroQuestoes() {
     return numeroQuestoes;
 }
 public void setNumeroQuestoes(int numeroQuestoes) {
     this.numeroQuestoes = numeroQuestoes;
 }

 
 public double getMediaNotas() {
     return mediaNotas;
 }
 public void setMediaNotas(double mediaNotas) {
     this.mediaNotas = mediaNotas;
 }
}