/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.tarea2ejercicio2.bl.entidades;

public class Motor {

    /**
     * SerieMotor es el numero de serie del motor Cilindros la cantidad de
     * cilindros
     */
    private String serieMotor;
    private int cilindros;

    /**
     * Get del atributo/dato cilindro
     *
     * @return valor de cilindro
     */
    public int getCilindros() {
        return cilindros;
    }

    /**
     * Get la serie del montor
     *
     * @return serieMotor
     */
    public String getSerieMotor() {
        return serieMotor;
    }

    /**
     * recive el parametro cilindros
     *
     * @param cilindros
     */
    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    /**
     * recive el parametro serieMotor
     *
     * @param serieMotor
     */
    public void setSerieMotor(String serieMotor) {
        this.serieMotor = serieMotor;
    }

    /**
     * contructor vacio
     */
    public Motor() {
    }

    /**
     * constructor con parametros de serie y cilindros para crear el motor
     *
     * @param serie
     * @param cilindros
     */
    public Motor(String serie, int cilindros) {
        this.serieMotor = serie;
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Motor{" + "serie=" + serieMotor + ", cilindros=" + cilindros + '}';
    }

}
