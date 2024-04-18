import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class CarritoCompras implements Iterable<Producto> {
    private List<Producto> productos;

    public CarritoCompras() {
        this.productos = new ArrayList<>();

    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Iterator<Producto> iterator() {
        return productos.iterator();

    }


}
