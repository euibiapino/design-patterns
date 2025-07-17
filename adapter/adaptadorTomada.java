public class adaptadorTomada implements tomadaTresPinos {
    private tomadaDoisPinos tomada;

    public adaptadorTomada(tomadaDoisPinos tomada) {
        this.tomada = tomada;
    }

    @Override
    public void conectar() {
        System.out.println("Adaptador convertendo conexão...");
        tomada.conectarDoisPinos();
    }
}

