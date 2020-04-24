public class Printer implements DocsPrint {
    public static void main(String[] args) {
        Printer canonPrinter = new Printer();
        canonPrinter.printPdfFile();
        canonPrinter.printWordFile();

    }
    @Override
    public void printPdfFile() {
        System.out.println("PDF файл печатается");
    }

    @Override
    public void printWordFile() {
        System.out.println("Word файл печатается");
    }

}
