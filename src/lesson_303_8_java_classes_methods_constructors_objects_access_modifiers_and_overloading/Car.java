package lesson_303_8_java_classes_methods_constructors_objects_access_modifiers_and_overloading;

public class Car {

    String model;
    String make;
    int year;
    String color;
    int horsePower;


    public void startCar(){

        System.out.println("vehicle started");

    }

    public String stopCar(){
        String output = "Vehicle stopped";
        return output;
    }


}
