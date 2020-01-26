package ar.TpDisenio2019.Dao;

import ar.TpDisenio2019.Modelo.Direccion;

public interface DireccionDao {

	public Direccion buscarPorId(int idDireccion);

	public void guardar(Direccion direccion);

}
