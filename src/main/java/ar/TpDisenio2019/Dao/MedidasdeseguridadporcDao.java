package ar.TpDisenio2019.Dao;

import ar.TpDisenio2019.Modelo.Medidasdeseguridadporc;

public interface MedidasdeseguridadporcDao {

	public Medidasdeseguridadporc buscarPorId(int idMedidasdeseguridadporc);

	public void guardar(Medidasdeseguridadporc Medidasdeseguridadporc);

}