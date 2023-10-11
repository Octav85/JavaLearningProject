package com.octavian.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionTask {
    public static void main(String[] args) {
        Book book1984 =new Book("1984", "George Orwell");
        Book strainulBook = new Book("Strainul", "Albert Camus");
        Book breakfastBook = new Book("Breakfast for Champions", "Kurt Vonegut");
        Book maraBook = new Book("Mara", "Ioan Slavici");

        Library chisinauLibrary= new Library("Librarius");
        chisinauLibrary.addBook(strainulBook);
        chisinauLibrary.addBook(breakfastBook);
        chisinauLibrary.addBook(maraBook);
        chisinauLibrary.addBook(book1984);

        chisinauLibrary.printAllBooks();

        System.out.println("Numarul total de carti este "  + chisinauLibrary.returnLibraryNumber());

        chisinauLibrary.removeBook(2);

        chisinauLibrary.removeBook(book1984);
        System.out.println("Numarul total de carti este "  +  chisinauLibrary.returnLibraryNumber());

        Library cartierLibrary = new Library("Cartier");
       cartierLibrary.addBook(strainulBook,strainulBook);
        cartierLibrary.addBook(book1984,maraBook);
        cartierLibrary.addBook(breakfastBook);

        System.out.println(cartierLibrary.returnLibraryNumber());


        Map<String, Library> libraries = new HashMap<>();
        libraries.put("bul. Stefan Cel Mare 64", chisinauLibrary);
        libraries.put("str. Bucuresti 68", cartierLibrary);

        String valoareaCautata = "bul. Stefan Cel Mare 64";
        boolean existaValoare = libraries.containsValue(valoareaCautata);
        System.out.println("Valoarea \"" + valoareaCautata+ "\" + exista in map ? " + existaValoare);

        libraries.get("bul. Stefan Cel Mare 64").addBook(strainulBook);
        libraries.get("str. Bucuresti 68").addBook(maraBook);
        libraries.get("str. Bucuresti 68").printAllBooks();
        libraries.get("bul. Stefan Cel Mare 64").printAllBooks();






        libraries.get("bul. Stefan Cel Mare 64").addAnotherListOfBookIntoLibraryList(cartierLibrary.getBookList());
        libraries.get("bul. Stefan Cel Mare 64").printAllBooks();




    }
}
