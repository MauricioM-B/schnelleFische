
	/* package schnelleFische
	 * @description Programm führt eine Simulation des Spieles Schnell Fische aus
	 * @author  Mauricio Muler Bodemann
	 * @version 1.0
	 */

	package schnelleFische;																	//Name vom package

	/*Imports*/
	
	import java.io.File; 																	//Import für java.io.File
	import java.io.FileWriter; 																//Import für java.io.FileWriter
	import java.io.IOException; 															//Import für java.io.IOException
	import java.io.PrintWriter;																//Import für java.io.PrintWriter
	import java.util.Random; 																//Import für java.util.Random

	/*Klasse SchnelleFische*/

	public class SchnelleFische{															//Beginn von public class SchnelleFische	
	
	/*Variablen & etc.*/
		
	public static int farbe; 																//Würfelzahl
	public int anzahlFische=4; 																//Anzahl der Fische
	public int anzahlFischer=2; 															//Anzahl der Fischer
	public static int xOne=7; 																//Variable für Entfernung vom Start der Fischer zum Start der Fische
	public static int xTwo=7; 																//Variable für Entfernung vom Start der Fische zum Ziel
	public static int boot=0; 																//Feld vom Boot
	public static int start=0; 																//Start der Fischer
	public static int startF=start+xOne+1; 													//Start der Fische
	public static int ende=startF+xTwo+1; 													//Ende vom Spielfeld
	public static int fOne=startF; 															//Fisch 1
	public static int fTwo=startF;															//Fisch 2
	public static int fThree= startF; 														//Fisch 3
	public static int fFour= startF; 														//Fisch 4
	public static int fOneG=0; 																//Fisch 1 gefangen
	public static int fTwoG=0; 																//Fisch 2 gefangen
	public static int fThreeG=0; 															//Fisch 3 gefangen
	public static int fFourG=0; 															//Fisch 4 gefangen
	public static FileWriter schreib; 														//Schreiber für Dateien
	public static int write=1; 																//Legt fest was in die Dateien geschrieben wird
	public static int fOneN=0; 																//Legt fest, dass if(boot==fOne) verwendet werden darf
	public static int fTwoN=0;																//Legt fest, dass if(boot==fOne) verwendet werden darf
	public static int fThreeN=0;															//Legt fest, dass if(boot==fOne) verwendet werden darf
	public static int fFourN=0;																//Legt fest, dass if(boot==fOne) verwendet werden darf
	public static int fOneZ=0;																//Legt fest, ob Fisch 1 das Ziel erreicht hat 
	public static int fTwoZ=0;																//Legt fest, ob Fisch 2 das Ziel erreicht hat
	public static int fThreeZ=0;															//Legt fest, ob Fisch 3 das Ziel erreicht hat
	public static int fFourZ=0;																//Legt fest, ob Fisch 4 das Ziel erreicht hat
	public static boolean check1=(fOneG==1&&fTwoG==1)||(fOneG==1&&fThreeG==1)||(fOneG==1&&fFourG==1)||(fTwoG==1&&fThreeG==1)||(fTwoG==1&&fFourG==1)||(fThreeG==1&&fFourG==1); 
	public static boolean check2=(fOne==ende&&fTwo==ende)||(fOne==ende&&fThree==ende)||(fOneG==ende&&fFourG==ende)||(fTwoG==ende&&fThreeG==ende)||(fTwoG==ende&&fFourG==ende)||(fThreeG==ende&&fFourG==ende);
	public static boolean check=check1&&check2;												//Prüft ob mindestens 2 Fische im Ziel sind
 
	/*main-Methode*/
	
	public static void main(String[] args){ 												//Beginn von public static void main
		dateien();																			//Führt public static void dateien aus
       for (int i=1;i<35;i++){ 																//Beginn der for-Schleife
    	   wuerfeln();																		//Führt public static void wuerfeln aus
    	   fischer();																		//Führt public static void wuerfeln aus
    	   fischEins();																		//Führt public static void fischEins aus
    	   fischZwei();																		//Führt public static void fischZwei aus
    	   fischDrei();																		//Führt public static void fischDrei aus
    	   fischVier();																		//Führt public static void fischVier aus
		if(fOneG==1&&fTwoG==1&&fThreeG==1&&fFourG==1){ 										//Prüft ob if(fOneG==1&&fTwoG==1&&fThreeG==1&&fFourG==1) wahr ist
			write=2; 																		//Legt write=2 fest
			break;																			//Stoppt die for-Schleife
		}else {																				//Ende von if(fOneG==1&&fTwoG==1&&fThreeG==1&&fFourG==1)
		if (check==true) {
			write=3;
			break;
				}
			}
       }
		if (write==3){																	//Prüft ob check true ist ist
			unentschieden();																//Führt public static void unentschieden aus
			System.out.println("Es ist ein Unentschieden!");								//Gibt in die Konsole aus, dass es ein Unentschieden ist
			write=1;																		//Setzt write auf Standard	
		}else{																				//Ende von if (write==3)																
		if(write==2){																		//Prüft ob write=2 ist
			frG();																			//Führt public static void frG aus
			System.out.println("Die Fischer haben gewonnen!");								//Gibt in die Konsole aus, dass die Fischer gewinnen
			write=1;																		//Setzt write auf Standard
		}else{ 																				//Ende von if(write==2)
		if(write==1){																		//Prüft ob write=1 ist
			fG();																			//Führt public static void fG aus
			System.out.println("Die Fische haben gewonnen!");								//Gibt in die Konsole aus, dass die Fische gewinnen
				}																			//Ende von if(write==1)
			} 																				//Ende von else
		}																					//Ende von else
		stats.stat();																		//Führt das public static void stat aus der Klasse stats.java aus																						
	} 																						//Ende von public static void main
		
	/*wuerfeln-Methode*/	
	
	public static void wuerfeln(){ 															//Beginn von public static void wuerfeln
		Random wuerfel=new Random();														//Erstellt ein Random
		farbe=1+wuerfel.nextInt(6);															//Zahlenspektrum des Würfels ist von 1 bis 6
		System.out.println("Würfel zeigt"+" "+farbe);										//Gibt in die Konsole aus was gewürfelt wurde
	} 																						//Ende von public static void wuerfeln
	
	/*fischer-Methode*/
	
	public static void fischer(){ 															//Beginn von public static void fischer
		if(farbe==1||farbe==2){																//Prüft ob eine 1 oder 2 gewürfelt wurde
			boot=boot+1;																	//Lässt das Boot ein Feld vorwärts laufen
			System.out.println("Das Boot ist auf Feld"+" "+boot);							//Gibt in die Konsole aus, auf welchem Feld sich das Boot befindet
	} 																						//Ende von if (farbe==1||farbe==2)
		if(fOneN==0){																		//Prüft ob if(boot==fOne) noch verwendet werden darf
			if(boot==fOne){																	//Prüft ob das Boot auf dem selben Feld wie Fisch 1 ist
				fOneG=1;																	//Gibt aus, dass Fisch 1 gefangen wurde
				fOneN=1;																	//Legt fest, dass if(boot==fOne) nicht mehr verwendet werden darf
				System.out.println("Fisch 1 wurde gefangen!");								//Gibt in die Konsole aus, dass Fisch 1 gefangen wurde
		} 																					//Ende von if (boot==fOne)
	} 																						//Ende von if(fOneN==0)
		if(fTwoN==0){																		//Prüft ob if(boot==fTwo) noch verwendet werden darf
			if(boot==fTwo){																	//Prüft ob das Boot auf dem selben Feld wie Fisch 2 ist
				fTwoG=1;																	//Gibt aus, dass Fisch 2 gefangen wurde
				fTwoN=1;																	//Legt fest, dass if(boot==fTwo) nicht mehr verwendet werden darf
				System.out.println("Fisch 2 wurde gefangen!");								//Gibt in die Konsole aus, dass Fisch 2 gefangen wurde
		} 																					//Ende von if (boot==fTwo)
	} 																						//Ende von if (fTwoN==0)
		if(fThreeN==0){																		//Prüft ob if(boot==fThree) noch verwendet werden darf
			if(boot==fThree){																//Prüft ob das Boot auf dem selben Feld wie Fisch 3 ist
				fThreeG=1;																	//Gibt aus, dass Fisch 3 gefangen wurde
				fThreeN=1;																	//Legt fest, dass if(boot==fThree) nicht mehr verwendet werden darf
				System.out.println("Fisch 3 wurde gefangen!");								//Gibt in die Konsole aus, dass Fisch 3 gefangen wurde
		} 																					//Ende von if (boot==fThree)
	} 																						//Ende von if(fThreeN==0)
		if(fFourN==0){																		//Prüft ob if(boot==fFour) noch verwendet werden darf
			if(boot==fFour){																//Prüft ob das Boot auf dem selben Feld wie Fisch 4 ist
				fFourG=1;																	//Gibt aus, dass Fisch 4 gefangen wurde
				fFourN=1;																	//Legt fest, dass if(boot==fFour) nicht mehr verwendet werden darf
				System.out.println("Fisch 4 wurde gefangen!");								//Gibt in die Konsole aus, dass Fisch 4 gefangen wurde
		} 																					//Ende von if (boot==fFour)
	} 																						//Ende von if(fFourN==0)
		if(fOneG==1){																		//Prüft ob Fisch                           1 gefangen wurde
			if(farbe==3){																	//Prüft ob der Würfel eine 3 zeigt
				boot= boot+1;																//Lässt das Boot ein Feld vorwärts laufen
				System.out.println("Das Boot ist auf Feld"+" "+boot);						//Gibt in die Konsole aus, auf welchem Feld sich das Boot befindet
			} 																				//Ende von if(farbe==3)
	} 																						//Ende von if(fOneG==1) 	
		if(fTwoG==1){																		//Prüft ob Fisch 2 gefangen wurde
			if(farbe==4){ 																	//Prüft ob der Würfel eine 4 zeigt
				boot= boot+1;																//Lässt das Boot ein Feld vorwärts laufen
				System.out.println("Das Boot ist auf Feld"+" "+boot);						//Gibt in die Konsole aus, auf welchem Feld sich das Boot befindet
	} 																						//Ende von if(farbe==4)	
		if(fThreeG==1){																		//Prüft ob Fisch 3 gefangen wurde	
			if(farbe==5){																	//Prüft ob der Würfel eine 5 zeigt
				boot= boot+1;																//Lässt das Boot ein Feld vorwärts laufen
				System.out.println("Das Boot ist auf Feld"+" "+boot);						//Gibt in die Konsole aus, auf welchem Feld sich das Boot befindet
	} 																						//Ende von if(farbe==5)
		if(fFourG==1){																	 	//Prüft ob Fisch 4 gefangen wurde
			if(farbe==6){																	//Prüft ob der Würfel eine 6 zeigt
				boot= boot+1;																//Lässt das Boot ein Feld vorwärts laufen
				System.out.println("Das Boot ist auf Feld"+" "+boot);						//Gibt in die Konsole aus, auf welchem Feld sich das Boot befindet
					} 																		//Ende von if(farbe==6)	
				} 																			//Ende von if(fFourG==1)
			} 																				//Ende von if(fThreeG==1)
		} 																					//Ende von if(fTwoG==1)
	} 																						//Ende von public static void fischer
	
	/*fischEins-Methode*/
	
	public static void fischEins(){ 														//Beginn von public static void fischEins
		if(fOneZ==0){ 																		//Prüft ob Fisch 1 bereits im Ziel ist
		if(fOne==ende){ 																	//Prüft ob Fisch 1 im Ziel ist
			fOneZ=1;  																		//Legt fest, dass Fisch 1 im Ziel ist
			System.out.println("Fisch 1 hat das Ziel erreicht"); 							//Gibt in die Konsole aus, dass Fisch 1 das Ziel erreicht hat
		} 																					//Ende von if(fOne==ende)
		if(fOneG==0){ 																		//Prüft ob Fisch 1 gefangen wurde
			if(farbe==3){ 																	//Prüft ob der Würfel eine 3 zeigt
				 fOne=fOne+1; 																//Lässt Fisch 1 ein Feld vorwärts laufen
				 System.out.println("Fisch 1 ist auf Feld" +" "+fOne);						//Gibt an auf welchem Feld Fisch 1 ist
				} 																			//Ende von if(farbe==3)
			} 																				//Ende von if(fOneG==0)
		} 																					//Ende von if(fOneZ==0)
	} 																						//Ende von public static void fischEins	
	
	/*fischZwei-Methode*/
	
	public static void fischZwei(){ 														//Beginn von public static void fischZwei
		if(fTwoZ==0){ 																		//Prüft ob Fisch 2 bereits im Ziel ist
			if(fTwo==ende){ 																//Prüft ob Fisch 2 im Ziel ist
				fTwoZ=1; 																	//Legt fest, dass Fisch 2 im Ziel ist
				System.out.println("Fisch 2 hat das Ziel erreicht"); 						//Gibt in die Konsole aus, dass Fisch 2 das Ziel erreicht hat
			} 																				//Ende von if (fTwo==ende)
			if(fTwoG==0){ 																	//Prüft ob Fisch 2 gefangen wurde
				if(farbe==4){ 																//Prüft ob der Würfel eine 4 zeigt
					fTwo=fTwo+1; 															//Lässt Fisch 2 ein Feld vorwärts laufen
					System.out.println("Fisch 2 ist auf Feld" +" "+fTwo);					//Gibt an auf welchem Feld Fisch 2 ist					
				} 																			//Ende von if(farbe==4)
			} 																				//Ende von if(fTwoG==0)
		} 																					//Ende von if(fTwoZ==0)
	} 																						//Ende von public static void fischZwei
	
	/*fischDrei-Methode*/
	
	public static void fischDrei(){ 														//Beginn von public static void fischDrei
		if(fThreeZ==0){ 																	//Prüft ob Fisch 3 bereits im Ziel ist
			if(fThree==ende){ 																//Prüft ob Fisch 3 im Ziel ist
				fThreeZ=1; 																	//Legt fest, dass Fisch 3 im Ziel ist
				System.out.println("Fisch 3 hat das Ziel erreicht"); 						//Gibt in die Konsole aus, dass Fisch 3 das Ziel erreicht hat
			} 																				//Ende von if (fThree==ende)
			if(fThreeG==0){ 																//Prüft ob Fisch 3 gefangen wurde
				if(farbe==5){ 																//Prüft ob der Würfel eine 5 zeigt
					fThree=fThree+1; 														//Lässt Fisch 3 ein Feld vorwärts laufen
					System.out.println("Fisch 3 ist auf Feld" +" "+fThree);					//Gibt an auf welchem Feld Fisch 3 ist
				}																			//Ende von if (farbe==5)
			} 																				//Ende von if (fThreeG==0)
		} 																					//Ende von if (fThreeZ==0)
	}		 																				//Ende von public static void fischDrei
	
	/*fischVier-Methode*/
	
	public static void fischVier(){ 														//Beginn von public static void fischVier
		if(fFourZ==0){ 																		//Prüft ob Fisch 4 bereits im Ziel ist
			if(fFour==ende){ 																//Prüft ob Fisch 4 im Ziel ist
				fFourZ=1; 																	//Legt fest, dass Fisch 4 im Ziel ist
				System.out.println("Fisch 4 hat das Ziel erreicht"); 						//Gibt in die Konsole aus, dass Fisch 4 das Ziel erreicht hat
			} 																				//Ende von if (fFour==ende)
			if(fFourG==0){ 																	//Prüft ob Fisch 4 gefangen wurde
				if(farbe==6){ 																//Prüft ob der Würfel eine 6 zeigt
					fFour=fFour+1; 															//Lässt Fisch 4 ein Feld vorwärts laufen
					System.out.println("Fisch 4 ist auf Feld"+" "+fFour); 					//Gibt an auf welchem Feld Fisch 4 ist
				} 																			//Ende von if (farbe==6)
			} 																				//Ende von if (fFourG==0)
		} 																					//Ende von if (fFourZ==0)		
	}																						//Ende von public static void fischVier
	
	/*fG-Methode*/
	
	public static void fG(){ 																//Beginn von public static void fG
		try{																				//Beginn von try
			File datei=new File("StatistikFG.txt"); 										//Erstellt Datei Statistik.txt
			FileWriter schreib=new FileWriter(datei, true); 								//Schreiber für die Datei
			schreib.write("Fische"); 														//Schreibt Fische in die Datei
			schreib.write(System.getProperty("line.separator")); 							//Setzt eine Zeile Abstand
			schreib.flush();																//Schreibt alle gepufferten Daten in den Stream
			schreib.close(); 																//Schließt den Schreibvorgang ab
		}catch(IOException e){ 																//Fehlerausgabe
			e.printStackTrace(); 															//Verfolgt auftretende Fehler zum Ursprung zurück
		} 																					//Ende von try			
	} 																						//Ende von public static void fG
	
	/*frG-Methode*/
	
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
	
	/*unentschieden-Methode*/
	
	public static void unentschieden(){ 													//Beginn von public static void unentschieden
		try{																				//Beginn von try
			File datei=new File("StatistikU.txt"); 											//Erstellt Datei Statistik.txt
			FileWriter schreib=new FileWriter(datei, true); 								//Schreiber für die Datei
			schreib.write("Unentschieden"); 												//Schreibt Unentschieden in die Datei
			schreib.write(System.getProperty("line.separator")); 							//Setzt eine Zeile Abstand
			schreib.flush(); 																//Schreibt alle gepufferten Daten in den Stream
			schreib.close(); 																//Schließt den Schreibvorgang ab
		}catch(IOException e){																//Fehlerausgabe
			e.printStackTrace(); 															//Verfolgt auftretende Fehler zum Ursprung zurück
		} 																					//Ende von try
	} 																						//Ende von public static void unentschieden	

	/*dateien-Methode*/
	
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
	
} 																							//Ende von public class SchnelleFische