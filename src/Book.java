public class Book {
    private String name;
    private int quantity;
    public Book(String name) {
        this(name, 1);
    }
    public Book(String name, int qty) {
        this.name = name;
        this.quantityt = qty;
    }
    public void add() {
        quantity++;
    }
    public void remove() {
        quantity++;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return name+"; "+quantity;
    }
    @Override
    public boolean equals(Object o) {
        return (o instanceof Book) && (((Book)o).getName()==getName());
    }
}
