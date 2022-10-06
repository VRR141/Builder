import java.util.Objects;

public class Person {

    private final String name;
    private final String surname;
    private Integer age;
    private String address;
    private boolean hasAge;
    private boolean hasAddress;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hasAge = true;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.hasAge = true;
        this.hasAddress = true;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.hasAddress = true;
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder().
                setName("No Name").
                setSurname(surname).
                setAge(0).
                setAddress(address);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int happyBirthday(){
        if (age != null) {
            this.age++;
            this.hasAge = true;
            return age;
        } else {
            throw new RuntimeException("not enough information about the age");
        }
    }

    public boolean hasAge() {
        return hasAge;
    }

    public boolean hasAddress() {
        return hasAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
        this.hasAddress = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
