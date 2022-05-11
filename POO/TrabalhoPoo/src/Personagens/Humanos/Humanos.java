package Personagens.Humanos;

import Personagens.Personagem;

public abstract class Humanos extends Personagem {
    private int inteligencia;
    private int velocidade;
    private int equipamento;
    private int vitoriaHumana = 0;

    public int getVitoriaHumana() {
        return vitoriaHumana;
    }

    public String toString(){
        return "\nInteligencia: " + getInteligencia() + "\nVelocidade: " + getVelocidade() + "\nEquipamento: " +
                getEquipamento() + "\nVida: " + getVida();
    }

    public void setVitoriaHumana(int vitoriaHumana) {
        this.vitoriaHumana = this.vitoriaHumana + vitoriaHumana;
    }

    public Humanos(int inteligencia, int velocidade, int equipamento) {
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
        this.equipamento = equipamento;
    }

    public int getInteligencia() {
        return inteligencia;
    }



    public int getVelocidade() {
        return velocidade;
    }

    public int getEquipamento() {
        return equipamento;
    }
}

