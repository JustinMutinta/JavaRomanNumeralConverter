public class Vehicle {

    public void size(int height, int width){
        System.out.println("The vehicle is " + height + " tall and " + width + " wide.");
    }

    public  void sound(){
        System.out.println("The sound made is 'Vroom'");
    }
}

class Import extends Vehicle{

    public void sound(){
        System.out.println("The sound made is 'Expensive'");
    }
}

class locallyMade extends Vehicle{

    public void size(int height){
        System.out.println("The vehicle is " + height + " tall");
    }
}