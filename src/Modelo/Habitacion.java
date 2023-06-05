
package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Habitacion 
{	
	private double registroConsumos;
	private  String nombre;
	private int camas;
	private String ubicacion;
	private int capacidad;
	private String Tamano;
	private String tipo;
	private String Extra; 
	private String tarifa;
	private Boolean Aire,calefaccion,television, cafetera, Hipoalergenicos, plancha, secador, USBA, USBC, desayuno; 
	//private Boolean calefaccion;
	private String dimensionCamas;
	private String voltaje; 
	
	private Map<LocalDate, Boolean> availability = new HashMap<>();
	
	public Habitacion (String nombre,String ubicacion, int capacidad, int camas, String Tamano, String tipo, String Extra, String tarifa, Boolean Aire,
			Boolean calefaccion, String dimensionCamas, Boolean television, Boolean cafetera, Boolean Hipoalergenicos, Boolean plancha, Boolean secador, String voltaje, 
			Boolean USBA, Boolean USBC, Boolean desayuno)
	{
		
		//,Aire,calefaccion,dimensionCamas,television,cafetera, hipoalergenicos
		//,plancha,secador,voltaje,USBA,USBC,desayuno);
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad=capacidad;
		this.camas = camas;
		this.Tamano=Tamano;
		this.tipo=tipo;
		this.Extra=Extra;
		this.tarifa=tarifa;
		this.Aire=Aire;
		this.calefaccion=calefaccion;
		this.dimensionCamas=dimensionCamas;
		this.television=television;
		this.cafetera=cafetera;
		this.Hipoalergenicos=Hipoalergenicos;
		this.plancha=plancha;
		this.secador=secador;
		this.voltaje=voltaje;
		this.USBA=USBA;
		this.USBC=USBC;
		this.desayuno=desayuno;
		LocalDate date = LocalDate.now();
		for (int i = 0; i < 730; i++) {
            availability.put(date.plusDays(i), true);
        }
	}
	
	
	public String getNumero()
	{
		return nombre;
	}
	public int getCapacidad()
	{
		return capacidad;
	}
	public int getCamas()
	{
		return camas;
	}
	public String getTamano(){
		return Tamano; 
	}
	public String getUbicacion()
	{
		return ubicacion;
	}
	public String getTipo()
	{
		return tipo;
	}
	public String getExtra()
	{
		return Extra;
	}
	public String getTarifa() {
		return tarifa;
	}
	//public String getTamanoString() {
	//	String tamanos="";
	//	if (Tamano.size()>1) {
	//		for (int a =0; a< Tamano.size();a++) {
	//		tamanos+= Tamano.get(a)+",";
	//		}
	//	}
	//	else {
	//		tamanos= Tamano.get(0);
	//	}
		
	//	return tamanos;
	//}
	
	public Boolean getAire() {
		return Aire;
	}
	public Boolean getCalefaccion() {
		return calefaccion;
	}
	public String getDimensionesCamas() {
		return dimensionCamas;
	}
	public Boolean getTV() {
		return television;
	}
	public Boolean getCafetera() {
		return cafetera;
	}
	public Boolean getHipo() {
		return Hipoalergenicos;
	}
	public Boolean getPlancha() {
		return plancha ;
	}
	public Boolean getSecador() {
		return secador;
	}
	public String getVoltaje() {
		return voltaje;
	}
	public Boolean getUSBA() {
		return USBA;
	}
	public Boolean getUSBC() {
		return USBC;
	}
	public Boolean getDesayuno() {
		return desayuno;
	}
	
	public void setTarifa(String nuevo) {
		tarifa=nuevo;
	}
	public void setnombre(String nuevo) {
		nombre=nuevo;
	}
	public void setcapacidad(int nuevo) {
		capacidad=nuevo;
	}
	public void setubicacion(String nuevo) {
		ubicacion=nuevo;
	}
	public void setCamas(int nuevo) {
		camas=nuevo;
	}
	public void setTamano(String nuevo) {
		Tamano=nuevo;
	}
	public void setTipo(String nuevo) {
		tipo=nuevo;
	}
	public void setExtra(String nuevo) {
		Extra=nuevo;
	}
	
	public void SetAire(Boolean nuevo) {
		Aire=nuevo;
	}
	public void SetCalefaccion(Boolean nuevo) {
		calefaccion=nuevo;
	}
	public void SetDimensionesCamas(String nuevo) {
		dimensionCamas=nuevo;
	}
	public void SetTV(Boolean nuevo) {
		television=nuevo;
	}
	public void SetCafetera(Boolean nuevo) {
		cafetera=nuevo;
	}
	public void SetHipo(Boolean nuevo) {
		Hipoalergenicos=nuevo;
	}
	public void SetPlancha(Boolean nuevo) {
		plancha=nuevo;
	}
	public void SetSecador(Boolean nuevo) {
		secador=nuevo;
	}
	public void SetVoltaje(String nuevo) {
		voltaje=nuevo;
	}
	public void SetUSBA(Boolean nuevo) {
		USBA=nuevo;
	}
	public void SetUSBC(Boolean nuevo) {
		USBC=nuevo;
	}
	public void SetDesayuno(Boolean nuevo) {
		desayuno=nuevo;
	}
	
	private double getConsumos()
	{
		return registroConsumos;
	}
	
	public boolean verificarDisponibilidad(LocalDate startDate, LocalDate endDate) {
        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            if (!availability.get(date)) {
                return false;
            }
        }
        return true;
    }
	
	public void blockearDisponibilidad(LocalDate fechaInicial, LocalDate fechaFinal) {
        for (LocalDate date = fechaInicial; date.isBefore(fechaFinal); date = date.plusDays(1)) {
            availability.put(date, false);
        }
    }
	
	public void desbloquearDisponibilidad(LocalDate fechaInicial, LocalDate fechaFinal) {
        for (LocalDate date = fechaInicial; date.isBefore(fechaFinal); date = date.plusDays(1)) {
            availability.put(date, true);
        }
    }
	
	
}
