public class CuentaAhorros extends CuentaBancaria{
    private final double tasaInteres;

    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteres) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    @Override
    public CuentaAhorros depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido");
            return this;
        }
        return new CuentaAhorros(numeroCuenta, titular, saldo + monto, tasaInteres);
    }

    @Override
    public CuentaAhorros retirar(double monto) {
        if (monto <= 0 || monto > saldo) {
            System.out.println("Retiro inválido");
            return this;
        }
        return new CuentaAhorros(numeroCuenta, titular, saldo - monto, tasaInteres);
    }

    // Método específico de CuentaAhorros
    public CuentaAhorros aplicarInteres() {
        double nuevoSaldo = saldo + (saldo * tasaInteres / 100);
        return new CuentaAhorros(numeroCuenta, titular, nuevoSaldo, tasaInteres);
    }
}
