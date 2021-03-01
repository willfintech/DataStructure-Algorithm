package OOD.LibrarySystem;

import java.util.Date;
import java.util.List;

public class BookItem extends Book {
    private String barCode;
    private Date publicationDate;

    private Date borrowedDate;

    public BookItem(String ISBN, String title, List<String> author, String subject, String rack, String barCode, Date publicationDate) {
        super(ISBN, title, author, subject, rack);
        this.barCode = barCode;
        this.publicationDate = publicationDate;
    }
}

