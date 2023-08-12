import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Book{
    String title;
    String author;
    int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}


public class ExerciseFour {
    public static void main(String[] args) {

        Book book = new Book("November Rain","Subin Bhattarai",2015);
        Book book1 = new Book("Summer Love","Nitesh Magar",2016);
        Book book2 = new Book("Alcamist","Sandeep Rai",2020);
        Book book3 = new Book("Rich dad poor dad","Asha Rana",2021);
        Book book4 = new Book("Vanilla twillight","Owl city",1996);
        Book book5 = new Book("Ocean eyes","Billie Eilish",1999);
        Book book6 = new Book("Chow","Nasko guys",1990);

        List<Book> list= new ArrayList<>();
        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);


        Iterator<Book> iterator = list.iterator();
        while(iterator.hasNext()){
            Book book7 = iterator.next();
            if(book7.getYearPublished()>2000){
                System.out.println("Book name : "+book7.getTitle()+ ", Year published : "+book7.getYearPublished());
            }
        }



    }
}
