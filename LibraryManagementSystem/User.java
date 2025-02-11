package LibraryManagementSystem;

abstract class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }
}
