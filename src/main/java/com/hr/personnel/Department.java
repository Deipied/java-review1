package com.hr.personnel;

public class Department {
    private String name;
    private String location;
    private int currentIndex = 0;
    private Employee[] employees = new Employee[100];

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        int count = 0;
        for (int i = 0; i < currentIndex; i++){
            String work = employees[i].work();
            if (employees[i].toString().contains("worked")) {
                count ++;
            }
        }
        return count;
    }

    public double computeDepartmentMonthlyTotalCompensation() {
        double departmentTotalMonthlyCompensation = 0.0;

        for (int i = 0; i < currentIndex; i++){
            System.out.println("employee class = " + employees[i].getClass());
            double monthlyCompensation = employees[i].computeMonthlyCompensation();
            departmentTotalMonthlyCompensation += monthlyCompensation;
        }

        return departmentTotalMonthlyCompensation;
    }
}
