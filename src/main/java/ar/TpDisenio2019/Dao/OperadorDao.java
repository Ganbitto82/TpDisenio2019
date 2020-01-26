package ar.TpDisenio2019.Dao;

import ar.TpDisenio2019.Modelo.Operador;

public interface OperadorDao {

	public Operador buscarPorId(int idOperador);

	public void guardar(Operador operador);

}
