package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.Modelo.Vehiculo;

public interface VehiculoDao {

	public Vehiculo buscarPorId(int idVehiculo);

	public void guardar(Vehiculo vehiculo);

	public List<Vehiculo> obtenerTodas();
}
