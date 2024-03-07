package zipcode.rocks;


public class Person {
    private String firstname;
    private String lastname;
    private String color;
    private String month;
    private String pet;
    private String handle;

    public Person(String fname, String lname, String color, String month, String pet, String handle) {
        this.firstname = fname;
        this.lastname = lname;
        this.color = color;
        this.month = month;
        this.pet = pet;
        this.handle = handle;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname
                + this.color + this.month + this.pet + this.handle;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getPet() {
        return pet;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
    public String getHandle() {
        return handle;
    }

    public void setPet(String aTrue) {
    }
}
