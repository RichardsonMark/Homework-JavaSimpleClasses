import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 500);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaperLevel());
    }

    @Test
    public void canPrintCopies(){
        printer.print(2, 25);
        assertEquals(50, printer.getPaperLevel());
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getTonerVolume());
    }

}
