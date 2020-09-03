package estruturadecontrole;

public class DesafioAnoBissexto {
    public static void main(String[] args) {
        int ano = 2004;

        if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println("Ano bissexto");
        } else if( (ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0) ){
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano nao é bissexto");
        }


    }
}
