package ru.javacore;

public class Tester {
    String name;
    String surname;
    int expInYears;
    String engLvl;
    double salary;

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int exp, String engLvl) {
        this(name, surname);
        this.expInYears = exp;
        this.engLvl = engLvl;
    }

    public Tester(String name, String surname, int exp, String engLvl, double salary) {
        this(name, surname, exp, engLvl);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.expInYears + " " + this.engLvl + " " + this.salary + "руб./ч.";
    }

    public double getSalary(int hours) {
        return this.salary * hours;
    }

    public double getSalary(double days) {
        return this.salary * days * 8;
    }

    public double getSalary(double days, double weekends) {
        return this.salary * (days - weekends) * 8;
    }

    public static void main(String[] args) {
        Tester tester = new Tester("Анна", "Анисова", 2, "В1", 100);
        System.out.println(tester);
        System.out.println("Зарплата за 20ч.: " + tester.getSalary(20) + "руб.");
        System.out.println("Зарплата за 20 дней: " + tester.getSalary(20.0) + "руб.");
        System.out.println("Зарплата за 20 дней (4 выходных): " + tester.getSalary(20, 4) + "руб.");
    }
}

/*
    public void improveEnglish(int days) {
        if (days < 90)
            System.out.println("Уровень английского у сотрудника " + this.name + " не повышен. Уровень сейчас: " + this.engLvl);
        if (this.engLvl == "A1")
            this.engLvl = "A2";
        if (this.engLvl == "A2")
            this.engLvl = "B1";
        if (this.engLvl == "B1")
            this.engLvl = "B2";
        if (this.engLvl == "B2")
            this.engLvl = "C1";
        if (this.engLvl == "C1")
            this.engLvl = "C2";
        System.out.println("Уровень английского у сотрудника " + this.name + " повышен. Новый уровень: " + this.engLvl);
    }
*/
