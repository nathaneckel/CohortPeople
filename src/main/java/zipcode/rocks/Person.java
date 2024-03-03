package zipcode.rocks;

//While trying to follow the high level logic I have obviously created many dozens of errors.
//Instead of trying to fix every single error immediately I an trying to replicate the logic on a high level.
//My strong fear/aversion to fixing errors immediately - is that I tend to go on a rabbit trail
//I want to build the frame of the code first, then attack the errors.
//This may likely be completely counterintuitive to the coding process.
//The more I focus on details/errors, the slower I tend to go and the more I zoom into the problem.
//Please advise if I need to completely change the way that I approach coding.

public class Person {
    private String firstname;
    private String lastname;
    private String color;
    private String month;
    private String pet;
    private String handle

    //Looking for where / how to add the person
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
}
