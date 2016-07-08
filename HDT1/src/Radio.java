/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135
* Joice Miranda, carne 15552

* Radio.java
*Esta es una interfaz que contiene los metodos que seran implementados por los distintos tipos de radio (de carro, de celular o de entretenimiento)
*/
public interface Radio {
    
    public void setEncendido(boolean estado);
    public void setFrecuencia(boolean frecuencia);
    public void setEmisora(double emisora);
    public void saveEmisora(int btn, double emisora);
    public double selectEmisora(int btn);
    public boolean getEncendido();
    public boolean getFrecuencia();
    public double getEmisora();
    
    public void subirEmisora(double emisora);
    public void bajarEmisora(double emisora);
}
