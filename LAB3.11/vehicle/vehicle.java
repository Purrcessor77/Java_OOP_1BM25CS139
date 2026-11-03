class Vehicle{
   String reg;
   String bnd;
}

class Car extends Vehicle{
   int drs;
   void showCar(){
      System.out.println("Reg. No. : " + reg);
      System.out.println("Brand : " + bnd);
      System.out.println("Doors : " + drs + "\n");
   }
}

class Bike extends Vehicle{
   int cc;
   void showBike(){ 
      System.out.println("Reg. No. : " + reg);
      System.out.println("Brand : " + bnd);
      System.out.println("Engine : " + cc + "\n");
   }
}

public class vehicle{
   public static void main(String args[]){
      Car c = new Car();
      c.reg = "KA-01-AB-1234";
      c.bnd = "Toyota";
      c.drs = 4;
      
      Bike b = new Bike();
      b.reg = "MH-02-CD-5678";
      b.bnd = "Yamaha";
      b.cc = 150;
      
      c.showCar();
      b.showBike();
      
   }
   
}