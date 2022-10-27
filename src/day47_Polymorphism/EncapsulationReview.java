package day47_Polymorphism;

public class EncapsulationReview {
    private String bookTitle;
    private final String publishedDate;
    public String getBookTitle(){
        return bookTitle;
    }

    public EncapsulationReview(String bookTitle, String publishedDate) {
        setBookTitle(bookTitle );
        this.publishedDate = publishedDate;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
}
