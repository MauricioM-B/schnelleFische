package schnelleFische2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class schnelleFische {
	
	public static int x=5;
	public static int y=5;
	public static int start=0;
	public static int startF=start+x+1;
	public static int end=startF+y+1;
	public static int boot=start;
	public static int f1=0;
	public static int f2=0;
	public static int f3=0;
	public static int f4=0;
	public static int fg1=0;
	public static int fg2=0;
	public static int fg3=0;
	public static int fg4=0;
	
	public static int farbe;

	public static void main(String[] args) {
		dateien();
		
	}

	public static void wuerfeln(){ 															//Beginn von public static void wuerfeln
		Random wuerfel=new Random();														//Erstellt ein Random
		farbe=1+wuerfel.nextInt(6);															//Zahlenspektrum des Würfels ist von 1 bis 6
		System.out.println("Es wurde eine "+farbe+" gewürfelt.");										//Gibt in die Konsole aus was gewürfelt wurde
	} 																						//Ende von public static void wuerfeln
	
	public static void fischer() {															//Beginn von public static void fischer
		if (farbe==1||farbe==2) {
			boot=boot+1;
		}else {
		 
		}
	}
	
	public static void fische() {															//Beginn von public static void fische
		
	}
	
	public static void fG(){ 																//Beginn von public static void fG
		try{																				//Beginn von try
			File datei=new File("StatistikFG.txt"); 											//Erstellt Datei Statistik.txt
			FileWriter schreib=new FileWriter(datei, true); 								//Schreiber für die Datei
			schreib.write("Fische"); 														//Schreibt Fische in die Datei
			schreib.write(System.getProperty("line.separator")); 							//Setzt eine Zeile Abstand
			schreib.flush();																//Schreibt alle gepufferten Daten in den Stream
			schreib.close(); 																//Schließt den Schreibvorgang ab
		}catch(IOException e){ 																//Fehlerausgabe
			e.printStackTrace(); 															//Verfolgt auftretende Fehler zum Ursprung zurück
		} 																					//Ende von try			
	} 																						//Ende von public static void fG
	
	public static void frG(){ 																//Beginn von public static void frG
		try{																				//Beginn von try
			File datei=new File("StatistikFrG.txt"); 										//Erstellt Datei Statistik.txt
			FileWriter schreib=new FileWriter(datei, true); 								//Schreiber für die Datei
			schreib.write("Fischer"); 														//Schreibt Fischer in die Datei
			schreib.write(System.getProperty("line.separator")); 							//Setzt eine Zeile Abstand
			schreib.flush(); 																//Schreibt alle gepufferten Daten in den Stream
			schreib.close(); 																//Schließt den Schreibvorgang ab
		}catch(IOException e){																//Fehlerausgabe
			e.printStackTrace(); 															//Verfolgt auftretende Fehler zum Ursprung zurück
		} 																					//Ende von try
	} 																						//Ende von public static void frG
	
	public static void unentschieden(){ 													//Beginn von public static void unentschieden
																							//Legt fest ob ein Unentschieden notiert wird
		try{																				//Beginn von try
			File datei=new File("StatistikU.txt"); 											//Erstellt Datei Statistik.txt
			FileWriter schreib=new FileWriter(datei, true); 								//Schreiber für die Datei
			schreib.write("Unentschieden"); 												//Schreibt Unentschieden in die Datei
			schreib.write(System.getProperty("line.separator")); 							//Setzt eine Zeile Abstand
			schreib.flush(); 																//Schreibt alle gepufferten Daten in den Stream
			schreib.close(); 																//Schließt den Schreibvorgang ab
		}catch(IOException e){																//Fehlerausgabe
			e.printStackTrace(); 															//Verfolgt auftretende Fehler zum Ursprung zurück
			} 																				//Ende von try
																							//Ende von if(check)
	} 																						//Ende von public static void unentschieden	

	public static void dateien(){															//Beginn von public static void dateien
		PrintWriter schreib;																//Erstellt PrintWriter schreib
	    try{																				//Beginn von try
        	schreib = new PrintWriter(new FileWriter("StatistikFG.txt", true));  			//Erstellt die Datei StatistikFG.txt
	        schreib.close();																//Schließt PrintWriter schreib
	    }catch(IOException e){																//Fehlerausgabe
	      	e.printStackTrace();															//Verfolgt auftretende Fehler zum Ursprung zurück       
	   	}																					//Ende von try
	    try{																				//Beginn von try
	        schreib = new PrintWriter(new FileWriter("StatistikFrG.txt", true));  			//Erstellt die Datei StatistikFrG.txt
	        schreib.close();																//Schließt PrintWriter schreib
	   	}catch(IOException e){																//Fehlerausgabe
	        e.printStackTrace();															//Verfolgt auftretende Fehler zum Ursprung zurück
	   	}																					//Ende von try
	   	try{																				//Beginn von try
	        schreib = new PrintWriter(new FileWriter("StatistikU.txt", true));  			//Erstellt die Datei StatistikU.txt
	        schreib.close();																//Schließt PrintWriter schreib
	   	}catch(IOException e){																//Fehlerausgabe
	        e.printStackTrace();															//Verfolgt auftretende Fehler zum Ursprung zurück
	   	}																					//Ende von try
	}																						//Ende von public static void dateien
	
}
