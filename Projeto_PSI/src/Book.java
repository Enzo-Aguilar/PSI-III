public class Book {
    private String bookName;
    private String author;
    private int numberOfPages;

    public Book()
    {
        this.bookName = "";
        this.author = "";
        this.numberOfPages = 0;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }


    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }


    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public  String ResumeBook(){
        return getBookName() + ", de " + getAuthor() + " com " + getNumberOfPages() + " paginas";
    }
}


