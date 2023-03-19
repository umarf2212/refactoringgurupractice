import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        /*
         * Director gets the concrete builder object from the client.
         * That's because the application knows better which builder to use 
         * to get a specific product.
         */
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        /**
         * The final product is often retrieved from a builder object, since
         * Director is not aware and not dependent on concrete builders and 
         * products.
         */
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        /*
         * Similarly we can just build a Manual instead of a real Car object.
         */
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("Car Manual built:\n" + carManual.print());
    }
}
