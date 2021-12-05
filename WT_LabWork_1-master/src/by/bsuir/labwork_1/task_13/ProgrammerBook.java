package by.bsuir.labwork_1.task_13;

import by.bsuir.labwork_1.task_12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn) {
        super(title, author, price, isbn);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) object;
        return level == programmerBook.level && language.equals(programmerBook.language);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + 31 * (language == null ? 0 : language.hashCode()) + 31 * level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programmer Book: [")
                .append("Language: ")
                .append(language)
                .append(", Level: ")
                .append(level)
                .append("]");
        return sb.toString();
    }
}
