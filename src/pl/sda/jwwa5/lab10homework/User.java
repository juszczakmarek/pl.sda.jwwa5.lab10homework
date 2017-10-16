package pl.sda.jwwa5.lab10homework;

public class User {
    private String firstName;
    private String lastName;
    private Integer age;

    public User() {
    }

    public User(String userString) {
        String[] splittedString = parseInputStringToArray(userString);
        this.firstName = splittedString[0];
        this.lastName = splittedString[1];
        this.age = Integer.parseInt(splittedString[2]);
    }

    private String[] parseInputStringToArray(String userString) {
        return userString.split("_");
    }

    @Override
    public String toString() {
        return "[" + lastName + ", " + firstName + ", " + age + "]";
    }

    //-------------------------------------

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

}
