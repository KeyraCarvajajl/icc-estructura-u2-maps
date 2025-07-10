package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String nombre;
    private String cargo;

    public Empleado(int id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Empleado otro) {
        return Integer.compare(this.id, otro.id);  
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', cargo='" + cargo + "'}";
    }

    public Integer getCodigo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCodigo'");
    }
}
