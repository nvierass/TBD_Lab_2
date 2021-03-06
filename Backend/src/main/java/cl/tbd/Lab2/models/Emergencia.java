package cl.tbd.Lab2.models;

public class Emergencia {
    private int id_emergencia;
    private int institucion_encargada;
    private String nombre_emergencia;
    private String estado_emergencia;
    private String descripcion;
    private String nombre_coordinador;
    private String rut_coordinador;
    private String correo_coordinador;
    private String ciudad;
    private String region;
    private double latitud;
    private double longitud;
    private String location;

    public String getNombre_emergencia() {
        return nombre_emergencia;
    }

    public int getId_emergencia() {
        return id_emergencia;
    }
    public int getInstitucion_encargada() {
        return institucion_encargada;
    }

    public String getEstado_emergencia() {
        return estado_emergencia;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public String getNombre_coordinador() {
        return nombre_coordinador;
    }
    public String getRut_coordinador() {
        return rut_coordinador;
    }
    public String getCorreo_coordinador() {
        return correo_coordinador;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getRegion() {
        return region;
    }
    public double getLatitud() {
        return latitud;
    }
    public double getLongitud() {
        return longitud;
    }
    public String getLocation() {
        return location;
    }

    public void setId_emergencia(int id_emergencia) {
        this.id_emergencia = id_emergencia;
    }
    public void setInstitucion_encargada(int institucion_encargada) {
        this.institucion_encargada = institucion_encargada;
    }

    public void setNombre_emergencia(String nombre_emergencia) {
        this.nombre_emergencia = nombre_emergencia;
    }

    public void setEstado_emergencia(String estado_emergencia) {
        this.estado_emergencia = estado_emergencia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNombre_coordinador(String nombre_coordinador) {
        this.nombre_coordinador = nombre_coordinador;
    }
    public void setRut_coordinador(String rut_coordinador) {
        this.rut_coordinador = rut_coordinador;
    }
    public void setCorreo_coordinador(String correo_coordinador) {
        this.correo_coordinador = correo_coordinador;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
