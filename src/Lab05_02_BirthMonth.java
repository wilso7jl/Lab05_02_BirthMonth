public class Lab05_02_BirthMonth {
    public static void main(String[] args) {
        int birthMonth;
        System.out.println("What is your birth month? enter a value 1-12");
        birthMonth = 11;
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You've entered an impossible value");
        }
    }
}