package oops;

class Car {

    String brand;
    String color;
    int price;

    public void engineStart() {
        System.out.println(brand + color + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "tata";
        car1.color = "red";
        car1.price = 40000;

        car1.engineStart();

        Car car2 = new Car();
        car2.brand = "toyata";
        car2.color = "black";
        car2.price = 59000;

        car2.engineStart();

    }
}
