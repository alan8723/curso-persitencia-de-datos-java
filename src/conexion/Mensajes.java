/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author Alhann
 */
public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String fevha_mensaje;
    
    public Mensajes(){
        
    }

    public Mensajes(String mensaje, String autor_mensaje, String fevha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fevha_mensaje = fevha_mensaje;
    }
    
    

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFevha_mensaje() {
        return fevha_mensaje;
    }

    public void setFevha_mensaje(String fevha_mensaje) {
        this.fevha_mensaje = fevha_mensaje;
    }
            
    
}
