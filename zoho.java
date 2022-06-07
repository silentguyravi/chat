package kiot;
import java.util.*;
public class zoho {	
		public static void main(String[] args) {
			List<Integer> arr = new ArrayList<>(Arrays.asList(-4 ,3 ,-9, 0, 4, 1));
		    int noMi = 0;
		    int noPl = 0;
		    int noze = 0;
		        for(int i= 0; i<arr.size();i++){
		               if(arr.get(i)==0){
		                   noze++;
		               }
		               if(arr.get(i)>0){
		                   noPl++;
		               }
		               if(arr.get(i)<0){
		                   noMi++;
		               }
		        }
		        System.out.println(noPl);
		       double zero = (double)noze / arr.size();
		       double plus =(double) noPl / arr.size();
		       double minus =(double) noMi / arr.size();
		        System.out.println(plus);
		        System.out.println(minus);
		        System.out.println(zero);
		    }
}