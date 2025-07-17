public class Main {
    public static void main(String[] args) {

        Expressao exp1 = new ExpressaoAND(
            new ExpressaoLiteral("1"),
            new ExpressaoLiteral("0")
        );
        System.out.println("1 AND 0 = " + exp1.interpretar());


        Expressao exp2 = new ExpressaoOR(
            new ExpressaoLiteral("1"),
            new ExpressaoLiteral("0")
        );
        System.out.println("1 OR 0 = " + exp2.interpretar());
    }
}
