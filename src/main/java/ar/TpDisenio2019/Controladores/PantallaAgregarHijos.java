package ar.TpDisenio2019.Controladores;


import ar.TpDisenio2019.Ui.DardeAltaPoliza.ModHijos;

public class PantallaAgregarHijos{
	
	public PantallaAgregarHijos(int numeroHijos) {
		ModHijos frame = new ModHijos(numeroHijos);
		frame.setVisible(true);
	}

}
