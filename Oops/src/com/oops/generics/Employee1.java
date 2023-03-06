package com.oops.generics;

class Employee1<T> {
    private T name;
    private T id;
    private T salary;

    public Employee1(T name, T id, T salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name=" + name +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
