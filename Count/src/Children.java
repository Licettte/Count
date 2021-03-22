public class Children {
    public Children(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        count++;
    }

    public static final int MINIMUM_WEIGHT = 35;
    public static final int MAXIMUM_WEIGHT = 50;

    String name;
    int age;
    double weight;
    double height;

    private static int count = 0;

    public static void main(String[] args) {
        Children alice = new Children ("Alice", 7, 29, 140);
        Children erica = new Children ("Erica", 12, 35, 155);

        alice.getStatus ();
        erica.getStatus ();
        Children.getCountAll ();
    }

    public static int getCountAll() {
        System.out.println (count);
        return count;
   }

    public String getStatus() {

        if (weight < MINIMUM_WEIGHT) {
            System.out.println ("Doesn't fit");
            return "Doesn't fit";
        } else if (weight > MAXIMUM_WEIGHT) {
            System.out.println ("Doesn't fit");
            return "Doesn't fit";
        } else {
            System.out.println ("Fit");
            return "Fit";
        }}}




