package org.pg;

import org.pg.datos.Departamentos;
import org.pg.datos.Direccion;
import org.pg.datos.Empleado;
import org.pg.datos.Empresa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direccion dir1 = new Direccion("Remigio Crespo", 6 - 26, 010101, "Cuenca", "Azuay");

		Empresa e1 = new Empresa("Claro", 1234567, dir1);

		Departamentos dep1 = new Departamentos("Informatica", 1, "Cuenca", e1);
		Departamentos dep2 = new Departamentos("Personal", 1, "Azogues", e1);

		Direccion diremp1 = new Direccion("Paseo de los Canaris", 5 - 25, 01011, "Cuenca", "Ecuador");
		Direccion diremp2 = new Direccion("Mayor", 18, 28801, "Alcalá de Henares", "Madrid");

		Empleado emp2 = new Empleado(4567, "Laura", 25, "Casada", 2500, "analista",diremp1,dep2);

		Direccion diremp3 = new Direccion("Santiago", 7, 28801, "Alcalá de Henares", "Madrid");

		Empleado emp3 = new Empleado(5678, "Maria", 40, "casada", 2500, "gerente",diremp2, dep2);

		System.out.println(e1.toString());
		System.out.println();
		System.out.println(dep1.toString());
		System.out.println();
		System.out.println(emp2.toString());
		System.out.println();
		System.out.println("Sueldo neto: " + emp2.sueldoNeto(20));
	}

}
