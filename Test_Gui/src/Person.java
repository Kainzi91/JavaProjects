public class Person {
    private String firstname;
    private String lastname;
    private boolean married;
    private String phoneHome;
    private String faxHome;
    private String email;
    private String company;
    private String phoneWork;
    private String phoneFax;

    public Person() {
    }

    public Person(String firstname, String lastname, boolean married, String phoneHome, String faxHome, String email, String company, String phoneWork, String phoneFax) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.married = married;
        this.phoneHome = phoneHome;
        this.faxHome = faxHome;
        this.email = email;
        this.company = company;
        this.phoneWork = phoneWork;
        this.phoneFax = phoneFax;
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

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getFaxHome() {
        return faxHome;
    }

    public void setFaxHome(String faxHome) {
        this.faxHome = faxHome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork;
    }

    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax;
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", married=" + married +
                ", phoneHome='" + phoneHome + '\'' +
                ", faxHome='" + faxHome + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", phoneWork='" + phoneWork + '\'' +
                ", phoneFax='" + phoneFax + '\'' +
                '}';
    }




}
