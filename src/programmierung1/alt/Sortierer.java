package programmierung1.alt;

public class Sortierer{
	//private int zahlen[];
	
	public static void sortieres(int zahl[]){

		int cache = 0;
		for(int i=0; i < zahl.length-1;i++){
			for (int j = 0; j < zahl.length-1;j++){
				if(zahl[j] > zahl[j+1]){
					cache = zahl[j+1];
					zahl[j+1] = zahl[j];
					zahl[j] = cache;
				}
				
			}
			
		}
	}
}
