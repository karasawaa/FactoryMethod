public class LibraryManagementSystem {
    public static void main(String[] args) throws Exception {
        // Instâncias dos materiais
        LibraryItem book = new Book("Divina Comédia", "Dante Alighieri", 1304, "Poema épico");
        LibraryItem magazine = new Magazine("Shonen Jump", "Vários", 2025, 120);
        LibraryItem digitalMedia = new DigitalMedia("Aula do prof Escobar", "Prof Escobar", 2025, "MP4");

        // Polimorfismo: todos são LibraryItem
        LibraryItem[] items = { book, magazine, digitalMedia };

        // Métodos comuns
        for (LibraryItem item : items) {
            System.out.println("Título: " + item.getTitle());
            item.borrow("João");
            System.out.println("Disponível? " + disponivelTexto(item.isAvailable()));
            item.returnItem();
            System.out.println("Disponível após devolução? " + disponivelTexto(item.isAvailable()));
            System.out.println();
        }

        // Métodos específicos
        ((Book) book).readSample();
        ((Magazine) magazine).flipPages();
        ((DigitalMedia) digitalMedia).play();
    }

    private static String disponivelTexto(boolean disponivel) {
        return disponivel ? "sim" : "não";
    }
}