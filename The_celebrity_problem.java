package leetcode;

public class The_celebrity_problem {
    public  static  int findCelebrity( int [ ] [ ] people , int n ){
       int top = 0;
       int bottom = n-1 ;
       while( top < bottom ){
           if( people[top][bottom]==1){
               top++;
           }
           else{
               bottom -- ;
           }
       }
       for( int i = 0;i< n ; i++){
           if( top==i) continue ;
           if(people[top][i]!=0 || people[i][top]!=1){
             return -1 ;

           }
       }
       return  top ;
        }

    public static void main(String[] args) {
        int people[][] = {{0, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        int n = 3;
        System.out.println(findCelebrity(  people , n ));
    }
}