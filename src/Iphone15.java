public class Iphone15 extends Apple implements Printable {
    String battery ;

    public String getBatte() {
        return battery;
    }

    public Iphone15(String model, int releaseDate, int version, String batte) {
        super(model, releaseDate, version);
        this.battery = batte;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() + "Release date: " + getReleaseDate() +
                "Version: " + getVersion() );

    }
}
