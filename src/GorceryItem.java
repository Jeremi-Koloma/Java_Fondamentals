public record GorceryItem(String name, String type, int count) {

    public GorceryItem(String name) {
        this(name, "DARIS", 1);
    }
}
