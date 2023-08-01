public class MyClass {
    String name;
    String surname;
    int age;
    String favoriteFood;
    String lessons[];

    public MyClass(String name, String surname, int age, String favoriteFood, String[] lessons) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteFood = favoriteFood;
        this.lessons = lessons;
    }

    public MyClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteFood = favoriteFood;

    }


}