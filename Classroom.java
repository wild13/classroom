package classroom;

public class Classroom {

    public static void main(String[] args) {
        Wilder vincent = new Wilder("Vincent", true);
        Wilder jeanClaude = new Wilder("Jean Claude", false);

        System.out.println(vincent.whoAmI());
        System.out.println(jeanClaude.whoAmI());
    }

}
