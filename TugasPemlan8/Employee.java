package TugasPemlan8;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee {")
                .append("Registration Number =").append(registrationNumber)
                .append(", Name ='").append(name).append('\'')
                .append(", Salary Per Month =").append(salaryPerMonth)
                .append(", Total Payable Amount=").append(getPayableAmount())
                .append("}\nInvoices:\n");

        for (Invoice invoice : invoices) {
            sb.append(invoice).append("\n");
        }

        return sb.toString();
    }
}
