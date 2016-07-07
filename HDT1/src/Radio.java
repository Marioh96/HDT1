/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135
* Joice Miranda, carne 15552

* Radio.java
*Esta es una interfaz que contiene los metodos que seran implementados por los distintos tipos de radio (de carro, de celular o de entretenimiento)
*/
public interface Radio {
    
    void setEncendido(boolean estado);
    void setFrecuencia(boolean frecuencia);
    void setEmisora(double emisora);
    /*Los siguientes dos metodos los agregue para que fuera mas facil usar los botones del GUI para cambiar la emisora*/
    void subirEmisora(double emisora);
    void bajarEmisora(double emisora);
    
    void saveEmisora(int btn);
    void selectEmisora(int btn);
    boolean getEncendido();
    boolean getFrecuencia();
    double getEmisora();
    
}
