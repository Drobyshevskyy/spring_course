package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //@Override
    public void getBook() {
        System.out.println("take a book from UniLibrary");
        System.out.println("--------------------------------------------");
    }
    public String returnBook() {
        int a = 10/0;
        System.out.println("return book to UniLibrary");
        return "The Godfather";
    }
    public void getMagazine() {
        System.out.println("take a magazine from UniLibrary");
        System.out.println("--------------------------------------------");
    }
    public void returnMagazine() {
        System.out.println("return magazine to UniLibrary");
        System.out.println("--------------------------------------------");
    }
    public void addBook(String person_name, Book book) {
        System.out.println("book added to UniLibrary");
        System.out.println("--------------------------------------------");
    }
    public void addMagazine() {
        System.out.println("magazine added to UniLibrary");
        System.out.println("--------------------------------------------");
    }
}
