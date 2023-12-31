package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.PseudoColumnUsage;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Child.class)
                        .addAnnotatedClass(Section.class)
                        .buildSessionFactory();

        Session session = null;

        try {
            /*session = sessionFactory.getCurrentSession();

            Section section1 = new Section("football");
            Child child1 = new Child("Ivan", 5);
            Child child2 = new Child("Masha", 7);
            Child child3 = new Child("Vasya", 6);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.save(section1);

            session.getTransaction().commit();
            System.out.println("done !!");*/


            /*session = sessionFactory.getCurrentSession();

            Section section1 = new Section("volleyball");
            Section section2 = new Section("chess");
            Section section3 = new Section("math");
            Child child1 = new Child("Igor", 10);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();

            session.save(child1);

            session.getTransaction().commit();
            System.out.println("done !!");*/

            /*session = sessionFactory.getCurrentSession();


            session.beginTransaction();

            Section section = session.get(Section.class, 2);

            System.out.println(section);
            System.out.println(section.getChildren());

            session.getTransaction().commit();
            System.out.println("done !!");*/

            /*session = sessionFactory.getCurrentSession();


            session.beginTransaction();

            Child child = session.get(Child.class, 7);

            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();
            System.out.println("done !!");*/

            /*session = sessionFactory.getCurrentSession();


            session.beginTransaction();

            Section section = session.get(Section.class, 2);
            session.delete(section);

            session.getTransaction().commit();
            System.out.println("done !!");*/

            /*session = sessionFactory.getCurrentSession();

            Section section1 = new Section("dance");
            Child child1 = new Child("Olya", 12);
            Child child2 = new Child("Grisha", 8);
            Child child3 = new Child("Pavlik", 9);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.persist(section1);

            session.getTransaction().commit();
            System.out.println("done !!");*/

            /*session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class, 8);
            session.delete(section);

            session.getTransaction().commit();
            System.out.println("done !!");*/

            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 8);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("done !!");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
