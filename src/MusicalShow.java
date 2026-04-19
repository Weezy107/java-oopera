public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Геттеры для доступа к полям
    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    // Сеттеры для изменения полей (опционально)
    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля '"+ getTitle() + "':");
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", librettoTextLength=" + librettoText.length();
    }

}
