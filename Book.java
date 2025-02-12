public class Book {
    protected String title;
    protected String author;
    protected int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookInfo() {
        return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }

    public void printBookDetails() {
        System.out.println(getBookInfo());
    }
}

class PrintedBook extends Book {
    private int numberOfPages;
    private String publisher;
    private double price;

    public PrintedBook(String title, String author, int numberOfPages) {
        super(title, author, 0);
        this.numberOfPages = numberOfPages;
        this.publisher = "Unknown";
        this.price = calculatePrice();
    }

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        return numberOfPages * 0.1;
    }

    public void printBook(){
        System.out.println("Printing the book...");
    }

    @Override
    public String getBookInfo() {
        return "Printed Book Info:\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "Publisher: " + publisher + "\n" +
                "Number of Pages: " + numberOfPages + "\n" +
                "Price: " + price + "\n" +
                "Book Type: PrintedBook\n";
    }

    @Override
    public void printBookDetails() {
        System.out.println(getBookInfo());
    }

    public void bookType() {
        System.out.println("This is a printed book");
    }
}

class EBook extends Book {
    private double fileSizeMB;
    private String fileFormat;
    private double price;

    public EBook(String title, String author, double fileSizeMB) {
        super(title, author, 0);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = "Unknown";
        this.price = calculatePrice();
    }

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        if (fileFormat.equals("PDF")) {
            return fileSizeMB * 0.6;
        } else {
            return fileSizeMB * 0.4;
        }
    }

    @Override
    public String getBookInfo() {
        return "EBook Info:\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "File Size: " + fileSizeMB + " MB\n" +
                "File Format: " + fileFormat + "\n" +
                "Price: $" + price + "\n" +
                "Book Type: EBook\n";
    }

    @Override
    public void printBookDetails() {
        System.out.println(getBookInfo());
    }

    public void bookType() {
        System.out.println("This is an ebook");
    }
}

class Main {
    public static void main(String[] args) {
        PrintedBook printedBook1 = new PrintedBook(
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                1925,
                218,
                "Scribner"
        );

        PrintedBook printedBook2 = new PrintedBook(
                "1984",
                "George Orwell",
                328
        );

        EBook eBook1 = new EBook(
                "Java Programming for Beginners",
                "John Smith",
                2020,
                4.5,
                "PDF"
        );

        EBook eBook2 = new EBook(
                "Learn Python",
                "Jane Doe",
                3.0
        );

        printedBook1.printBookDetails();
        printedBook2.printBookDetails();
        eBook1.printBookDetails();
        eBook2.printBookDetails();

        printedBook1.printBook();
        printedBook2.printBook();
    }
}




