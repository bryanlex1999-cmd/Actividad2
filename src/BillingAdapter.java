public class BillingAdapter implements FacturaService {

    private LegacyBillingSystem legacySystem;

    public BillingAdapter(LegacyBillingSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public boolean emitirFactura(Cliente cliente, double monto) {
        legacySystem.setCustomerData(cliente.getNombre(), cliente.getDni());

        int montoEnCentimos = (int) Math.round(monto * 100);
        legacySystem.processCharge(montoEnCentimos);

        int resultado = legacySystem.generateReceipt();
        return resultado == 0;
    }
}
