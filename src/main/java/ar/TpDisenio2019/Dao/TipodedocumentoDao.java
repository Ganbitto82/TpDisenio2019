package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.Modelo.Tipodedocumento;

public interface TipodedocumentoDao {

	public Tipodedocumento buscarPorId(int idTipodedocumento);

	public void guardar(Tipodedocumento tipoDocumento);

	public List<Tipodedocumento> obtenerTodas();

}
