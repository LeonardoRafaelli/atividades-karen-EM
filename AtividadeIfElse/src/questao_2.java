import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mesString = "";


        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mês: ");
        int mes = sc.nextInt();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        System.out.print("Hora: ");
        int hora = sc.nextInt();
        System.out.print("Minuto: ");
        int minuto = sc.nextInt();

        if(mes == 1){
            mesString = "Janeiro";
        } else
        if(mes == 2){
            mesString = "Fevereiro";
        } else
        if(mes == 3){
            mesString = "Março";
        } else
        if(mes == 4){
            mesString = "Abril";
        } else
        if(mes == 5){
            mesString = "Maio";
        } else
        if(mes == 6){
            mesString = "Junho";
        } else
        if(mes == 7){
            mesString = "Julho";
        } else
        if(mes == 8){
            mesString = "Agosto";
        } else
        if(mes == 9){
            mesString = "Setembro";
        } else
        if(mes == 10){
            mesString = "Outubro";
        } else
        if(mes == 11){
            mesString = "Novembro";
        } else
        if(mes == 12){
            mesString = "Dezembro";
        }

        System.out.println(dia+"/"+mesString+"/"+ano + "   " + hora+":"+minuto);

    }
}
