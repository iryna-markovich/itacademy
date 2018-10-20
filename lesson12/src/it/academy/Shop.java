package it.academy;

import java.util.ArrayList;

public class Shop {
    ArrayList<Product> products = new ArrayList();
    ArrayList<Employee> employees = new ArrayList();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

}
