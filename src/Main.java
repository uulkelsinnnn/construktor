import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] person1Lessons = {"JAVA", "SoftSkills"};
        String[] person2Lessons = {"JAVA", "English"};
        MyClass MyClass = new MyClass("Uulkelsin","Nurdinova",22,"fetuchini",person1Lessons);
        MyClass MyClass1 = new MyClass("Dianna","Mamutova",22,"Pasta",person2Lessons);
        System.out.println(MyClass.name);
        System.out.println(MyClass.surname);
        System.out.println(MyClass.age);
        System.out.println(MyClass.favoriteFood);
        System.out.println(Arrays.toString(person1Lessons));
        System.out.println("__________________________________");
        System.out.println(MyClass1.name);
        System.out.println(MyClass1.surname);
        System.out.println(MyClass1.age);
        System.out.println(MyClass1.favoriteFood);
        System.out.println(Arrays.toString(person2Lessons));


    }


}