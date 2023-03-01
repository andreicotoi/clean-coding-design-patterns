package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Utils;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;
import cts.s02.principii_clean_code.clase.readers.ElevReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaElevi;
		try {
			AplicantReader aplicantReader = new ElevReader();

			listaElevi = aplicantReader.readAplicants("elevi.txt");
			for(Aplicant aplicant :listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
