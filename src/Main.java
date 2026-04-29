public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ana García", "12345678");
        Pedido pedido = new Pedido(1001, cliente, 150.75);

        try {
            pedido.validar();

            LegacyBillingSystem sistemaLegado = new LegacyBillingSystem();
            FacturaService facturaService = new BillingAdapter(sistemaLegado);

            facturaService.emitirFactura(pedido.getCliente(), pedido.getMontoTotal());

            System.out.println("Factura generada exitosamente.");
            System.out.println("Cliente : " + pedido.getCliente().getNombre());
            System.out.println("Monto   : S/. " + pedido.getMontoTotal());

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}