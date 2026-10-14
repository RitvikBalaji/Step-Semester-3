public class Main {
    String title;
    String author;
    int copiesAvailable;

    Main(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }

    public static void main(String[] args) {
        Main[] books = {
            new Main("Clean Code", "Robert C. Martin", 3),
            new Main("Effective Java", "Joshua Bloch", 5),
            new Main("Refactoring", "Martin Fowler", 0),
            new Main("Design Patterns", "GoF", 2)
        };

        for (Main book : books) {
            book.printEntry();
        }
    }
}

