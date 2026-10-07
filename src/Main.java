public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Maserati");
        System.out.println("Make is: " + car.getMake());
        car.describeCar();
    }
}