package model;

public class Cachorro implements Animal {
    private final String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public void produzirSom() {
        System.out.println("Latir");
    }

    @Override
    public void mover() {
        System.out.println("Andar");
    }

    public String getNome() {
        return nome;
    }
}
