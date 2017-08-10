
package tarea3;

import java.util.Scanner;




public class UsuariosMenu {
    public UsuariosMenu(){
        while(true){
            
        tec in = new tec();
        
        
        System.out.println("1. Ingresar Usuario");
        System.out.println("2. Mostrar todos los usuarios");
        System.out.println("3. Mostrar un Usuario Personalizado");
        System.out.println("4. Menu Principal");
        System.out.println("5. Salir");
        
        int opcion = in.getInt("Seleccionar: ");
        opciones(opcion);
    }
        }
    
    public static void opciones(int opcion){
        switch(opcion){
            case 1:
                Scanner leer = new Scanner(System.in);
                IngresarDatos d[] = new IngresarDatos[5];
                String usuario;
                for(int i=0;i<d.length;i++){
                    System.out.println("Ingresa usuario");
                    usuario=leer.nextLine();
                    leer.nextLine(); 
                    d[i]=new IngresarDatos(usuario);
                    
                }for(int i=0;i<d.length;i++){
                System.out.println(d[i].getusuario()+"");
            }
                break;
            case 2:
                
                break;
            case 3:
                System.out.println("Nicolita");
                break;
            case 4:
               
                break;
            case 5:
                System.exit(0);
                break;
        }
}
}
