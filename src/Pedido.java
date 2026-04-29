public class Pedido {

    private int id;
    private Cliente cliente;
    private double montoTotal;
    private boolean validado;

    public Pedido(int id, Cliente cliente, double montoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        this.validado = false;
    }

    public void validar() {
        System.out.println("Validando pedido #" + id + "...");

        if (cliente.getNombre().matches(".*\\d.*"))
            throw new IllegalStateException("El nombre del cliente no puede contener números.");

        if (montoTotal <= 0)
            throw new IllegalStateException("El monto total debe ser mayor a cero.");

        this.validado = true;
        System.out.println("Pedido #" + id + " validado correctamente.");
    }

    public int getId()            { return id; }
    public Cliente getCliente()   { return cliente; }
    public double getMontoTotal() { return montoTotal; }
    public boolean isValidado()   { return validado; }
}