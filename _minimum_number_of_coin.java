package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class _minimum_number_of_coin {
    public static  int minimumCoin( int currency [ ] , int v ){


        int count = 0 ;
        for( int i = currency.length -2 ; i>=0;i--){
            while(v>=currency[i] ){

                v=v-currency[i] ;
                count ++ ;
            }
            if(v==0){
                return  count;
            }
        }
        return count ;
    }
    public static void main(String[] args) {

        int currency[]={1,2,10,20,50,100,500,1000};
        int v = 93;
        System.out.println(minimumCoin(currency , v ));

    }
}
