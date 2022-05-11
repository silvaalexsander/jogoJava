package Personagens.Orcs;

public class Ogro extends Orcs{

    private String nome = "Ogro";

    public String getNome() {
        return nome;
    }

    public Ogro() {
        super(60, 60, 20);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + super.toString();

    }
}
