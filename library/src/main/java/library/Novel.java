package library;

public class Novel extends Book {
    private NovelType type = NovelType.NOVEL_TYPE_MISTERY;

    public Novel(NovelType novelType, String nume, int numarPagini) {
        super(nume, numarPagini);
        this.type = novelType;
    }

    public enum NovelType {
        NOVEL_TYPE_MISTERY,
        NOVEL_TYPE_SF,
        NOVEL_TYPE_LOVE
    }

    public NovelType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + "Novel" +
                "type = " + type;
    }
}




