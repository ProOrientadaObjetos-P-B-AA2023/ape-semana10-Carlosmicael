package Paquete03;
import paquete02.Persona;
import paquete02.Prestamo;
public class PrestamoAutomovil extends Prestamo {
  private String tipoAutomovil;
  private String marcaAutomovil;
  private Persona garante1;
  private double valorAutomovil;
  private double valorMensualPago;
  public PrestamoAutomovil() {}
  public PrestamoAutomovil(String tipoAutomovil, String marcaAutomovil,
                           Persona garante1, double valorAutomovil){
    this.tipoAutomovil = tipoAutomovil;
    this.marcaAutomovil = marcaAutomovil;
    this.garante1 = garante1;
    this.valorAutomovil = valorAutomovil;
  }
  public PrestamoAutomovil(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo,
                           String tipoAutomovil, String marcaAutomovil, Persona garante1,
                           double valorAutomovil) {
    super(beneficiario, tiempoPrestamo, ciudadPrestamo);
    this.tipoAutomovil = tipoAutomovil;
    this.marcaAutomovil = marcaAutomovil;
    this.garante1 = garante1;
    this.valorAutomovil = valorAutomovil;
  }
  public String getTipoAutomovil() {
    return tipoAutomovil;
  }
  public void setTipoAutomovil(String tipoAutomovil) {
    this.tipoAutomovil = tipoAutomovil;
  }
  public String getMarcaAutomovil() {
    return marcaAutomovil;
  }
  public void setMarcaAutomovil(String marcaAutomovil) {
    this.marcaAutomovil = marcaAutomovil;
  }
  public Persona getGarante1() {
    return garante1;
  }
  public void setGarante1(Persona garante1) {
    this.garante1 = garante1;
  }
  public double getValorAutomovil() {
    return valorAutomovil;
  }
  public void setValorAutomovil(double valorAutomovil) {
    this.valorAutomovil = valorAutomovil;
  }
  public double getValorMensualPago() {
    return valorMensualPago;
  }
  public void calcularValorMensualPago() {
    this.valorMensualPago =(this.valorAutomovil/this.tiempoPrestamo);
  }
  @Override
  public void setCiudadPrestamo(String ciudadPrestamo) {
    this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
  }
  public String getCiudadPrestamo(){
    return ciudadPrestamo;
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\nTipo de Automóvil: ").append(tipoAutomovil);
    sb.append("\nMarca de Automóvil: ").append(marcaAutomovil);
    sb.append("\nGarante 1: ").append(garante1);
    sb.append("\nValor del Automóvil: ").append(valorAutomovil);
    sb.append("\nValor Mensual de Pago: ").append(valorMensualPago);
    return sb.toString();
  }
}
