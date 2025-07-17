public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();

        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");

        canal.adicionarInscrito(joao);
        canal.adicionarInscrito(maria);

        canal.postarVideo("Aula 01 - Engenharia de Software 2");
    }
}
