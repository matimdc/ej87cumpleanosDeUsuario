/*
ej87cumpleanosDeUsuario
8.7) Escriba un programa que, dado el dato del cumpleaños del usuario (día y mes), la
computadora diga cuál es su signo del zodiaco. Ejemplo: Se ingresa 24 y 2, la
computadora muestra “PISCIS”.
Algoritmo EJ23
	Definir dia Como Entero;
	Definir mes Como Entero;
	Escribir "Ingrese el día";
	Leer dia;
	Escribir "Ingrese el mes";
	Leer mes;
	Si dia >= 1 && dia <= 31 Entonces
		Si mes >= 1 && mes <= 12 Entonces
			Segun mes Hacer
				1:
					Si dia <= 21 Entonces
						Escribir "Sos de capricornio";
					Sino
						Escribir "Sos de acuario";
					FinSi
				2:
					Si dia <= 28 Entonces
						Si dia <= 19 Entonces
							Escribir "Sos de acuario";
						Sino
							Escribir "Sos de piscis";
						FinSi
					Sino
						Escribir "Febrero solo tiene 28 días (no contemplamos años bisiestos)";	
					FinSi
				3:
					Si dia <= 20 Entonces
						Escribir "Sos de piscis";
					Sino
						Escribir "Sos de aries";
					FinSi
				4:
					Si dia <= 30 Entonces
						Si dia <= 21 Entonces
							Escribir "Sos de aries";
						Sino
							Escribir "Sos de tauro";
						FinSi
					Sino
						Escribir "Abril solo tiene 30 días";	
					FinSi
				5:
					Si dia <= 22 Entonces
						Escribir "Sos de tauro";
					Sino
						Escribir "Sos de géminis";
					FinSi
				6:
					Si dia <= 30 Entonces
						Si dia <= 22 Entonces
							Escribir "Sos de géminis";
						Sino
							Escribir "Sos de cáncer";
						FinSi
					Sino
						Escribir "Junio solo tiene 30 días";	
					FinSi
				7:
					Si dia <= 22 Entonces
						Escribir "Sos de cáncer";
					Sino
						Escribir "Sos de leo";
					FinSi
				8:
					Si dia <= 24 Entonces
						Escribir "Sos de leo";
					Sino
						Escribir "Sos de virgo";
					FinSi
				9:
					Si dia <= 30 Entonces
						Si dia <= 23 Entonces
							Escribir "Sos de virgo";
						Sino
							Escribir "Sos de libra";
						FinSi
					Sino
						Escribir "Septiembre solo tiene 30 días";	
					FinSi
				10:
					Si dia <= 23 Entonces
						Escribir "Sos de libra";
					Sino
						Escribir "Sos de escorpio";
					FinSi
				11:
					Si dia <= 30 Entonces
						Si dia <= 23 Entonces
							Escribir "Sos de escorpio";
						Sino
							Escribir "Sos de sagitario";
						FinSi
					Sino
						Escribir "Noviembre solo tiene 30 días";	
					FinSi
				12:
					Si dia <= 22 Entonces
						Escribir "Sos de sagitario";
					Sino
						Escribir "Sos de capricornio";
					FinSi
			FinSegun
		Sino
			Escribir "Mes inválido";
		FinSi
	Sino
		Escribir "Día incorrecto";
	FinSi
FinAlgoritmo
 */
package ej87cumpleanosdeusuario;

/**
 *
 * @author Matias
 */
public class Ej87cumpleanosDeUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese dia");
        
                System.out.println("ingrese mes");

    }
    
    public static String cumpleanosDeUsuario(int dia, int mes) {
        
        
        return "s";
    }
    
    
    
}
