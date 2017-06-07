/*
ej87cumpleanosDeUsuario
8.7) Escriba un programa que, dado el dato del cumpleaños del usuario (día y mes), la
computadora diga cuál es su signo del zodiaco. Ejemplo: Se ingresa 24 y 2, la
computadora muestra “PISCIS”.
Algoritmo EJ23 gg
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

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ej87cumpleanosDeUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese dia");
        int dia = entrada.nextInt();

        System.out.println("ingrese mes");
        int mes = entrada.nextInt();

        cumpleanosDeUsuario(dia, mes);
    }

    static void cumpleanosDeUsuario(int dia, int mes) {

        if (dia >= 1 && dia <= 31) {
            if (mes >= 1 && mes <= 12) {

                switch (mes) {
                    case 1:
                        if (dia <= 21) {
                            System.out.println("Sos de capricornio");
                        } else {
                            System.out.println("Sos de acuario");
                        }
                        break;
                    case 2:
                        if (dia <= 28) {
                            if (dia <= 19) {
                                System.out.println("Sos de acuario");
                            } else {
                                System.out.println("Sos de piscis");
                            }
                        } else {
                            System.out.println("Febrero solo tiene 28 días (no contemplamos años bisiestos)");
                        }
                        break;
                    case 3:
                        if (dia <= 20) {
                            System.out.println("Sos de piscis");
                        } else {
                            System.out.println("Sos de aries");
                        }
                        break;
                    case 4:
                        if (dia <= 30) {
                            if (dia <= 21) {
                                System.out.println("Sos de aries");
                            } else {
                                System.out.println("Sos de tauro");
                            }
                        } else {
                            System.out.println("Abril solo tiene 30 días");
                        }
                        break;
                    case 5:
                        if (dia <= 22) {
                            System.out.println("Sos de tauro");
                        } else {
                            System.out.println("Sos de géminis");
                        }
                        break;
                    case 6:
                        if (dia <= 30) {
                            if (dia <= 22) {
                                System.out.println("Sos de géminis");
                            } else {
                                System.out.println("Sos de cáncer");
                            }
                        } else {
                            System.out.println("Junio solo tiene 30 días");
                        }

                        break;
                    case 7:
                        if (dia <= 22) {
                            System.out.println("Sos de cáncer");
                        } else {
                            System.out.println("Sos de leo");
                        }
                        break;
                    case 8:
                        if (dia <= 24) {
                            System.out.println("Sos de leo");
                        } else {
                            System.out.println("Sos de virgo");
                        }
                        break;
                    case 9:
                        if (dia <= 30) {
                            if (dia <= 23) {
                                System.out.println("Sos de virgo");
                            } else {
                                System.out.println("Sos de libra");
                            }
                        } else {
                            System.out.println("Septiembre solo tiene 30 días");
                        }
                        break;
                    case 10:
                        if (dia <= 23) {
                            System.out.println("Sos de libra");
                        } else {
                            System.out.println("Sos de escorpio");
                        }
                        break;
                    case 11:
                        if (dia <= 30) {
                            if (dia <= 23) {
                                System.out.println("Sos de escorpio");
                            } else {
                                System.out.println("Sos de sagitario");
                            }
                        } else {
                            System.out.println("Noviembre solo tiene 30 días");
                        }
                        break;

                    case 12:
                        if (dia <= 22) {
                            System.out.println("Sos de sagitario");
                        } else {
                            System.out.println("Sos de capricornio");
                        }
                        break;
                    default:
                        System.out.println("MES INVALIDO");

                }
            }
        } else {
            System.out.println("DIA INVALIDO");
        }

    }

}
