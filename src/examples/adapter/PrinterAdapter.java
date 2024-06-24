package examples.adapter;

public class PrinterAdapter implements Printer{
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String message) {
        oldPrinter.print(message);
    }
}
