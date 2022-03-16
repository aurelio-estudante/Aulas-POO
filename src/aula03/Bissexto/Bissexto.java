package aula03.Bissexto;

public class Bissexto{
    public static void main(String[] args) {
        System.out.println(isBissexto(2005));
        for(int i=2000; i<=2022; i++){
            if(isBissexto(i)){
                System.out.println("O ano "+ i + " é bissexto");
            }else{
                System.out.println("O ano "+ i + " não é bissexto");
            }
        }
    }

    private static boolean isBissexto(int i){
        boolean estado = false;
        if(i%400 == 0){
            estado = true;
            return estado;
        }else if(i%4 == 0){
            if(i%100!=0){
                estado = true;
                return estado;
            }
        }
        return estado;
    }
}