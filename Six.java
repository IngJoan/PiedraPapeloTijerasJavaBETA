import java.util.Scanner;

public class Six{
	public static void main(String args[]){
	
	String nombre = "", apellido = "";
	String Pc = "" ;
	String Seleccion = "";

	Scanner in = new Scanner(System.in);
	System.out.println(" :: Piedra Papel Tijeras :: ");
	
	System.out.println("Selecciona Uno para ti :: ");
	Seleccion = in.nextLine();
	
	System.out.println("El Pc elige :: ");
	Pc = in.nextLine();


	if(Seleccion.equals("Piedra") && Pc.equals("Tijeras")){
	System.out.println("Win");	
	}else{
		if(Seleccion.equals("Papel") && Pc.equals("Piedra") ){
		System.out.println("Win");
		}else{
			if(Seleccion.equals("Tijeras") && Pc.equals("Papel")){
			System.out.println("Win");	
			}else{
				System.out.println("Lose");
			}
		}
	}	
	

	
 }
}