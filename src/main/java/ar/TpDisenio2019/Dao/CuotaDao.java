package ar.TpDisenio2019.Dao;

import java.util.List;

import ar.TpDisenio2019.DTO.DTOCuota;
import ar.TpDisenio2019.Modelo.Cuota;

public interface CuotaDao {

	public DTOCuota buscarPorId(int idCuota);

	public void guardar(Cuota cuota);

	public List<Cuota> obtenerTodas();
}
