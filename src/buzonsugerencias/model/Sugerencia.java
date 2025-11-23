package buzonsugerencias.model;

import java.sql.Timestamp;

public class Sugerencia {

    private int id;
    private String nombre;
    private String categoria;
    private boolean esAnonimo;
    private String sugerencia;
    private Timestamp fecha;

    public Sugerencia() {
    }

    public Sugerencia(int id, String nombre, String categoria,
                      boolean esAnonimo, String sugerencia, Timestamp fecha) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.esAnonimo = esAnonimo;
        this.sugerencia = sugerencia;
        this.fecha = fecha;
    }

    // ===== Getters y setters =====

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEsAnonimo() {
        return esAnonimo;
    }

    public void setEsAnonimo(boolean esAnonimo) {
        this.esAnonimo = esAnonimo;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
}
