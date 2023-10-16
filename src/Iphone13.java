public class Iphone13 extends Apple implements Printable{
    String camera;

    public Iphone13(String model, int releaseDate, int version, String camera) {
        super(model, releaseDate, version);
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() + "Release date: " + getReleaseDate() +
                "Version: " + getVersion() );
    }
}
