import java.util.ArrayList;
import java.util.List;

public class StockBook{
    public List<Book> allBooks; 
    
    public StockBook() {
        allBooks = new ArrayList<>();
        allBooks.add(new Book("It", "Stephen King", "Terror", 5));
        allBooks.add(new Book("Dracula", "Bram Stoker", "Terror", 5));
        allBooks.add(new Book("Frankenstein", "Mary Shelley", "Terror", 5 ));
        allBooks.add(new Book("The Shining", "Stephen King", "Terror", 5));
        allBooks.add(new Book("The Haunting of Hill House", "Shirley Jackson", "Terror", 5));
        allBooks.add(new Book("1984", "George Orwell", "Ficcion", 5));
        allBooks.add(new Book("Brave New World", "Aldous Huxley", "Ficcion", 5));
        allBooks.add(new Book("Fahrenheit 451", "Ray Bradbury", "Ficcion", 5));
        allBooks.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Ficcion", 5));
        allBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", "Ficcion", 5));
        allBooks.add(new Book("Pride and Prejudice", "Jane Austen", "Romance", 5));
        allBooks.add(new Book("Wuthering Heights", "Emily Brontë", "Romance", 5));
        allBooks.add(new Book("Jane Eyre", "Charlotte Brontë", "Romance", 5));
        allBooks.add(new Book("Gone with the Wind", "Margaret Mitchell", "Romance", 5));
        allBooks.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 5));
        allBooks.add(new Book("La Conjura de los Necios", "John Kennedy Toole", "Comedia", 5));
        allBooks.add(new Book("Sin noticias de Gurb", "Eduardo Mendoza", "Comedia", 5));
        allBooks.add(new Book("Buenos Presagios", "Neil Gaiman & Terry Pratchett", "Comedia", 5));
        allBooks.add(new Book("Wilt", "Tom Sharpe", "Comedia", 5));
        allBooks.add(new Book("Los Asquerosos", "Santiago Lorenzo", "Comedia", 5));
        allBooks.add(new Book("Sapiens: de animales a dioses", "Yuval Noah Harari", "Documentales", 5));
        allBooks.add(new Book("El Diario de Ana Frank", "Ana Frank", "Documentales", 5));
        allBooks.add(new Book("Educated", "Tara Westover", "Documentales", 5));
        allBooks.add(new Book("Hiroshima", "John Hersey", "Documentales", 5));
        allBooks.add(new Book("Breve Historia del Tiempo", "Stephen Hawking", "Documentales", 5));
        allBooks.add(new Book("Charlie y la Fabrica de Chocolate", "Roald Dahl", "Infantiles", 5));
        allBooks.add(new Book("El Principito", "Antoine de Saint-Exupéry", "Infantiles", 5));
        allBooks.add(new Book("Matilda", "Roald Dahl", "Infantiles", 5));
        allBooks.add(new Book("Donde Viven los Monstruos", "Maurice Sendak", "Infantiles", 5));
        allBooks.add(new Book("Alicia en el Pais de las Maravillas", "Lewis Carroll", "Infantiles", 5));
    }

    public void updateBook(Book book) {
        for (int i = 0; i < allBooks.size(); i++) {
            if (allBooks.get(i).getTitle().equals(book.getTitle())) {
                allBooks.set(i, book);
                break;
            }
        }
    }
    

    //      Obtener libros
    public List<Book> getBooks() {
        return new ArrayList<>(allBooks);
    }

    public void addBook(Book book) {
        allBooks.add(book);
    }

    public void removeBook(Book book) {
        allBooks.remove(book);
    }
}
