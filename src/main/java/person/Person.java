package person;

class Person {
    private String name, lastName;

    Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    String getFullName() {
        return name + " " + lastName;
    }
}

