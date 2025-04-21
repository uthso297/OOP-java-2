package BLC_Problem;

abstract class User {
    protected String firstName;
    protected String lastName;
    protected String department;
    protected int age;

    public User(String firstName, String lastName, String department, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public abstract void displayInfo();
}
