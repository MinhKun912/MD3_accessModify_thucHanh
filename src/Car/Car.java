package Car;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String name,String engine){
        this.name=name;
        this.engine=engine;
        numberOfCar++;
    }
    public String getName(String name){
        return this.name=name;
    }
    public String getEngine(String engine){
        return this.engine=engine;
    }

}
