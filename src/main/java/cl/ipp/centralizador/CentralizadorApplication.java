package cl.ipp.centralizador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CentralizadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizadorApplication.class, args);

		// Nombre - ApPaterno - ApMaterno - Sexo - FechaNac
		//Persona persona1 = new Persona("Alvaro", "Poblete", "Gutierrez", "Masculino", "1990-09-29");

		// ++ Especialidad
		// Funcionario funcionario1 = new Funcionario("Alvaro", "Poblete", "Gutierrez", "Masculino", "1990-09-29", "ENF001", "Enfermero");

		/*

		// Enfermedad - Notificacion inmediata
		Enfermedad sarampion = new Enfermedad(1, "Sarampion", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad rubeola = new Enfermedad(2, "Rubeola", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad infRespAgudasGraves = new Enfermedad(3, "Infecciones Respiratorias Agudas Graves", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad dengue = new Enfermedad(4, "Dengue", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad rabia = new Enfermedad(5, "Rabia", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad leptospira = new Enfermedad(6, "Leptospira", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad fiebreAmarilla = new Enfermedad(7, "Fiebre Amarilla", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad fiebreDelNiloOccidental = new Enfermedad(8, "Fiebre del Nilo Occidental", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad rabiaHumana = new Enfermedad(9, "Rabia Humana", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad calmopulmonarPorHantivirus = new Enfermedad(10, "Sindrome Calmopulmonar por Hantivirus", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad fiebreHemorragica = new Enfermedad(11, "Fiebre Hemorragica", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);
		Enfermedad poliomielitis = new Enfermedad(12, "Poliomielitis", Clasificacion.INMEDIATA, Tipo.VIRALES, 10);

		Enfermedad difteria = new Enfermedad(13, "Difteria", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad enfHaemophilus = new Enfermedad(14, "Enfermedad invasora por Haemophilus influenza", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad botulismo = new Enfermedad(15, "Botulismo", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad coleraBrucelosis = new Enfermedad(16, "ColeraBrucelosis", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad carbunco = new Enfermedad(17, "Carbunco", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad leptospirosis = new Enfermedad(18, "Leptospirosis", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad peste = new Enfermedad(19, "Peste", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad enfMeningococica = new Enfermedad(20, "Enfermedad Meningococica", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);
		Enfermedad meningitis = new Enfermedad(21, "Meningitis", Clasificacion.INMEDIATA, Tipo.BACTERIANAS, 10);

		Enfermedad malaria = new Enfermedad(22, "Malaria", Clasificacion.INMEDIATA, Tipo.OTROS, 10);
		Enfermedad triquinosis = new Enfermedad(23, "Triquinosis", Clasificacion.INMEDIATA, Tipo.OTROS, 10);
		Enfermedad intoxPlaguicidas = new Enfermedad(24, "Intoxicaciones Agudas por Plaguicidas", Clasificacion.INMEDIATA, Tipo.OTROS, 10);


		// Enfermedad - Notificacion diaria
		Enfermedad parotiditis = new Enfermedad(25, "Parotiditis", Clasificacion.DIARIA, Tipo.VIRALES, 10);
		Enfermedad rubeolaCongenita = new Enfermedad(26, "Rubeola Congenita", Clasificacion.DIARIA, Tipo.VIRALES, 10);
		Enfermedad hepatitisAE = new Enfermedad(27, "Hepatitis viral A y E", Clasificacion.DIARIA, Tipo.VIRALES, 10);
		Enfermedad hepatitisBC = new Enfermedad(28, "Hepatitis viral B y C", Clasificacion.DIARIA, Tipo.VIRALES, 10);
		Enfermedad vih = new Enfermedad(29, "Sindrome de Inmunodeficiencia Adquirida (VIH/Sida)", Clasificacion.DIARIA, Tipo.VIRALES, 10);

		Enfermedad coqueluche = new Enfermedad(30, "Coqueluche", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad tuberculosis = new Enfermedad(31, "Tuberculosis en todas sus formas y localizaciones", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad fiebreTifoideaParatifoidea = new Enfermedad(32, "Fiebre Tifoidea y Paratifoidea", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad psitacosis = new Enfermedad(33, "Psitacosis", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad tifusExantematicoEpidemico = new Enfermedad(34, "Tifus Exantematico Epidemico", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad gonorrea = new Enfermedad(35, "Gonorrea", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad sifilis = new Enfermedad(36, "Sifilis en todas sus formas y localizaciones", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad lepra = new Enfermedad(37, "Lepra", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad tetanos = new Enfermedad(38, "Tetanos", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);
		Enfermedad tetanosNeonatal = new Enfermedad(39, "Tetanos neonatal", Clasificacion.DIARIA, Tipo.BACTERIANAS, 10);

		Enfermedad enfDeChagas = new Enfermedad(40, "Enfermedad de Chagas - Tripanosomiasis Americana", Clasificacion.DIARIA, Tipo.OTROS, 10);
		Enfermedad hidatidosis = new Enfermedad(41, "Hidatidosis", Clasificacion.DIARIA, Tipo.OTROS, 10);
		Enfermedad enfCreutzfeldtJakob = new Enfermedad(42, "Enfermedad de Creutzfeldt-Jakob", Clasificacion.DIARIA, Tipo.OTROS, 10);

		// Enfermedad - notificación exclusiva a través de establecimientos centinelas
		Enfermedad influenza = new Enfermedad(43, "Influenza", Clasificacion.CENTINELA, Tipo.PROBLEMAS_SALUD, 10);
		Enfermedad infRespAgudas = new Enfermedad(43, "Infecciones Respiratorias Agudas", Clasificacion.CENTINELA, Tipo.PROBLEMAS_SALUD, 10);
		Enfermedad diarreasEnMenores = new Enfermedad(43, "Diarreas en menores de 5 años", Clasificacion.CENTINELA, Tipo.PROBLEMAS_SALUD, 10);
		Enfermedad ets = new Enfermedad(43, "Enfermedades de transmision sexual (excepto Gonorrea, Sifilis y VIH/SIDA)", Clasificacion.CENTINELA, Tipo.PROBLEMAS_SALUD, 10);
		Enfermedad varicel = new Enfermedad(47, "Varicel", Clasificacion.CENTINELA, Tipo.PROBLEMAS_SALUD, 10);




		System.out.println(persona1.toString());
		System.out.println(funcionario1.toString());
		System.out.println(sarampion.toString());


		 */


		/*Etapa etapa01 = new Etapa(1, "SARAMP", EtapaID.ETAPA_01, "Período de Incubacion", 10);
		Etapa etapa02 = new Etapa(2, "SARAMP", EtapaID.ETAPA_02, "Fase Prodromica", 4);
		Etapa etapa03 = new Etapa(3, "SARAMP", EtapaID.ETAPA_03, "Exantema (Erupcion Cutanea)", 6);
		Etapa etapa04 = new Etapa(4, "SARAMP", EtapaID.ETAPA_04, "Fase de Estado", 5);
		Etapa etapa05 = new Etapa(5, "SARAMP", EtapaID.ETAPA_05, "Recuperacion", 14);

		List<Etapa> etapasSarampion = new ArrayList<>();
		etapasSarampion.add(etapa01);
		etapasSarampion.add(etapa02);
		etapasSarampion.add(etapa03);
		etapasSarampion.add(etapa04);
		etapasSarampion.add(etapa05);

		Enfermedad sarampion = new Enfermedad(1,"SARAMP", "Sarampion", Clasificacion.INMEDIATA, Tipo.VIRALES, 39, etapasSarampion);

		Sintoma sintomaEtapa01 = new Sintoma(1, "SARAMP", EtapaID.ETAPA_01, "Fiebre", "Descanso", "Consultar al médico si persiste", true);
		Sintoma sintomaEtapa02 = new Sintoma(2, "SARAMP", EtapaID.ETAPA_02,"Tos seca", "Hidratación", "Evitar el contacto con personas vulnerables", true);
		Sintoma sintomaEtapa03 = new Sintoma(3, "SARAMP", EtapaID.ETAPA_03,"Erupción cutánea", "Mantener la piel limpia y seca", "Consultar al médico si empeora", true);
		Sintoma sintomaEtapa04 = new Sintoma(4, "SARAMP", EtapaID.ETAPA_04,"Fiebre alta", "Reposo", "Monitorear signos vitales", true);
		Sintoma sintomaEtapa05 = new Sintoma(5, "SARAMP", EtapaID.ETAPA_05,"Fatiga", "Alimentación equilibrada", "Descanso adecuado", true);

		 */

	}
}
