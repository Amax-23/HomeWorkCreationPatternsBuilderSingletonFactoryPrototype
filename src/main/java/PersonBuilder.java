import java.util.OptionalInt;

public class PersonBuilder {
    private String name;
    private String surName;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public PersonBuilder setAge(int age) {
            if (age > 0) {
                this.age = age;
                return this;
            } else throw new IllegalArgumentException("Возраст не может быть отрицательным!");


    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        String e = "Отсутствует обязательные данные объекта!";
        if (name == null) {
            throw new IllegalStateException(e);
        } else if (surName == null) {
           throw new IllegalStateException(e);

        } else
        return new Person(name, surName, age, address);
    }

}
