package by.itacademy.lesson13;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomersTest {
    @Test
    public void sortByNameShouldBeValid() {
        List<Customer> toSort = new ArrayList<>();
        toSort.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));
        toSort.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        toSort.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));

        Customers customers = new Customers(toSort);
        customers.sortByName();

        List<Customer> expected = new ArrayList<>();
        expected.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        expected.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));
        expected.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));

        Assert.assertEquals(expected, customers.getCustomers());
    }

    @Test
    public void sortByNameShouldBeInvalid() {
        List<Customer> toSort = new ArrayList<>();
        toSort.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));
        toSort.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        toSort.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));

        Customers customers = new Customers(toSort);
        customers.sortByName();

        List<Customer> expected = new ArrayList<>();
        expected.add(new Customer(1, "Ivan", LocalDate.of(2018, 5, 22), LocalDate.of(2000, 5, 23), Arrays.asList("bmw 5", "opel"), true));
        expected.add(new Customer(0, "Mary", LocalDate.of(2006, 8, 2), LocalDate.of(1987, 1, 30), Arrays.asList("peugeot", "mazda"), true));
        expected.add(new Customer(2, "Mark", LocalDate.of(2017, 10, 22), LocalDate.of(1967, 11, 3), Arrays.asList("mercedes"), false));

        Assert.assertNotEquals(expected, customers.getCustomers());
    }
}
