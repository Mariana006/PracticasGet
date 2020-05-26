package GetSet;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int dat;
    
   Empleado arreglo[]=new Empleado[5];
    for(int i=0; i<arreglo.length;i++){
   
    System.out.println("Ingresa tu nombre ");
    String nombre=entrada.nextLine();
    System.out.println("Ingresa tu apellido");
    String apellido=entrada.nextLine();
    System.out.println("Ingresa tu edad");
    int edad= entrada.nextInt();
    entrada.nextLine();
    
    arreglo[i]=new Empleado(nombre,apellido,edad);
    }
for (Empleado arreglo1 : arreglo) {
System.out.println("Hola"+" " + arreglo1.getNombre()+" "+ arreglo1.getApellido()+"  "+" "+"tienes" + arreglo1.getEdad()+" "+"años");
        }
   do{
     System.out.println("\n¿Desea modificar datos de algun Empleado? \n Eliga el numero de empleado que desea modificar\n");
    System.out.println("1.Empleado 1");
    System.out.println("2.Empleado 2");
    System.out.println("3.Empleado 3");
    System.out.println("4.Empleado 4");
    System.out.println("5.Empleado 5");
    System.out.println("Introdusca la opcion\n");
     dat=entrada.nextInt();
   
   
   switch(dat){
        case 1:
   System.out.println("Ingrese los nuevos datos del empleado 1");
    System.out.println("Ingresa tu nombre ");
    String nombre1=entrada.nextLine();
    entrada.nextLine(); 
    System.out.println("Ingresa tu apellido");
    String apellido1=entrada.nextLine();
    System.out.println("Ingresa tu edad");
    int edad1=entrada.nextInt();  
System.out.println("Modificastes tus datos del Empleado 1\n Hola"+" "+nombre1+" "+apellido1+" "+"tienes"+" "+edad1+" "+"años");
break;
        
   case 2:
   System.out.println("Ingrese los nuevos datos del empleado 2");
    System.out.println("Ingresa tu nombre ");
    String nombre2=entrada.nextLine();
    entrada.nextLine();
    System.out.println("Ingresa tu apellido");
    String apellido2= entrada.nextLine();
    System.out.println("Ingresa tu edad");
    int edad2= entrada.nextInt();
    
    System.out.println("Modificastes tus datos del Empleado 2 \nHola"+nombre2+" "+apellido2+" "+"tienes"+" "+edad2+ " "+"años");
        break;
            
        case 3:
       System.out.println("Ingrese los nuevos datos del empleado 3");
       System.out.println("Ingresa tu nombre \n");
    String nombre3= entrada.nextLine();
    entrada.nextLine();
    System.out.println("Ingresa tu apellido\n");
    String apellido3= entrada.nextLine();
    System.out.println("Ingresa tu edad\n");
    int edad3= entrada.nextInt();
    System.out.println("Modificastes tus datos del Empleado 3\n Hola"+nombre3+" "+apellido3+" "+"tienes"+" "+edad3+ " "+"años");
        break;
        
        case 4:
    System.out.println("Ingrese los nuevos datos del empleado 4");
    System.out.println("Ingresa tu nombre \n");
    String nombre4=entrada.nextLine();
     entrada.nextLine();
    System.out.println("Ingresa tu apellido\n");
    String apellido4= entrada.nextLine();
    System.out.println("Ingresa tu edad\n");
    int edad4= entrada.nextInt();
   System.out.println("Modificastes tus datos del Empleado 4 \nHola"+nombre4+" "+apellido4+" "+"tienes"+" "+edad4+ " "+"años");
        break;
            
        case 5:
    System.out.println("Ingrese los nuevos datos del empleado 5");
    System.out.println("Ingresa tu nombre \n");
    String nombre5= entrada.nextLine();
    entrada.nextLine();
    System.out.println("Ingresa tu apellido\n");
    String apellido5= entrada.nextLine();
    System.out.println("Ingresa tu edad\n");
    int edad5= entrada.nextInt();
    System.out.println("Modificastes tus datos del Empleado 5 \nHola"+nombre5+" "+apellido5+" "+"tienes"+" "+edad5+ " "+"años");
        break;      
      default:
          System.out.println("Lo siento mucho no tenemos datos del Empleado");
       break;
    }
   }while(dat<=5);
    }
}
