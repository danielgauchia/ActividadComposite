
public class Main {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");

        // Crear cajas individuales
        CajaDeTe cajaBlanco1 = new CajaDeTeBlanco();
        CajaDeTe cajaBlanco2 = new CajaDeTeBlanco();
        CajaDeTe cajaVerde1 = new CajaDeTeVerde();
        CajaDeTe cajaVerde2 = new CajaDeTeVerde();
        CajaDeTe cajaVerde3 = new CajaDeTeVerde();

        // Crear paquetes
        CajaCompuesta paquete1 = new CajaCompuesta();
        CajaCompuesta paquete2 = new CajaCompuesta();
        CajaCompuesta envioAsia = new CajaCompuesta();

        // Añadir cajas a paquetes
        paquete1.agregarCaja(cajaBlanco1);
        System.out.println("Añado una caja de Te Blanco");
        paquete1.agregarCaja(cajaBlanco2);
        System.out.println("Añado una caja de Te Blanco");
        paquete1.agregarCaja(cajaVerde1);
        System.out.println("Añado una caja de Te Verde");

        paquete2.agregarCaja(cajaVerde2);
        System.out.println("Añado una caja de Te Verde");
        paquete2.agregarCaja(cajaVerde3);
        System.out.println("Añado una caja de Te Verde");
        paquete2.agregarCaja(cajaBlanco1);
        System.out.println("Añado una caja de Te Blanco");

        // Añadir paquetes al envío
        envioAsia.agregarCaja(paquete1);
        System.out.println("Añado una caja de Paquete de cajas");
        envioAsia.agregarCaja(paquete2);
        System.out.println("Añado una caja de Paquete de cajas");

        // Mostrar total de sobres en cada paquete y envío
        System.out.println("Este paquete consta de " + paquete1.getTotalSobres() + " unidades");
        System.out.println("Este paquete consta de " + paquete2.getTotalSobres() + " unidades");
        System.out.println("Este paquete consta de " + envioAsia.getTotalSobres() + " unidades");

        System.out.println("El envío a Asia contiene " + envioAsia.getTotalSobres() + " unidades de té");
    }
}