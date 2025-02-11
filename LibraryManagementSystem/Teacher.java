package LibraryManagementSystem;

public class Teacher extends User {
    private int researchBooksBorrowed;

    public Teacher(String name, int id) {
        super(name, id);
        this.researchBooksBorrowed = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + name + " (ID: " + id + "), Research Books Borrowed: " + researchBooksBorrowed);
    }

    public void borrowResearchBook() {
        researchBooksBorrowed++;
    }

}
