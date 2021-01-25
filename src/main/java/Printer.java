public class Printer {

    private int paperLevel;

    public Printer(int paperLevel){
        this.paperLevel = paperLevel;
    }

    public int getPaperLevel(){
        return paperLevel;
    }

    public void print(int pages, int copies){
        int totalPages = pages * copies;
        if (totalPages < paperLevel){
            this.paperLevel -= totalPages;
        }
    }

}
