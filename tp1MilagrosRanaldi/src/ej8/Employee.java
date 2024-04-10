package ej8;


    public abstract class Employee {
        private String name;
        private int age;
        private double salary;
        private boolean capacityToWork;

        public Employee() {
        }

        public Employee(String name, int age, double salary, boolean capacityToWork) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.capacityToWork = capacityToWork;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public boolean isCapacityToWork() {
            return capacityToWork;
        }

        public void setCapacityToWork(boolean capacityToWork) {
            this.capacityToWork = capacityToWork;
        }
    }

