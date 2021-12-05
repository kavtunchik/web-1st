package by.bsuir.labwork_1.task_12.compatators;

import by.bsuir.labwork_1.task_12.Book;

import java.util.Comparator;

public class AuthorThenTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int compareAuthorResult = firstBook.getAuthor().compareTo(secondBook.getAuthor());
        return compareAuthorResult != 0 ? compareAuthorResult : firstBook.getTitle().compareTo(secondBook.getTitle());
    }
}
