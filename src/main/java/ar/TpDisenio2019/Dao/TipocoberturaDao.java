package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.Modelo.Tipocobertura;

public interface TipocoberturaDao {

	public Tipocobertura buscarPorId(int idTipocobertura);

	public void guardar(Tipocobertura tipocobertura);

	public List<Tipocobertura> obtenerTodas();
}
