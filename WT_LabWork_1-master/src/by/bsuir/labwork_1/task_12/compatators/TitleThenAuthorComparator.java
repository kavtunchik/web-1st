package by.bsuir.labwork_1.task_12.compatators;

import by.bsuir.labwork_1.task_12.Book;

import java.util.Comparator;

public class TitleThenAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int compareTitleResult = firstBook.getTitle().compareTo(secondBook.getTitle());
        return compareTitleResult != 0 ? compareTitleResult : firstBook.getAuthor().compareTo(secondBook.getAuthor());
    }
}
