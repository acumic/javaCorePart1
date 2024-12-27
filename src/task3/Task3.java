package task3;

public class Task3 {
    public static void main(String[] args) {
        Person p1 = new Person("John Doe", 20);
        Person p2 = new Person("Jane Doe", 40);

        MakingChanges.changeIdentities(p1, p2);
    }
}