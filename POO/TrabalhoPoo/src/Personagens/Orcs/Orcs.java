package Personagens.Orcs;

import Personagens.Personagem;

public abstract class Orcs extends Personagem {
    private int forca;
    private int habilidade;
    private int agilidade;
    private int vitoriaOrc = 0;

    public int getVitoriaOrc() {
        return vitoriaOrc;
    }

    public String toString(){
        return "\nForça: " + getForca() + "\nHabilidade: " + getHabilidade() + "\nAgilidade: " +
                getAgilidade() + "\nVida: " + getVida();
    }

    public void setVitoriaOrc(int vitoriaOrc) {
        this.vitoriaOrc = this.vitoriaOrc + vitoriaOrc;
    }

    public Orcs(int forca, int habilidade, int agilidade) {
        this.forca = forca;
        this.habilidade = habilidade;
        this.agilidade = agilidade;
    }

    public int getForca() {
        return forca;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getAgilidade() {
        return agilidade;
    }
}
