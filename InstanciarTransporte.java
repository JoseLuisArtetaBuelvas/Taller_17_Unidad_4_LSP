public class InstanciarTransporte {
    public static void main(String[] args) {
        Transporte bici1 = new Bicicleta("Trek", "Mountain", 0);
        Transporte coche1 = new Coche("Toyota", "Corolla", 0);

        System.out.println("Transportes iniciales:");
        System.out.println(bici1);
        System.out.println(coche1);

        // Operaciones devuelven NUEVOS transportes
        Transporte bici2 = bici1.acelerar(20);
        Transporte bici3 = bici2.acelerar(30);  // Llegará al máximo (40)
        Transporte bici4 = bici3.frenar(10);

        System.out.println("\nBicicleta después de acelerar y frenar:");
        System.out.println("Original: " + bici1);   // Sin cambios
        System.out.println("Final: " + bici4);

        Transporte coche2 = coche1.acelerar(100);
        Transporte coche3 = coche2.acelerar(150);

        System.out.println("\nCoche después de acelerar:");
        System.out.println("Original: " + coche1);  // Sin cambios
        System.out.println("Final: " + coche3);

    }
}
