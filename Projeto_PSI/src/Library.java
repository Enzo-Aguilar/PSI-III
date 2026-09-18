import java.awt.*;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void AddBook(Book b)
    {
        books.add(b);
    }
    public String SearchBookByTitle(String bookTitle) {
        try {
            for (Book b : books) {
                if (b.getBookName().equals(bookTitle)) {
                    return "Livro encontrado: " + b.ResumeBook();
                }
            }
        } catch (Exception e) {
            return "Ocorreu um erro ao obter o livro" + e.toString();
        }

        return "Nenhum livro encontrado";
    }
}
