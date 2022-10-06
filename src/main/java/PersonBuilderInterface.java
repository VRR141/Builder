public interface PersonBuilderInterface {

    PersonBuilder setName(String name);

    PersonBuilder setSurname(String surname);

    PersonBuilder setAge(int age);

    PersonBuilder setAddress(String address);

    Person build();
}
