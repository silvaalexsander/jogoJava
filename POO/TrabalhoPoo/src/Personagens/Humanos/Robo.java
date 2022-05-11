package Personagens.Humanos;

public class Robo extends Humanos {

    private String nome = "Robo";

    public String getNome() {
        return nome;
    }

    public Robo() {
        super(80, 20, 60);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + super.toString();


    }
}
