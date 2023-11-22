import java.util.Objects;

public class Employee {

  private String fullName;
  private double salary;
  private int department;
  private final int id;
  private static int counter = 1;

  public Employee(String fullName, double salary, int department) {
    this.fullName = fullName;
    this.salary = salary;
    this.department = department;
    this.id = counter++;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getDepartment() {
    return department;
  }

  public void setDepartment(int department) {
    this.department = department;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "ФИО - " + fullName + ", Зарплата - " + salary +
        ", Департамент " + department +
        ", ID - " + id + ";";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Double.compare(salary, employee.salary) == 0 && department == employee.department
        && id == employee.id && Objects.equals(fullName, employee.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, salary, department, id);
  }
}
