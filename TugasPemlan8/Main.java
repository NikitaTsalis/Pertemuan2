package TugasPemlan8;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Product A", 2, 50000);
        Invoice invoice2 = new Invoice("Product B", 1, 150000);
        Invoice[] invoices = {invoice1, invoice2};

        Employee employee = new Employee (3320, "Nikitaa", 500000, invoices);

        System.out.println(employee);
    }
}
