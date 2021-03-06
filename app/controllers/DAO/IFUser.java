package controllers.DAO;

import models.*;
import scala.Int;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.List;

/**
 * Created by Administrador on 22/06/2015.
 */

public interface IFUser {

    Connection getConnection();
    User validarBD(String user, String password);
    List<Vehiculo_Usuario> listaVehiculos(User usuario);
    List<Proveedor> listaDistribuidoresTop();
    List<Proveedor> listaTalleresTop();
    List<Proveedor> listaMecanicosTop();

    Integer devolverIdMantenimiento(String marca, String modelo);
    List<Mantenimiento> devolverMantenimiento(Integer id, Integer kilometraje);

    void AgregarVehiculo(Vehiculo_Usuario veh);
    void RegistrarUsuario(User_Prop propietario, User usuario);
    void AgregarCalificacion(Calificacion cal);

    Integer devolverIdRepuesto(String marca);
    List<Repuesto> devolverRepuestos(Integer id, String trepuesto);


    List<Calificacion> mostrarCalificaciones(String fk_proveedor);
    User_Prop devolverPropietario(String id);
    List<Integer> devolverCodigosRepuestos(String id);
    Repuesto devolverRepuesto(int id);

    List<String> devolverCodigosProveedores(int id);
    Proveedor devolverProveedor(String id);


}


