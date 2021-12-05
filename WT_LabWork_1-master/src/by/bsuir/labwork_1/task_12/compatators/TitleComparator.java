package by.bsuir.labwork_1.task_12.compatators;

import by.bsuir.labwork_1.task_12.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getTitle().compareTo(secondBook.getTitle());
    }
}
