package by.bsuir.labwork_1.task_12.compatators;

import by.bsuir.labwork_1.task_12.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int compareAuthorResult = firstBook.getAuthor().compareTo(secondBook.getAuthor());
        if (compareAuthorResult == 0) {
            int compareTitleResult = firstBook.getTitle().compareTo(secondBook.getTitle());
            if (compareTitleResult == 0) {
                return firstBook.getPrice() - secondBook.getPrice();
            } else {
                return compareTitleResult;
            }
        } else {
            return compareAuthorResult;
        }
    }
}
