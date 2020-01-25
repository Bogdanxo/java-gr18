package library;

public class Main {
    public static void main(String[] args) {
        Library l1 = new Library();

        l1.addBook(new Novel(Novel.NovelType.NOVEL_TYPE_MISTERY, "Harry Potter", 50));
        l1.addBook(new Novel(Novel.NovelType.NOVEL_TYPE_LOVE, "Romeo & Juliette", 30));
        l1.addBook(new Novel(Novel.NovelType.NOVEL_TYPE_SF, "Lord of the rings", 150));
        l1.addBook(new Album(Album.PaperQuality.PAPER_QUALITY_HIGH, "Banchet a XII-a", 10));

        l1.removeBook(l1.getGetBooks()[1]);

        l1.printLibrary();
    }
}
