package by.itacademy.lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Customers {
    private List<Customer> customers;

    public Customers() {
        customers = new ArrayList<>();
    }

    public Customers(List<Customer> customers) {
        this.customers = customers;
    }

    public void sortByName() {

        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customers=" + customers +
                '}';
    }
}