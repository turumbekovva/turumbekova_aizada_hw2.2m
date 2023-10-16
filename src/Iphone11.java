public class Iphone11 extends Apple implements Printable {
    int display;

    public int getDisplay() {
        return display;
    }

    public Iphone11(String model, int releaseDate, int version, int display) {
        super(model, releaseDate, version);
        this.display = display;
    }


    @Override
    public void print() {
        System.out.println( "Model: " + getModel() + "Release date: " + getReleaseDate() +
                "Version: " + getVersion() + "Display: " + getDisplay());
    }
}
