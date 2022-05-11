package Personagens.Humanos;

public class Soldado extends Humanos {

    private String nome = "Soldado";

    public String getNome() {
        return nome;
    }

    public Soldado() {
        super(20, 80, 40);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + super.toString();
    }
}
