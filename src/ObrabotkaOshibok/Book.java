package ObrabotkaOshibok;

public class Book {
    int id;
    String name;
    String author;

    public Book() {
        this.id = 0;
        this.name = "no name";
        this.author = "no author";
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return "ID:"+" "+id+" "+"NAME:"+" "+name+" "+"AUTHOR:"+" "+author;
    }
}

