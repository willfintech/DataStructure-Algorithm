package OOD.LibrarySystem;

import java.util.List;

public class Book {
    private String ISBN;
    private String title;
    private List<String> author;
    private String subject;

    private String rack;
    private int numInStock;
    private List<Member> MembersWaiting;

    public Book(String ISBN, String title, List<String> author, String subject, String rack) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.rack = rack;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    public List<Member> getMembersWaiting() {
        return MembersWaiting;
    }

    public void setMembersWaiting(List<Member> membersWaiting) {
        MembersWaiting = membersWaiting;
    }
}