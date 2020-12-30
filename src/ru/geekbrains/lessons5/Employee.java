package ru.geekbrains.lessons5;

public class Employee {
    private String fio;
    private String post;
    private String email;
    private int telephoneNumber;
    private int salary;
    private int age;
    public Employee(String fio, String post, String email, int telephoneNumber, int salary, int age){
        this.fio=fio;
        this.post=post;
        this.email=email;
        this.telephoneNumber=telephoneNumber;
        this.salary=salary;
        this.age=age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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
    public void setFio(String fio){
    }
    public String getFio(){
        return fio;
    }
    public void setPost(String post){
    }
    public String getPost(){
        return post;
    }

    public void info(){
        System.out.println("ФИО "+fio+"; должность "+post+"; Email "+email+"; Номер телефона "+telephoneNumber+"; Зарплата "+post+"у.е."+"; возраст "+age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0]= new Employee("Ivanov Ivan","Mechanic","IvanovIvan@gamil.ru",896523123,21000,26);
    }
}

