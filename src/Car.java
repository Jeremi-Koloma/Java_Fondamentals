public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // Setters
    public void setMake(String make) {

        // Validation

        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();

        switch (lowerCaseMake) {
            case "holden", "Porche", "Tesla" -> this.make = "Porche";
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors " + color + " " + make + " " + model + " " + color +
                (convertible ? " Convertible" : " Not convertible"));
    }
}
