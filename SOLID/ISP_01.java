package SOLID;

public class ISP_01 {

    public interface Printable {
        void printDocument();
    }

    public interface Scannable {
        void scanDocument();
    }

    public interface Faxable {
        void faxDocument();
    }

    public static class SimplePrinter implements Printable {
        @Override
        public void printDocument() {
            System.out.println("Sending document to the printer ...");
        }
    }

    public static class MultiFunctionalPrinter implements Printable, Scannable, Faxable {
        @Override
        public void printDocument() {
            System.out.println("Printing document ...");
        }

        @Override
        public void scanDocument() {
            System.out.println("Scanning document ...");
        }

        @Override
        public void faxDocument() {
            System.out.println("Faxing document ...");
        }
    }

    public static void main(String[] args) {
        Printable printer = new SimplePrinter();
        printer.printDocument();
    }
}
