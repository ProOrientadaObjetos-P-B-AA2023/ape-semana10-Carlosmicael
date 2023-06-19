package paquete02;
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;
    public Prestamo() {}
    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudadPrestamo = ciudadPrestamo;
    }
    public Persona getBeneficiario() {
        return beneficiario;
    }
    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }
    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }
    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }
    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }
    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del Préstamo");
        sb.append("\n------------------");
        sb.append("\nBeneficiario: ").append(beneficiario);
        sb.append("\nTiempo de Préstamo: ").append(tiempoPrestamo).append(" meses");
        sb.append("\nCiudad del Préstamo: ").append(ciudadPrestamo);
        return sb.toString();
    }
}
