package library;

public class Album extends Book {
    private PaperQuality qualityOfPaper = PaperQuality.PAPER_QUALITY_LOW;

    public Album(PaperQuality paperQuality, String nume, int numarPagini) {
        super(nume, numarPagini);
        this.qualityOfPaper = paperQuality;
    }

    public enum PaperQuality {
        PAPER_QUALITY_LOW,
        PAPER_QUALITY_MEDIUM,
        PAPER_QUALITY_HIGH
    }

    public PaperQuality getQualityOfPaper() {
        return qualityOfPaper;
    }

    public void setQualityOfPaper(PaperQuality qualityOfPaper) {
        this.qualityOfPaper = qualityOfPaper;
    }

    @Override
    public String toString() {
        return super.toString() + "Album" +
                "qualityOfPaper = " + qualityOfPaper;

    }
}
