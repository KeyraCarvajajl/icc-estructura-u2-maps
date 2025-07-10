package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Integer, Empleado> empleados = new HashMap<>();

    @Override
    public void crearEmpleado(Empleado empleado) {
        empleados.put(empleado.getCodigo(), empleado);
    }

    @Override
    public void eliminarEmpleado(int codigo) {
        empleados.remove(codigo);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return new ArrayList<>(empleados.values());
    }
}