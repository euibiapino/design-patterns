public class ExpressaoLiteral implements Expressao {
    private boolean valor;

    public ExpressaoLiteral(String valor) {
        this.valor = valor.equals("1");
    }

    @Override
    public boolean interpretar() {
        return valor;
    }
}

