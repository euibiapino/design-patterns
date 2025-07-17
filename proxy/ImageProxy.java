public class ImageProxy implements Graphic{

    private Image image;

    public ImageProxy(Image image) {
        this.image = image;
    }

    @Override
    public void draw() {
        System.out.println("Proxy excutou para draw.");
        image.draw();
    }

    @Override
    public void getExtent() {
        System.out.println("Proxy excutou para getExtent.");
        image.getExtent();
    }
}
