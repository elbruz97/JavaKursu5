package Gun28._02_Ornek;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book() {

    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book(String name, int publishYear){
        this(name, publishYear,"");
    }

    // direk yazmasi icin metod
    public String toString(){
        return name + " " + author + " " + publishYear;
    }
}
