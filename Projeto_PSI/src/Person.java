import java.time.Year;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person() {
        this.name = "Jonh";
        this.surname = "Cook";
        this.age = 20;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public int getAge() {
        return this.age;
    }

    public int CalculateYearOfBirth(int year) {
        return Year.now().getValue() - year;
    }

    public String toString() {
        String res = "Nome:" + this.getName() + " " + this.getSurname() + " Idade:" + this.getAge() + " Anos";
        return res;
    }

    public void CompareTowPersons(Person a, Person b) {
        IO.println("Quem tem mais idade");
        if (a.getAge() > b.getAge()) {
            IO.println("A pessoa A é mais velha");
        } else {
            IO.println("A pessoa b é mais velha");
        }

    }
}

