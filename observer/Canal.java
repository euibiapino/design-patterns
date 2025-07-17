import java.util.ArrayList;
import java.util.List;

public class Canal {
    private List<Inscrito> inscritos = new ArrayList<>();

    public void adicionarInscrito(Inscrito inscrito) {
        inscritos.add(inscrito);
    }

    public void postarVideo(String nomeDoVideo) {
        System.out.println("Canal postou: " + nomeDoVideo);
        for (Inscrito inscrito : inscritos) {
            inscrito.notificar(nomeDoVideo);
        }
    }
}
