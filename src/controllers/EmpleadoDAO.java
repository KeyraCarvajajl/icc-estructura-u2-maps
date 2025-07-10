package controllers;

import models.Empleado;
import java.util.List;

public interface EmpleadoDAO {

    void crearEmpleado(Empleado empleado);

    void eliminarEmpleado(int codigo);

    List<Empleado> listarEmpleados();
}