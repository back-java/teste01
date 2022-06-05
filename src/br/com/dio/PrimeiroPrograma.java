package br.com.dio;
import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Make", "Branco", 2);

        gato.setIdade(1);

        System.out.println(gato);
    }
}
