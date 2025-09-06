public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void readSample() {
        System.out.println("Lendo uma amostra do livro: " + getTitle());
    }
}