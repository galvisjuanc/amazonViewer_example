package com.anncode.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <h1> Report</h1>
 * Report
 * <p>
 * Esta es la clase genera reportes en la extension deseada,
 * Este tiene como parametros obligotorios los siguientes atributos
 * @param content {@code String}
 * @param extension {@code String}
 * @param nameFile {@code String}
 * @param title {@code String}
 * @author Juaan_jcgc
 * @version 1.1
 * @since 2024
 */
public class Report {
	
	private String nameFile;
	private String title;
	private String content;
	private String extension;
	
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public void makeReport() {
		if ( (getNameFile() != null) && (getTitle() != null) && (getContent() != null) ) {
			//Crear el archivo
			try {
				
				File file = new File(getNameFile()+"."+getExtension());
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} else {
			System.out.println("Ingresa los datos del archivo");
		}
	}
	
	
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

}










