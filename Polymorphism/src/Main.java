public class Main {

    public static void main(String[] args) {
        System.out.println("This is a honda");
        //We create a new object from the Vehicle class like normal.
        Vehicle honda = new Vehicle();
        //We made sure the constructors work as intended.
        honda.sound();
        honda.size(5, 3);

        System.out.println("This is a benz");
        //Now we create a new object from the Import class which extends the Vehicle class
        Import benz = new Import();
        //An example of overriding is below where we change the output of the sound() function.
        benz.sound();
        //We made no changes to the .size() function so it works like in the original class
        benz.size(5, 3);

        System.out.println("This is a ford");
        //This object is made from the locallyMade class which extends the Vehicle class
        locallyMade ford = new locallyMade();
        //Since the sound() function was not changed, it will work the same.
        ford.sound();
        //However, we OVERLOAD the size() function by changing the arguments and the output of them
        ford.size(5);
    }
}
