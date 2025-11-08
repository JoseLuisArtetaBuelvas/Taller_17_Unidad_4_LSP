public abstract class CuentaBancaria {
    protected final String numeroCuenta;
    protected final double saldo;
    protected final String titular;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Solo getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // Métodos que devuelven NUEVAS cuentas (no modifican la actual)
    public abstract CuentaBancaria depositar(double monto);
    public abstract CuentaBancaria retirar(double monto);

    @Override
    public String toString() {
        return String.format("%s[Cuenta: %s, Titular: %s, Saldo: $%.2f]",
                getClass().getSimpleName(), numeroCuenta, titular, saldo);
    }
}
