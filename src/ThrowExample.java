public class ThrowExample { //
    public static void main(String[] args) {
        try {
            validAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }


    }

    static void validAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException();
        }
    }
}
