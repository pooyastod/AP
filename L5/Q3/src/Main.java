public class Main {
    public static void main (String[] args) {
        Car car1 =CarFactory.getCar (Car.Mitsubishi);
        car1.Info();
        Car car2 =CarFactory.getCar (Car.Volvo);
        car2.Info();
    }
}

