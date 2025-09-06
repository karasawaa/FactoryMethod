public interface Borrowable {

    void borrow(String borrowerName) throws Exception;

    void returnItem() throws Exception;

    boolean isAvailable();
}
