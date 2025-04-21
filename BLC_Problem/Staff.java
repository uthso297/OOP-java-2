package BLC_Problem;

public class Staff extends User {
    public int staffId;
    private double staffSalary;

    public Staff(String firstName, String lastName, String department, int age) {
        super(firstName, lastName, department, age);
        this.staffSalary = 30000.00;
    }

    @Override
    public void displayInfo() {

        System.out.println("Staff's ID: " + staffId);
        System.out.println("Staff's first name: " + firstName);
        System.out.println("Staff's last name: " + lastName);
        System.out.println("Staff's department: " + department);
        System.out.println("Staff's age: " + age);
        System.out.println("Staff's salary: " + staffSalary);

    }

    public double bonus() {
        staffSalary = (staffSalary + ((staffSalary * 50) / 100)) * 12;
        return staffSalary;
    }
}
