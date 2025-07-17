public class Usuario implements Inscrito {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String nomeDoVideo) {
        System.out.println(nome + " foi notificado sobre o vídeo: " + nomeDoVideo);
    }
}
