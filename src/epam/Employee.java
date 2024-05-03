package epam;

import java.util.Objects;

public class Employee extends User{
    String phone;
    String dateOfBirth;

    @Override
    public String toString() {
        return "Employee{" +
                "phone='" + phone + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(phone, employee.phone) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phone, dateOfBirth);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(long id, String email, String password, String name, String phone, String dateOfBirth) {
        super(id, email, password, name);
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(long id, String email, String password, String name) {
        super(id, email, password, name);
    }
}
