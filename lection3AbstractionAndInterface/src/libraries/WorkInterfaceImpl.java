package libraries;

public class WorkInterfaceImpl implements WorkInterface{

    @Override
    public void addMinutes(Music music, int minutes) {
        music.setMinutes(music.getMinutes() + minutes);
    }

    @Override
    public void addPages(Book book, int pages) {
        book.setPage(book.getPage() + pages);
    }

    @Override
    public void printInfo(Library library) {
        if (Music.class.isInstance(library)){
            Music music = (Music) library;
            System.out.println("Title: "+music.getTitle()+" Author - "+music.getAuthor()+" Minutes-"+music.getMinutes());
        } else if (Book.class.isInstance(library)){
            Book book = (Book) library;
            System.out.println("Title: "+book.getTitle()+" Author - "+book.getAuthor()+" Pages-"+book.getPage());
        }
    }
}
