public class Fruit {
    private String name;

    public String getName () {
        return name;
    }
    public Fruit (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

}
