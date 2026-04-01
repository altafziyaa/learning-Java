package oops;

class Car2 {

    String brand;
    int price;

    Car2(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public static void main(String[] args) {
        Car2 myCar = new Car2("Lamorghini", 40000000);

        System.out.println(myCar.brand + " " + myCar.price);
    }
}
