package main.car;


public class Main {
   public static void main(String[] args) {
       int a = 5;
       int b = 6;
       Car audi = new Car();
       audi.brand = "Audi";
       audi.model = "A4";
       audi.color = "black";
       //audi.buildYear = 2005;
       
       System.out.println("Brand: " + audi.brand);
       System.out.println("Model: " + audi.model);
       System.out.println("Model: " + audi.getBuildYear());
       
       
       Car bmw = new Car();
       bmw.brand = "BMW";
       bmw.model = "X5";
       
       System.out.println("Brand: " + bmw.brand);
       System.out.println("Model: " + bmw.model);
       
       
       Car fiat = new Car(2010);
       System.out.println("Godina proizvodnje " + fiat.getBuildYear());
       
       Car lada = new Car("Lada", "Niva", "green", 2018);
       lada.printAttributes();
   
}
    
}
