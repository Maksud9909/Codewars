package examples.adapter;

public class Main {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        PrinterAdapter printerAdapter = new PrinterAdapter(oldPrinter);
        printerAdapter.print("Maksud");
    }
}
