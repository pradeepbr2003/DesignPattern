package design.pattern.observer.example1;

import design.pattern.observer.example1.dto.AmazonService;
import design.pattern.observer.example1.dto.impl.Employee;
import design.pattern.observer.example1.dto.impl.Student;
import design.pattern.observer.example1.dto.interfaces.Observer;

public class ObserverPatternOne {
    public static void main(String[] args) {

        AmazonService service = new AmazonService();

        //These 2 observers subscribed to amazon service
        Observer employee1 = new Employee("Pradeep");
        Observer student1 = new Student("Poorvik");

        //These 2 observers not subscribed to amazon service
        Observer employee2 = new Employee("Roopa");
        Observer student2 = new Student("Yashika");

        service.subscribe(employee1);
        service.subscribe(student1);

        service.telecast("KGF Kannada");
    }
}
