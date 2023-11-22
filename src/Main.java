import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Employee[] employees = new Employee[11];
    Random random = new Random();
    for (int i = 0; i < employees.length; i++) {
      double salary = 100_000 + 100_000 * random.nextDouble();
      long salary1 = Math.round(salary);
      employees[i] = new Employee("name_" + i, salary1, random.nextInt(1, 5));
    }
    showInfo(employees);
    System.out.println();
    System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary(employees));
    System.out.println(
        "Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary(employees));
    System.out.println("Сумма зарплат - " + getSum(employees) + ";");
    System.out.println("Средняя зарплата - " + getAverage(employees) + ";");
    System.out.println();
    showFullName(employees);
  }

  public static void showInfo(Employee[] employees) {
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }

  public static long getSum(Employee[] employees) {
    long sum = 0;
    for (Employee employee : employees) {
      sum += employee.getSalary();
    }
    return sum;
  }

  public static Employee getEmployeeWithMinSalary(Employee[] employees) {
    Employee minEmployeeSalary = null;
    for (Employee employee : employees) {
      if (minEmployeeSalary == null || minEmployeeSalary.getSalary() > employee.getSalary()) {
        minEmployeeSalary = employee;
      }
    }
    return minEmployeeSalary;
  }

  public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
    Employee maxEmployeeSalary = null;
    for (Employee employee : employees) {
      if (maxEmployeeSalary == null || maxEmployeeSalary.getSalary() < employee.getSalary()) {
        maxEmployeeSalary = employee;
      }
    }
    return maxEmployeeSalary;
  }
  public static long getAverage(Employee[] employees) {
    return getSum(employees) / employees.length;
  }
  public static void showFullName(Employee[] employees) {
    for (Employee employee : employees) {
      System.out.println(employee.getFullName());
    }
  }
}