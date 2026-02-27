package cuentas;

/**
 * Classe que representa un compte bancari bàsic.
 * Permet consultar el saldo i realitzar ingressos i retirades.
 * 
 * @author Joan Valls de Padrines Amengual
 */
public class CCuenta {

    /** Titular del compte. */
    private String nombre;
    
    /** Número/identificador del compte. */
    private String cuenta;
    
    /** Saldo actual del compte. */
    private double saldo;
    
    /** Tipus d’interès aplicable al compte. */
    private double tipoInterés;

    /** Constructor buit. */
    public CCuenta()
    {
    }

    /**
     * Constructor parametritzat.
     * @param nom nom del titular
     * @param cue número de compte
     * @param sal saldo inicial
     * @param tipo tipus d’interès
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Retorna el nom del titular
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Permet definir el nom del titular
     * @param nombre String nom del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el número/identificador del compte
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Permet definit el número/identificador del compte
     * @param cuenta String identificador del compte
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Retorna el saldo del compte
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Permet definir el saldo del compte
     * @param saldo double saldo del compte
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Retorna el tipus d'interés del compte
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Permet definir el tipus d'interés del compte
     * @param tipoInterés double tipus d'interés del compte
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }    
    
    /**
     * Retorna el saldo actual del compte.
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingressa una quantitat al compte.
     * @param cantidad quantitat a ingressar
     * @throws Exception si la quantitat és negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una quantitat del compte.
     * @param cantidad quantitat a retirar
     * @throws Exception si la quantitat és negativa o no hi ha saldo suficient
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
