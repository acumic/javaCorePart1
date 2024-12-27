package task1;

public class Task1 {

    public static void main(String[] args) {

        Test test = new Test(4, new int[]{1, 2, 3, 4});
        System.out.println(test.isValid());

        Test test1 = new Test(4, new int[]{1, 2, 3, 0});
        System.out.println(test1.isValid());

    }

}