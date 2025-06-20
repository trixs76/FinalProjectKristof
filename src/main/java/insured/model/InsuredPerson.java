package insured.model;

public class InsuredPerson {
    private String name;
    private String surname;
    private int age;
    private String phone;

    /**
     * Constructor of class InsuredPerson
     * @param name
     * @param surname
     * @param age
     * @param phone
     */
    public InsuredPerson(String name, String surname, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }
// getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return name + " " + surname + ", vek: " + age + ", telefón: " + phone;
    }
}
