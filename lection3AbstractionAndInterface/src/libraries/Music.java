package libraries;

public class Music extends Library{
    private int minutes;

    public Music(String title, String author, int minutes) {
        super(title, author);
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
