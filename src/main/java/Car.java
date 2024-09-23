public class Car {
    String brand;
    String type;
    int build;
    String color;
    double motor;

    public Car(String brand, String type, int build, String color, double motor) {
        this.brand = brand;
        this.type = type;
        this.build = build;
        this.color = color;
        this.motor = motor;
    }

    public void bliebbloeb() {
        System.out.println("Deze "+ brand + " " + type + " is " + color);
    }

}

