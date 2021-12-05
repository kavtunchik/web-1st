package by.bsuir.labwork_1.task_12;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }
        Book book = (Book) object;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = 31 * price;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = result + (31 * result + (author != null ? author.hashCode(): 0));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book: [")
                .append("Title: ")
                .append(title)
                .append(", Author: ")
                .append(author)
                .append(", Price: ")
                .append(price)
                .append("]");
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(isbn, book.isbn);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
