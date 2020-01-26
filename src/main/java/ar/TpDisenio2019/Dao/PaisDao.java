package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.Modelo.Pais;

public interface PaisDao {

	public Pais buscarPorId(int idPais);

	public void guardar(Pais pais);

	public List<Pais> obtenerTodas();

}