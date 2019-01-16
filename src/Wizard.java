public class Wizard {
    private String firstName;
    private String lastName;
    private String fullName = firstName + " " + lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }


    public String getFullName() {
        return fullName;
    }


}


