package Personagens;

public abstract class Personagem {

    private int vida = 100;
    private int vitoria = 0;
    private int empate = 0;

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = this.empate + empate;
    }

    public abstract String getNome();

    public int getVida(){
        return vida;
    }

    public void perdeVida(int dano){
        this.vida = this.vida - dano;
    }

    public void ganhaVida(int life) {
        this.vida = this.vida + life;
    }
}
