package Library;

public class Novels extends Book {

    public enum NovelType {
        NOVEL_TYPE_MISTERY,
        NOVEL_TYPE_SF,
        NOVEL_TYPE_LOVE
    }

    private NovelType type = NovelType.NOVEL_TYPE_MISTERY;

    public NovelType getType() {
        return type;
    }
}




