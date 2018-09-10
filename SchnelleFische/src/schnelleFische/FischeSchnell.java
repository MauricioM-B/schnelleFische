package schnelleFische;

import java.util.Random;

public class FischeSchnell {													//Beginn von public class FischeSchnell

	public static int farbe; 													//gewürfelte Zahl
	public static int sB=0; 													//Start der Fischer
	public static int lEins=5; 													//Spielfeldlänge vom Start der Fischer bis zum Start der Fische
	public static int sF=lEins+sB+1; 											//Start der Fische
	public static int lZwei=5; 													//Spielfeldlänge vom Start der Fische bis zum Ende
	public static int end=sF+lZwei+1;											//Ende des Spielfeldes
	public static int fB=0;														//Boot
	public static int f1=sF;													//Fisch 1
	public static int f2=sF;													//Fisch 2
	public static int f3=sF;													//Fisch 3
	public static int f4=sF;													//Fisch 4
	public static int fG1=1;													//Fisch 1 gefangen?
	public static int fG2=1;													//Fisch 2 gefangen?
	public static int fG3=1;													//Fisch 3 gefangen?
	public static int fG4=1;													//Fisch 4 gefangen?
	
	public static void main(String[] args){										//Beginn von public static void main
		for(int i=0; i<50; i++) {												//Beginn der for-Schleife
			wuerfeln();															//Führt public static void wuerfeln aus
			boot();																//Führt public static void boot aus
			fisch();															//Führt public static void fisch aus
			if(fG1==2 && fG2==2 && fG3==2 && fG4==2){							//Prüft ob Fisch 1 & Fisch 2 & Fisch 3 & Fisch 4 gefangen wurden
				System.out.println("Die Fischer haben gewonnen!");				//Gibt aus, dass die Fischer gewonnen haben
				break;															//Stoppt die for-Schleife												
			}																	//Ende if(fG1==2 && fG2==2 && fG3==2 && fG4==2)
			if(sB==end){														//Prüft ob das Boot das Ziel erreicht hat
				System.out.println("Das Boot ist im Ziel!");					//Gibt aus, dass das Boot das Ziel erreicht hat
				break;															//Stoppt die for-Schleife		
			} 																	//Ende von if(sB==end)
		}																		//Ende der for-Schleife
	}																			//Ende von public static void main
	
	public static void wuerfeln() {												//Beginn von public static void wuerfeln
		Random wuerfel	= new Random();											//Erstellt den Würfel
		farbe= 1 + wuerfel.nextInt(6);											//Zahlenspektrum des Würfels ist von 1 bis 6
		System.out.println("Würfel zeigt"+" "+farbe);							//Gibt aus welche Zahl gewürfelt wurde
	} 																			//end of public void wuerfel
	
	public static void boot(){													//Beginn von public static void boot
		if(farbe==1||farbe==2||fG1==2||fG2==2||fG3==2||fG4==2){					//Prüft ob eine 1 oder 2 bzw eine 3, 4, 5 oder 6 gewürfelt wurde
			sB=sB+1;															//Lässt das Boot ein Feld vorlaufen
			System.out.println("Das Boot ist auf Feld "+sB+".");				//Gibt aus auf welchem Feld sich das Boot befindet
		}																		//Ende von if(farbe==1||farbe==2||fG1==2||fG2==2||fG3==2||fG4==2)
		if(sB==f1){																//Prüft ob das Boot und Fisch 1 auf dem selben Feld sind
			sB=sB+1;															//Lässt das Boot ein Feld vor laufen
			if(fG1==1){															//Prüft ob Fisch 1 gefangen wurde
				System.out.println("Fisch 1 wurde gefangen!");					//Gibt aus, dass Fisch 1 gefangen wurde
				fG1=2;															//Setzt fG1 auf 2
			} 																	//Ende von if(fG1==1)
		}																		//Ende von if(sb==f1)
		if(sB==f2){																//Prüft ob das Boot und Fisch 2 auf dem selben Feld sind
			sB=sB+1;															//Lässt das Boot ein Feld vor laufen
			if(fG2==1){															//Prüft ob Fisch 2 gefangen wurde
				System.out.println("Fisch 2 wurde gefangen!");					//Gibt aus, dass Fisch 2 gefangen wurde
				fG2=2;															//Setzt fG2 auf 2
		}																		//Ende von if(fG2==1)
		if(sB==f3){																//Prüft ob das Boot und Fisch 3 auf dem selben Feld sind
			sB=sB+1;															//Lässt das Boot ein Feld vor laufen
			if(fG3==1){															//Prüft ob Fisch 3 gefangen wurde
				System.out.println("Fisch 3 wurde gefangen!");					//Gibt aus, dass Fisch 3 gefangen wurde
				fG3=2;															//Setzt fG3 auf 2
		}																		//Ende von if(fG3==1)
		if(sB==f4){																//Prüft ob das Boot und Fisch 4 auf dem selben Feld sind
			sB=sB+1;															//Lässt das Boot ein Feld vor laufen
			if(fG4==1){															//Prüft ob Fisch 4 gefangen wurde
				System.out.println("Fisch 4 wurde gefangen!");					//Gibt aus, dass Fisch 4 gefangen wurde
				fG4=2;															//Setzt fG4 auf 2
					} 															//Ende von if(fG4==1)
				}																//Ende von if(sB==f4)
			}																	//Ende von if(sB==f3)
		}																		//Ende von if(sB==f2)
	}																			//Ende von public static void boot
	
	public static void fisch() {												//Beginn von public static void fisch
		if(farbe==3){															//Prüft ob eine 3 gewürfelt wurde
			if (fG1==1) {														//Prüft ob Fisch 1 gefangen wurde
				f1=f1+1;														//Lässt Fisch 1 ein Feld vor laufen	
				System.out.println("Fisch 1 ist auf Feld "+f1);					//Gibt aus auf welchem Feld sich Fisch 1 befindet
			}																	//Ende von if(fG1==1)
		}																		//Ende von if(farbe==3)
		if(farbe==4){															//Prüft ob eine 4 gewürfelt wurde
			if(fG2==1) {														//Prüft ob Fisch 2 gefangen wurde
				f2=f2+1;														//Lässt Fisch 2 ein Feld vor laufen	
				System.out.println("Fisch 2 ist auf Feld "+f2);					//Gibt aus auf welchem Feld sich Fisch 2 befindet
			}																	//Ende von if(fG2==1)
		}																		//Ende von if(farbe==4)
		if(farbe==5){															//Prüft ob eine 5 gewürfelt wurde
			if(fG3==1){															//Prüft ob Fisch 3 gefangen wurde
				f3=f3+1;														//Lässt Fisch 3 ein Feld vor laufen	
				System.out.println("Fisch 3 ist auf Feld "+f3);					//Gibt aus auf welchem Feld sich Fisch 3 befindet
			}																	//Ende von if(fG3==1)
		}																		//Ende von if(farbe==5)
		if(farbe==6){															//Prüft ob eine 6 gewürfelt wurde
			if(fG4==1){															//Prüft ob Fisch 4 gefangen wurde
				f4=f4+1;														//Lässt Fisch 4 ein Feld vor laufen	
				System.out.println("Fisch 4 ist auf Feld "+f4);					//Gibt aus auf welchem Feld sich Fisch 4 befindet
			}																	//Ende von if(fG4==1)
		}																		//Ende von if(farbe==6)
	} 																			//Ende von public static void fisch
	
}																				//Ende von public class FischeSchnell