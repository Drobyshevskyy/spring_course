package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            /*Session session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Ivanov"
                    , "IT", 500);
            Detail detail = new Detail("Baku", "1234567890"
                    ,"ivanivanov@gmail.com");
            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("done !");*/

            /*Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Smirnov"
                    , "Sales", 700);
            Detail detail = new Detail("Tbilisi", "9876543210"
                    ,"olegsmirnov@gmail.com");
            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("done !");*/

            /*session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("done !");*/

            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("done !");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
