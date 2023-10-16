public abstract class Apple  implements Printable {
    String model;
    int releaseDate;
    int version;

    public String getModel() {
        return model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getVersion() {
        return version;
    }

    public Apple(String model, int releaseDate, int version) {
        this.model = model;
        this.releaseDate = releaseDate;
        this.version = version;
    }
}
