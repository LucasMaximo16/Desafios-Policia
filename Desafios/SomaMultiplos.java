public class SomaMultiplos {


    public static void main(String[] args) {
         int x = 3;
         int y = 5;
         int somaTotal3 = 0;
         int somaTotal5 = 0 ;
         int resultado = 0 ;

        for(int i = 1; i <=1000 ; i++){
            if(i % x == 0 ){
                somaTotal3 += i;
            }
        }

        for(int j = 1; j <=1000 ; j++){
            if(j % y == 0 ){
                somaTotal5 += j;
            }
        }

        resultado = somaTotal3 + somaTotal5;

        System.out.println("A SOMA DOS MULTIPLOS DE 3 E 5 SÃO : " + resultado);
    }
}
