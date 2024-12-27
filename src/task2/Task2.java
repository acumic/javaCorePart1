package task2;

public class Task2 {
    public static void main(String[] args) {

        String stringToReverse = "I'm going to go to school today morning.";
        Reverse reverse = new Reverse(stringToReverse);
        reverse.reverse1();
        reverse.reverse2();
        reverse.reverse3();
    }
}