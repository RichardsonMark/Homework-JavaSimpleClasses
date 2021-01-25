public class Printer {

    private int paperLevel;
    private int tonerVolume;

    public Printer(int paperLevel, int tonerVolume){
        this.paperLevel = paperLevel;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLevel(){
        return paperLevel;
    }

    public int getTonerVolume(){
        return tonerVolume;
    }

    public void print(int pages, int copies){
        int totalPages = pages * copies;
        if (totalPages < paperLevel){
            this.paperLevel -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }
}
