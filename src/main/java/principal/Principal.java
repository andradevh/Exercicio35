package principal;

import model.Ave;
import model.Cachorro;


public class Principal {
    public static void main(String[] args) {
        Ave ave = new Ave("cleito");
        Cachorro cachorro = new Cachorro("joacir");

        System.out.println("Ave: " + ave.getNome());
        ave.produzirSom();
        ave.mover();

        System.out.println("\nCachorro: " + cachorro.getNome());
        cachorro.produzirSom();
        cachorro.mover();
    }
}