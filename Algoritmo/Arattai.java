public class Arattai {
    public static void main(String[] args) {
        
        int downloadsDiarios [] = {850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000};
        String diasDaSemana [] = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};

        int soma = 0;

        System.out.println("=== Análise de Crescimento do Arattai (7 dias) ===");

        for (int i = 0; i < downloadsDiarios.length; i++) {
            soma += downloadsDiarios[i];
        }

        System.out.println("Total de Downloads na Semana: " + soma);

        int maior = 0, menor = downloadsDiarios[0];
        String pico = "", baixa = "";

        for (int i = 0; i < downloadsDiarios.length; i++) {
            if(downloadsDiarios[i] > maior){
            maior = downloadsDiarios[i];
            pico = diasDaSemana[i];
        }    
        if (downloadsDiarios[i] < menor) {
            menor = downloadsDiarios[i];
            baixa = diasDaSemana[i];
        }    
    }        
        System.out.println("Dia de Pico de Downloads: " + pico + " com " +  maior + " dowloads");
        System.out.println("Dia de mínimo de Downloads: " + baixa + " com " +  menor + " dowloads");

        int meta = 1000000, dias = 0;

        for (int i = 0; i < diasDaSemana.length; i++) {

        if (downloadsDiarios[i] > meta) {
            dias++;
            System.out.println(diasDaSemana[i] + " SUCESSO! " + "(" + downloadsDiarios[i] + " dowloads)");
            
        }else{
   
            System.out.println(diasDaSemana[i] + " NÃO ATINGIDO! " + "(" + downloadsDiarios[i] + " dowloads)");

        }
        
        }

        System.out.println("[Relatório Final] O Arattai superou a meta diária em " + dias + " dias esta semana.");

        }
    
    }

    

