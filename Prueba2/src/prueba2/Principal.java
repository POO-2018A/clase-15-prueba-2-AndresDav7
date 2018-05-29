package prueba2;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        Estudiantes[] estudiante = new Estudiantes[2] ;
        Materia[] materia = new Materia[2];
        
        System.out.println(" ##### Ingrese la Informacion de 5 Estudiantes #####");
        
        for(int i=0; i<2 ;i++){    
            
        System.out.print("\n * Ingrese el Nombre del Estudiante " + (i+1) + " :");
        String nombreEstudiante = scan.next();
        
        System.out.print(" * Ingrese la edad Estudiante " + (i+1) + " :");
        int edadEstudiante = scan.nextInt();
        
        System.out.println(" * Ingrese las materias del Estudiante " + (i+1) + "");
        scan.nextLine();
        System.out.print("Materia 1 : ");
        String materia1Estudiante = scan.nextLine();
        System.out.print("Nivel de Materia 1 : ");
        int nivelMat1 = scan.nextInt();
        
        scan.nextLine();
        System.out.print("\nMateria 2 : ");
        String materia2Estudiante = scan.nextLine();
        System.out.print("Nivel de Materia 2 : ");
        int nivelMat2 = scan.nextInt();
        
        materia[0] = new Materia(materia1Estudiante,nivelMat1);
        materia[1] = new Materia(materia2Estudiante,nivelMat2);
        
        estudiante[i] = new Estudiantes(nombreEstudiante,edadEstudiante,materia);
        
        System.out.println("\n-----> Se ha ingresado el estudiante con los siguientes datos:");
        System.out.println(estudiante[i].toString() + materia[0].toString()+ materia[1].toString());        
               
        }
        
        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
        if( estudiante[k].equals(estudiante[j]) && estudiante[k].getMaterias().equals(estudiante[j].getMaterias())){
            if(k != j){
                 System.out.println("\nSe duplica el estudiante :" + (j+1) + " con el estudiante " + (k+1));
                 
                    }
                }
            }
        }
        
    }
    
}
