import java.util.ArrayList;
import java.util.List;
public class CajaCompuesta implements CajaDeTe {
    private List<CajaDeTe> cajas = new ArrayList<>();

    public void agregarCaja(CajaDeTe caja) {
        cajas.add(caja);
    }

    public void quitarCaja(CajaDeTe caja) {
        cajas.remove(caja);
    }

    @Override
    public int getTotalSobres() {
        int total = 0;
        for (CajaDeTe caja : cajas) {
            total += caja.getTotalSobres();
        }
        return total;
    }
}