public class LegacyBillingSystem {

    public void setCustomerData(String customerName, String customerId) {
        System.out.println("Configurando cliente: " + customerName);
    }

    public void processCharge(int amountInCentimos) {
        System.out.println("Procesando cobro: " + amountInCentimos + " centimos");
    }

    public int generateReceipt() {
        System.out.println("Generando comprobante...");
        return 0;
    }
}