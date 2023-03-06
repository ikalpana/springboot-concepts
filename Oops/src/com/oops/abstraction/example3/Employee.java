package com.oops.abstraction.example3;

public abstract class Employee {

        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

       public void instanceMethod()
        {
            System.out.println("Name: " +name);
            System.out.println("Id: " +id);
        }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

