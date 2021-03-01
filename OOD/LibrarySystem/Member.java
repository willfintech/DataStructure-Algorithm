package OOD.LibrarySystem;

import java.util.Date;
import java.util.List;


class Member extends Account {
    private String barCode;
    private List<BookItem> booksCheckedOut;
    private int totalCheckedOut;

    private Member(AccountBuilder accountBuilder, String barCode) {
        super(accountBuilder);
        this.barCode = barCode;
    }

//    public boolean reserveBookItem(BookItem bookItem);
//    public boolean checkOutBookItem(BookItem bookItem);
}


//public class Member extends Account {
//    private Date dateOfMembership;
//    private int totalBooksCheckedout;
//
//    public Member(Date dateOfMembership, int totalBooksCheckedout) {
//        this.dateOfMembership = dateOfMembership;
//        this.totalBooksCheckedout = totalBooksCheckedout;
//    }
//
//    public boolean resetPassword(String newPassword) {
//        this.setPassword(newPassword);
//    }
//
//    public int getTotalBooksCheckedout() {
//        return this.totalBooksCheckedout;
//    }
//
//    public boolean reserveBookItem(BookItem bookItem){
//        //
//    }
//
//    public void incrementTotalBooksCheckedout() {
//        this.totalBooksCheckedout += 1;
//    }
//
//    public boolean checkoutBookItem(BookItem bookItem) {
//        if (this.getTotalBooksCheckedout() >= Constants.MAX_ISSUE_BOOK_PER_USER) {
//            System.out.println("The user has already checked-out maximum number of books");
//            return false;
//        }
//        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
//        if (bookReservation != null && bookReservation.getMemberID() != this.getId()) {
//            // book item has a pending reservation from another user
//            System.out.println("This book is reserved by another member");
//            return false;
//        } else if (bookReservation != null) {
//            // book item has a pending reservation from the give member, update it
//            bookReservation.updateStatus(ReservationStatus.COMPLETED);
//        }
//        if (!bookItem.checkout(this.getId())) {
//            return false;
//        }
//
//        this.incrementTotalBooksCheckedout();
//        return true;
//    }
//
//    private void checkForFine(String bookItemBarcode) {
//        BookLending bookLending = BookLending.fetchLendingDetails(bookItemBarcode);
//        Date dueDate = bookLending.getDueDate();
//        Date today = new Date();
//        // check if the book has been returned within the due date
//        if (today.compareTo(dueDate) > 0) {
//            long diff = todayDate.getTime() - dueDate.getTime();
//            long diffDays = diff / (24 * 60 * 60 * 1000);
//            Fine.collectFine(memberId, diffDays);
//        }
//    }
//
//    public void returnBookItem(BookItem bookItem) {
//        this.checkForFine(bookItem.getBarcode());
//        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
//        if (bookReservation != null) {
//            // book item has a pending reservation
//            bookItem.updateBookItemStatus(BookStatus.RESERVED);
//            bookReservation.sendBookAvailableNotification();
//        }
//        bookItem.updateBookItemStatus(BookStatus.AVAILABLE);
//    }
//
//    public bool renewBookItem(BookItem bookItem) {
//        this.checkForFine(bookItem.getBarcode());
//        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
//        // check if this book item has a pending reservation from another member
//        if (bookReservation != null && bookReservation.getMemberId() != this.getMemberId()) {
//            System.out.println("This book is reserved by another member");
//            member.decrementTotalBooksCheckedout();
//            bookItem.updateBookItemState(BookStatus.RESERVED);
//            bookReservation.sendBookAvailableNotification();
//            return false;
//        } else if (bookReservation != null) {
//            // book item has a pending reservation from this member
//            bookReservation.updateStatus(ReservationStatus.COMPLETED);
//        }
//        BookLending.lendBook(bookItem.getBarCode(), this.getMemberId());
//        bookItem.updateDueDate(LocalDate.now().plusDays(Constants.MAX_LENDING_DAYS));
//        return true;
//    }
//}
