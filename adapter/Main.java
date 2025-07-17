public class Main {
    public static void main(String[] args) {
        tomadaDoisPinos tomada2 = new tomadaDoisPinos();
        tomadaTresPinos adaptador = new adaptadorTomada(tomada2);

        System.out.println("Conectando em uma tomada de três pinos:");
        adaptador.conectar();
    }
}

