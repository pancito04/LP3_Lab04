package Ejercicio2;
import java.util.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double contH = 0, contM = 0;
		double contHT = 0, contMT = 0;
		int varonChamba=0, mujerChamba=0;
		double sueldosVaron = 0, sueldosMujer=0;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona('F', true, 1000));
		personas.add(new Persona('M', true, 1000));
		personas.add(new Persona('M'));
		personas.add(new Persona('F', true, 5000));
		personas.add(new Persona('M', true, 3700));
		personas.add(new Persona('F'));
		personas.add(new Persona('M'));
		personas.add(new Persona('M', true, 1000));
		for (int i=0; i<personas.size(); i++) {
			if (personas.get(i).getSexo() == 'M') {
				contH += 1;
			}else {
				contM +=1;
			}
			if (personas.get(i).getSexo()=='M' && personas.get(i).isChamba()==true) {
				contHT +=1;
			}
			if(personas.get(i).getSexo()=='F' && personas.get(i).isChamba()==true)
			{
				contMT +=1;
			}
			if (personas.get(i).getSexo()== 'M' && personas.get(i).isChamba()==true) {
				varonChamba+=1;
				sueldosVaron += personas.get(i).getSueldo();
			}
			if (personas.get(i).getSexo()== 'F' && personas.get(i).isChamba()==true) {
				mujerChamba+=1;
				sueldosMujer += personas.get(i).getSueldo();
			}
		}
		//A
		System.out.println("El porcentaje de hombres es "+contH*100/8);
		//B
		System.out.println("El porcentaje de mujeres es "+contM*100/8);
		//C
		System.out.println("El porcentaje de hombres y que al mismo tiempo trabajan es " + contHT*100/8);
		//D
		System.out.println("El porcentaje de mujeres y que al mismo tiempo trabajan es " + contMT*100/8);
		//E
		System.out.println("El promedio de sueldos de los hombres que trabajan es " + sueldosVaron/varonChamba);
		//F
		System.out.println("El promedio de sueldos de las mujeres que trabajan es" + sueldosMujer/mujerChamba);
	}
}	