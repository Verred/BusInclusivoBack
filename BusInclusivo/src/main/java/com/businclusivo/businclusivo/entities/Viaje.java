package com.businclusivo.businclusivo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "Viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViaje;
    @Column(name = "fechaViaje", nullable = false)
    private LocalDate fechaViaje;
    @ManyToOne
    @JoinColumn(name = "idConductor")
    private Conductor conductor;
    @ManyToOne
    @JoinColumn(name = "idVehiculo")
    private Vehiculo vehiculo;
    @ManyToOne
    @JoinColumn(name = "idPasajero")
    private Pasajero pasajero;
    @ManyToOne
    @JoinColumn(name = "idPago")
    private Pago pago;
    @ManyToOne
    @JoinColumn(name = "idRuta")
    private Ruta ruta;
    @Column(name = "horasViaje", nullable = false)
    private float horasViaje;
    public Viaje() {
    }

    public Viaje(int idViaje, LocalDate fechaViaje, Conductor conductor, Vehiculo vehiculo, Pasajero pasajero, Pago pago, Ruta ruta, float horasViaje) {
        this.idViaje = idViaje;
        this.fechaViaje = fechaViaje;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.pasajero = pasajero;
        this.pago = pago;
        this.ruta = ruta;
        this.horasViaje = horasViaje;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public float getHorasViaje() {
        return horasViaje;
    }

    public void setHorasViaje(float horasViaje) {
        this.horasViaje = horasViaje;
    }
}
