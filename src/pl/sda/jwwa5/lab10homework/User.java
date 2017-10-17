package pl.sda.jwwa5.lab10homework;

/**
 * This class reflects particular user, which is created in constructor with usage of the
 * following sting pattern: firstName_lastName_Age
 */
public class User {

    private String firstName;
    private String lastName;
    private Integer age;

    /**
     * Constructor with the String parameter. Constructor calls: {@link pl.sda.jwwa5.lab10homework.User#parseInputStringToArray(String)} - split input String to String Array[3]
     * @param userString with pattern firstName_lastName_Age
     */
    public User(String userString) {
        String[] splittedString = parseInputStringToArray(userString);
        this.firstName = splittedString[0];
        this.lastName = splittedString[1];
        this.age = Integer.parseInt(splittedString[2]);
    }

    /**
     * This method takes user string and using split string method, creates array of strings
     * @param userString with pattern firstName_lastName_Age
     * @return string array, where array[0]=firstName, array[1]=lastName, array[2]=age
     */
    private String[] parseInputStringToArray(String userString) {
        return userString.split("_");
    }

    @Override
    public String toString() {
        return "[" + lastName + ", " + firstName + ", " + age + "]";
    }


    //-------------------------------------

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
