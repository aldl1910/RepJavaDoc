/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;

/**
 * 
 * @author anton
 */
public class CCuenta {


  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /** Constructor sin argumentos
   * 
   */
    public CCuenta ()
    {
    }
   /** Constructor con parametro para inciar todas las propiedades
    * 
    * @param nom Nombre del cliente de la cuenta
    * @param cue Número de la cuenta del cliente
    * @param sal Saldo actual en la cuenta
    * @param tipo Tipo de interes a aplicar a la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /** Método para asignar el nombre del titular de la cuenta
   * 
   * @param nom  Nombre del titular
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /** Método que devuelve el nombre del titular
    * 
    * @return <code>nombre</code> Nombre del titular
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /** Método que me devuelve el saldo disponible en cada momento
     * 
     * @return <code>saldo</code> Saldo disponible en la cuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /** Método para ingresar canatidades en la cuenta. Modifica el saldo
     * 
     * @param cantidad Dinero a ingresar en cuenta
     * @throws Exception Controlamos que no se introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /** Método para retirar cantidades en la cuenta. Modifica el saldo
    * 
    * @param cantidad Dinero a sacar de la cuenta
    * @throws Exception Controlamos que no se retiren cantidades negativas
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return 
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta 
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Asignamos el valor saldo
   * @param saldo Introduce el saldo actual
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Nos devuelve el tipo de interés
  * @return <>tipoInteres</> Porcentaje a aplicar
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Asignamos el valor del tipo de interés
   * @param tipoInterés Porcentaje a aplicar
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
