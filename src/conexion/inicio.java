/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Alhann
 */
public class inicio {
    
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        int option = 0;
                
        do{
            System.out.println("---------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear mensajes");
            System.out.println("2. Listar los mensaje");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir");
            
            option = Integer.valueOf(sc.nextLine());
            
            switch(option){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listaMensaje();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ingree valor valido");
                    
            }
            
        }while(option !=5);
        }
    
}
