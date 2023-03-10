package hackerRank;

import java.util.List;

class Ejercicio01 {

	public static void plusMinus(List<Integer> arr) {
		int size = arr.size();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        
        for(int i=0; i < size; i++){
            if(i > 0){
                positive++;
            }else if(i < 0){
                negative++;
            }
            
            System.out.print(positive/size);
            System.out.print(negative/size);
            System.out.print(zero/size);
            
        }
	}

}
