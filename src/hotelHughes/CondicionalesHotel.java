package hotelHughes;

import java.util.Scanner;

public class CondicionalesHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1er requerimiento: Servicios adicionales
		System.out.println("**Servicios adicionales**");
		System.out.println("Usted solicitó servicios adicionales? Si: escriba true. No escriba false");
		Scanner solicitud = new Scanner(System.in);
			
		boolean serviciosAdicionales = solicitud.nextBoolean();
			
		if (serviciosAdicionales) {
				System.out.println("Usted solicitó servicios adicionales, se le hará un cargo extra");
		
		}else {
				System.out.println("Usted NO solicitó servicios adicionales");
				solicitud.close();}
		
		
		
		//2do requerimiento: Temporada dinamica
		System.out.println("**Temporada dinámica**");
		System.out.println("Por favor, ingrese la temporada en que nos visita: primavera: 1, verano: 2, otoño: 3, invierno: 4)");
		Scanner temporada = new Scanner(System.in);
		
		int visita = temporada.nextInt();
		
		if (visita == 1) {
			System.out.println("No aplica temporada dinamica");
		} else if (visita == 2) {
			System.out.println("Sí aplica temporada dinamica");
		} else if (visita == 3) {
			System.out.println("No aplica temporada dinamica");
		} else if (visita == 4) {
			System.out.println("Sí aplica temporada dinámica");
		}else {
			System.out.println("Temporada mal ingresada");
		} temporada.close();
		
				
		
		
		
		//3er requerimiento Horario check in
		System.out.println("**Horarios CheckIn**");
		
		System.out.println("Ingrese el horario de check-in(HH:mm): ");
		Scanner check = new Scanner(System.in);

		String checkIn = check.nextLine();

		System.out.println("Ingrese el horario de check-out(HH:mm): ");
		String checkOut = check.nextLine();

		//Para mostrar el horario ingresado
		System.out.println("Horario de Check-In: " + checkIn);
		System.out.println("Horario de Check-Out: " + checkOut);

		check.close(); //cierre del scanner
				
		
		
		
		//4to requerimiento RoomService
		System.out.println("**Room Service**");
		System.out.println("Usted solicito Room Service? Si, escriba true. No, escriba false."); //Se pregunta si hubo usos de room service
		Scanner solicitudRS = new Scanner(System.in);
			
			
			boolean roomService = solicitudRS.nextBoolean();
			
			if(roomService) { //Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
				System.out.println("Usted solicito Room Service, se le hara un cargo extra");
			}else { //Como no ocupo 
				System.out.println("Usted NO solicito Room Service");
			solicitudRS.close();}
		
		
		
		
		//5to requerimiento Huesped adicional
		System.out.println("**Huesped adicional**");
		
		int cantidadHuespedes = 2; 
		
		int capacidadMaxima = 4;
		
		if (cantidadHuespedes < capacidadMaxima) {
			System.out.println("Puede agregar un huésped adicional a la habitación.");
			
		} else {
			System.out.println("La habitación ha alcanzado su capacidad máxima de huéspedes.");	
		}
		
		
		
		
	}//cierre del metodo main

}//cierre de la clase condicionales
