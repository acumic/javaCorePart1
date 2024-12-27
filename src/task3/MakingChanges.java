package task3;

public class MakingChanges {
    public static void changeIdentities(Person p1, Person p2){
        System.out.println("Before: \n" +
                "Person 1- Name: " + p1.name + ", Age: " + p1.age +
                "\nPerson 2- Name: " + p2.name + ", Age: " + p2.age);
        Person p3 = p1;
        p1 = p2;
        p2 = p3;
        System.out.println("After: \n" +
                "Person 1- Name: " + p1.name + ", Age: " + p1.age +
                "\nPerson 2- Name: " + p2.name + ", Age: " + p2.age);
    }
}