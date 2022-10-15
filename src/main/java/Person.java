import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surName;
    protected int age;
    protected String city;

//    public Person(String name, String surName) {
//        this.name = name;
//        this.surName = surName;
//    }
//
//    public Person(String name, String surName, int age) {
//        this.name = name;
//        this.surName = surName;
//        if (!hasAge()) {
//            this.age = age;
//        }
//    }

    public Person(String name, String surName, int age, String city) {
        this.name = name;
        this.surName = surName;
        if (!hasAge()) {
            this.age = age;
        }
        if (hasAddress()) {
            this.city = city;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurName(this.surName);
        personBuilder.setAge(15);
        personBuilder.setAddress(this.city);
        return personBuilder;
    }

    public boolean hasAge() {
        if (getAge().getAsInt() > 0) {
            return true;
        } else return false;
    }

    public boolean hasAddress() {
        if (city == null) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String city) {
        if (hasAddress()) {
            this.city = city;
        }
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        } else System.out.println("Возраст для " + name + " был не указан!");

    }

    @Override
    public String toString() {
        return "Person: " +
                "name = " + name +
                ", surName = " + surName +
                ", age = " + age +
                ", city = " + city;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
