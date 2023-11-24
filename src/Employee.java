import java.util.Objects;

public class Employee {

  private String fullName;
  private double salary;
  private int department;
  private final int id;
  private static int counter;

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
}
