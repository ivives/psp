import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class Vendedor {

	private int edad;
    private String nombre;
    private String apellido;
    private List<Cliente> clientes;
 
    public String getApellido() {
        return apellido;
    }
 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    public List<Cliente> getClientes() {
        return clientes;
    }
 
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
 
    public int getEdad() {
        return edad;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        v1.setNombre("Juan");
        v1.setApellido("Perez");
        v1.setEdad(10);
        Cliente c1 = new Cliente();
        c1.setNombre("HIVYMAR");
        c1.setDirección("Victor Emilio Estrada 204");
        c1.setTelefono("5020800");
        Cliente c2 = new Cliente();
        c2.setNombre("PROMESA");
        c2.setDirección("Via. Daule KM 5.5");
        c2.setTelefono("5013604");
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        v1.setClientes(clientes);
        //CREAMOS EL OBJETO JSON
        JSONObject obj = new JSONObject(v1);
        System.out.println(obj);
    }
    
}
