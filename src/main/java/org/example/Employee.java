package org.example;

    /*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    4. Создать массив из 5 сотрудников.
    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */

public class Employee {

    private String employeeName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Employee(String employeeName, String position, String email, String phone, double salary, int age) {
        if (employeeName != null) {
            this.employeeName = employeeName;
        } else {
            System.out.print("Employee Name is required!\n");
        }
        if (position != null) {
            this.position = position;
        } else {
            System.out.print("Employee position is required!\n");
        }
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        if (age >= 14 ) {
            this.age = age;
        } else {
            System.out.print("Employee can't be less than 14 years old\n");
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName != null) {
            this.employeeName = employeeName;
        } else {
            System.out.print("Employee Name is required!\n");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position != null) {
            this.position = position;
        } else {
            System.out.print("Employee position is required!\n");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 14 ) {
            this.age = age;
        } else {
            System.out.print("Employee can't be less than 14 years old\n");
        }
    }

    public static void printEmployees(Employee employees[]) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printEmployees(Employee employee) {
        System.out.println("Only 1 required employee: \n" + employee + "-------------------");
    }

    public static void filterByAge(Employee[] employees, int age){
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee:  " + getEmployeeName() + '\n' +
                "Position:  " + getPosition() + '\n' +
                "E-mail:    " + getEmail() + '\n' +
                "Phone:     " + getPhone() + '\n' +
                "Salary:    " + getSalary() + '\n' +
                "Age:       " + getAge() + '\n';
    }

}
