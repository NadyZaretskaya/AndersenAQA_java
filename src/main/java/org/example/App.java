package org.example;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Frederick Durst", "Songwriter", "f.durst@ex_mail.com",
                "+375 212 456 123", 150000.56, 50);
        employees[1] = new Employee("Jimmy Pop", "Musician", "j.pop@ex_mail.com",
                "+375 212 456 123", 45000, 48);
        employees[2] = new Employee("Damon Albarn", "Singer", "d.albarn@ex_mail.com",
                "+375 212 456 123", 68000.05, 53);
        employees[3] = new Employee("Matthew James Bellamy", "Musician",
                "m.j.bellamy@ex_mail.com", "+375 212 456 123", 78000, 39);
        employees[4] = new Employee("Dero Goi", "Poet", "d.goi@ex_mail.com",
                "+375 212 456 123", 63000.55, 40);

        //Вывод информации о сотруднике в консоль
        Employee.printEmployees(employees[1]);

        //Вывод в консоль информации о всех сотрудниках
        Employee.printEmployees(employees);

        //Вывод информации о сотрудниках старше 40 лет в консоль
        System.out.println("Employees elder than 40 years:--------->\n");
        Employee.filterByAge(employees, 40);

    }





}
