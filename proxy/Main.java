public class Main {
    public static void main(String[] args) {
        Graphic g = new ImageProxy(new Image());
        g.draw();
        g.getExtent();
    }
}
