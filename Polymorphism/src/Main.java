public class Main {

    public static void main(String[] args) {
        Vehicle honda = new Vehicle();

        honda.sound();
        honda.size(5, 3);

        Import benz = new Import();

        benz.sound();
        benz.size(5, 3);

        locallyMade ford = new locallyMade();
        ford.sound();
        ford.size(5);
    }
}
