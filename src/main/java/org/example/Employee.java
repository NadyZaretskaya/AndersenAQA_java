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
    private int salary;
    private int age;


    public Employee(String employeeName, String position, String email, String phone, int salary, int age) {
        this.employeeName = employeeName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "Name:      " + employeeName + '\n' +
                "Position:  " + position + '\n' +
                "E-mail:    " + email + '\n' +
                "Phone:     " + phone + '\n' +
                "Salary:    " + salary + '\n' +
                "Age:       " + age;
    }
}
