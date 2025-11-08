public class InstanciarCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria ahorro1 = new CuentaAhorros("001", "Juan", 1000, 5.0);
        System.out.println("Cuentas iniciales:");
        System.out.println(ahorro1);

        CuentaBancaria ahorro2 = ahorro1.depositar(500);
    }
}
