package ar.TpDisenio2019.Controladores;

import ar.TpDisenio2019.DTO.DTOPoliza;
import ar.TpDisenio2019.Ui.ModHijos;

public class PantallaAgregarHijos{
	
	public PantallaAgregarHijos(DTOPoliza dtoPoliza,int numeroHijos) {
		ModHijos frame = new ModHijos(dtoPoliza,numeroHijos);
		frame.setVisible(true);
	}

}
