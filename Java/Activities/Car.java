package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

  Car() {
      tyres = 4;
      doors = 4;
  }
   public void displaycharateristic() {
       System.out.println("Color " + color);
       System.out.println("Transmissions " + transmission);
       System.out.println("Make " + make);
       System.out.println("Tyres " + tyres);
       System.out.println("Doors " + doors);
   }
       public void accelerates() {
           System.out.println("Car is moving forward");
       }
       public void brake() {
           System.out.println("Car has stopped");
       }

       }

