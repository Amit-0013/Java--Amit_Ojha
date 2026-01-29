package lambdaAndStreams.employee;

import java.util.List;

public class TestSorting {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("Amit" , 100000),
                                      new Employee("Rishi" , 1000),new Employee("Harsh" , 2000) );
        list.stream()
                .sorted((emp1 , emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);

    }
}
