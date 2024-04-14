public class Matematica {
    public static double pi(int n){
       double soma = 0;
       double pi = 0;
       for(int i = 0; i < n; i++){
           if(i % 2 == 0){
               soma = soma + 1.0/(2*i + 1);
           }else{
               soma = soma - 1.0/(2*i + 1);
           }
       }
       pi = 4 * soma;
       return pi;
    }
}
