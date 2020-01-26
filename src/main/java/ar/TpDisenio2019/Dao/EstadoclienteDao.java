package ar.TpDisenio2019.Dao;

import ar.TpDisenio2019.Modelo.Estadocliente;

public interface EstadoclienteDao {

	public Estadocliente buscarPorId(int IdEstadocliente);

	public void guardar(Estadocliente estadocliente);

}
