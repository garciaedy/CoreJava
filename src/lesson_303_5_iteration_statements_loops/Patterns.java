package lesson_303_5_iteration_statements_loops;

public class Patterns {
    public static void main(String[] args){
        int i, j;
        int n =10;

        for(i=0; i<n; i++){
            for(j=0; j<n;j++){
                if(i ==j || i +j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
