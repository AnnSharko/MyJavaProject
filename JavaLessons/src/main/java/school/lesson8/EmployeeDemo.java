package lesson_8;

import school.lesson8.Employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrovp@mailbox.com", "891112345", 50000, 45);
        employees[2] = new Employee("Sidorov Sidor", "Director", "sidorov@mailbox.com", "899988877", 70000, 50);
        employees[3] = new Employee("Smirnov Sergey", "Analyst", "smirnovs@mailbox.com", "890055533", 40000, 41);
        employees[4] = new Employee("Kuznetsova Olga", "HR", "kuznetsovao@mailbox.com", "893344556", 35000, 25);

        System.out.println("Employees older than 40:");

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
