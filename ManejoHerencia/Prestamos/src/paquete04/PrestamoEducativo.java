package paquete04;
import paquete02.InstitucionEducativa;
import paquete02.Persona;
import paquete02.Prestamo;
public class PrestamoEducativo extends Prestamo {
  private String nivelEstudio;
  private InstitucionEducativa centroEducativo;
  private double valorCarrera;
  private double valorMensualPagoEdu;
  private static double porcentaje;
  public PrestamoEducativo(){}
    public PrestamoEducativo(String nivelEstudio, InstitucionEducativa centroEducativo,
                             double valorCarrera) {
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }
    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo,
                             String nivelEstudio, InstitucionEducativa centroEducativo,
                             double valorCarrera) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }
    public String getNivelEstudio() {
        return nivelEstudio;
    }
    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }
    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }
    public double getValorCarrera() {
        return valorCarrera;
    }
    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }
    public double getPorcentaje(){
        return porcentaje;
    }
    public void calcularPorcentaje(){
      porcentaje=(this.valorCarrera/this.tiempoPrestamo*.10);
    }
    public double getValorMensualPagoEdu() {
        return valorMensualPagoEdu;
    }
    public void calcularValorMensualPagoEdu() {
        this.valorMensualPagoEdu =(this.valorCarrera/tiempoPrestamo-porcentaje);
    }
    @Override
    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo.toUpperCase();
    }
    public String getCiudadPrestamo(){
      return ciudadPrestamo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nNivel de Estudio: ").append(nivelEstudio);
        sb.append("\nCentro Educativo: ").append(centroEducativo);
        sb.append("\nValor de la Carrera: ").append(valorCarrera);
        sb.append("\nValor Mensual de Pago Educativo: ").append(valorMensualPagoEdu);
        sb.append("\nPorcentaje: ").append(porcentaje);
        return sb.toString();
    }
}
