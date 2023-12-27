package libraries;

public class Book extends Library{
    private int page;
    public Book(String title, String author, int page){
        super(title, author);
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
