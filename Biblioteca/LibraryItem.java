public abstract class LibraryItem implements Borrowable {

    private String title;
    private String author;
    private int publicationYear;
    private boolean available = true;
    private String currentBorrower = null;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    @Override
    public void borrow(String borrowerName) throws Exception {
        if (!available) {
            throw new Exception("Item não disponível para empréstimo.");
        }
        this.available = false;
        this.currentBorrower = borrowerName;
    }

    @Override
    public void returnItem() throws Exception {
        if (available) {
            throw new Exception("Item não está atualmente emprestado.");
        }
        this.available = true;
        this.currentBorrower = null;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    // Getters (opcional)
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public String getCurrentBorrower() { return currentBorrower; }
}