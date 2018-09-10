	
	/* package schnelleFische
	 * @description Programm dient zur Erstellung einer Statistik 
	 * @author  Mauricio Muler Bodemann
	 * @version 1.0
	 */

	package schnelleFische;																		//Name vom package

	/*Imports*/
	
	import java.io.BufferedReader;                                                           	//Import für java.io.BufferedReader
	import java.io.FileNotFoundException;														//Import für java.io.FileNotFoundException
	import java.io.FileReader;																	//Import für java.io.FileReader
	import java.io.IOException;																	//Import für java.io.IOException

	/*Klasse SchnelleFische*/
	
	public class stats{																			//Beginn von public class SchnelleFische

	/*Variablen & Strings*/
		
	public static double hPro; 																	//Gesamtanzahl der Spiele
	public static double fPro;																	//Prozentsatz der Fische
	public static double frPro;																	//Prozentsatz der Fischer
	public static double unPro;																	//Prozentsatz der Unentschieden
	public static double fische;																//Anzahl der Siege der Fische
	public static double fischer;																//Anzahl der Siege der Fischer
	public static double unent;																	//Anzahl der Unentschieden
	public static String lin; 																	//Erstellt den String lin
	public static String lini; 																	//Erstellt den String lini
	public static String linie; 																//Erstellt den String linie	
	public static int spiele;																	//Erstellt den int spiele
	public static int f;																		//Erstellt den int f
	public static int fr;																		//Erstellt den int fr
	
	/*stat-Methode*/
	
	public static void stat() {																	//Beginn von public static void stat
		try{																					//Beginn von try
			BufferedReader les=new BufferedReader(new FileReader("StatistikFG.txt"));			//Erstellt den Reader les										
            fische=0;																			//Setzt Anzahl der gelesenen Zeilen auf 0
            while((lin=les.readLine())!=null)													//Ließt die Anzahl der Zeilen im Textdokument
            fische++;																			//Addiert pro Zeile 1 hinzu
            les.close();																		//Schließt BufferedReader les
        }catch(FileNotFoundException e){														//Fehlerausgabe
            e.printStackTrace();																//Verfolgt auftretende Fehler zum Ursprung zurück
        }catch(IOException e){																	//Fehlerausgabe
            e.printStackTrace();																//Verfolgt auftretende Fehler zum Ursprung zurück
        }																						//Ende von try
		try{																					//Beginn von try
            BufferedReader lese=new BufferedReader(new FileReader("StatistikFrG.txt"));			//Erstellt den Reader lese																					
            fischer=0;																			//Setzt Anzahl der gelesenen Zeilen auf 0
            	while((lini=lese.readLine())!=null)												//Ließt die Anzahl der Zeilen im Textdokument
            	fischer++;																		//Addiert pro Zeile 1 hinzu
            	lese.close();																	//Schließt BufferedReader lese
        }catch(FileNotFoundException e){														//Fehlerausgabe
            e.printStackTrace();																//Verfolgt auftretende Fehler zum Ursprung zurück
        }catch(IOException e){																	//Fehlerausgabe
            e.printStackTrace();																//Verfolgt auftretende Fehler zum Ursprung zurück
        }																						//Ende von try
		try{																					//Beginn von try
            BufferedReader lesen=new BufferedReader(new FileReader("StatistikU.txt"));			//Erstellt den Reader lesen 																					
            unent=0;																			//Setzt Anzahl der gelesenen Zeilen auf 0
            	while((linie=lesen.readLine())!=null)											//Ließt die Anzahl der Zeilen im Textdokument
            	unent++;																		//Addiert pro Zeile 1 hinzu
            	lesen.close();																	//Schließt BufferedReader lesen
        }catch(FileNotFoundException e){														//Fehlerausgabe
            e.printStackTrace();																//Verfolgt auftretende Fehler zum Ursprung zurück
        }catch (IOException e){																	//Fehlerausgabe
            e.printStackTrace();																//Verfolgt auftretende Fehler zum Ursprung zurück
        }																						//Ende von try
		hPro=fische+fischer+unent;																//Rechnet die Gesamtzahl der Spiele aus
		spiele=(int)hPro;																		//Wandelt double hPro in int spiele um
		System.out.println("Es wurden insgesamt "+spiele+" Spiele gespielt.");					//Gibt aus wie viele Spiele insgesamt gespielt wurden
		fPro=fische/hPro*100;																	//Rechnet aus zu wie viel Prozent die Fische gewinnen
		f=(int)fische;																			//Wandelt double fische in int f um
		System.out.println("Die Fische gewinnen zu "+fPro+" % mit "+f+" Siegen.");				//Gibt aus zu wie viel Prozent die Fische gewonnen haben
		frPro=fischer/hPro*100;																	//Rechnet aus zu wie viel Prozent die Fischer gewinnen
		fr=(int)fischer;																		//Wandelt double Fischer in int fr um
		System.out.println("Die Fischer gewinnen zu "+frPro+" % mit "+fr+" Siegen.");			//Gibt aus zu wie viel Prozent die Fischer gewonnen haben
		unPro=unent/hPro*100;																	//Rechnet aus zu wie viel Prozent es ein Unentschieden ist
		System.out.println("Es ist zu "+unPro+" % ein Unentschieden.");							//Gibt aus zu wie viel Prozent es ein Unentschieden ist 
	}																							//Ende von public static void stat
	
} 																								//Ende von public class stats