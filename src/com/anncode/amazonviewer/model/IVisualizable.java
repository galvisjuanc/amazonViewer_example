package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {

	/**
	 * Este method captura el tiempo exacto de inicio de visualizacion
	 * @param dateI es un objeto {@code Date} con el tiemo de inicio exacto
	 * @return devuelve la fecha y hora capturada
	 */
	Date startToSee(Date dateI);

	/**
	 * Este method captura el tiempo exacto de inicio y final de visualización
	 * @param dateI Es un objeto {@code Date} con el tiempo de inicio exacto.
	 * @param dateF Es un objeto {@code Date} con el tiempo de final exacto.
	 */
	void stopToSee(Date dateI, Date dateF);

}
