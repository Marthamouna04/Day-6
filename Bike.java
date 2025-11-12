public class Bike{
    String bikeName;
    String bikeModel; 
    String yearOfmanufacture;
    public Bike(){
        System.out.println("Non parameterized");
        bikeName = "none";
        bikeModel = "none";
        yearOfmanufacture= "none";
    }
    public Bike(String bName,String bModel,String yom){
        System.out.println("parameterized constructor");
        bikeName = bName;
        bikeModel= bModel;
        yearOfmanufacture = yom;
    }
    public void printData(){
        System.out.println(bikeName+" "+bikeModel+ " " + yearOfmanufacture);
    }
    public static void main (String[] args){
        Bike b1 = new Bike();
        b1.printData();
        System.out.println();
        Bike bike = new Bike("Himalayan","2023","2024");
        bike.printData();
        System.out.println();
    }
}