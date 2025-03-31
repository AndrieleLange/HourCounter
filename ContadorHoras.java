import java.util.ArrayList;
import java.util.List;

public class ContadorHoras {
    public static void main(String[] args) {
        List<Integer> horas = new ArrayList<>();
        List<Integer> minutos = new ArrayList<>();

        for (String arg : args) {
            if (arg.endsWith("h")) {
                horas.add(Integer.parseInt(arg.substring(0, arg.length()-1)));
            } else{
                minutos.add(Integer.parseInt(arg.substring(0, arg.length()-3)));
            }
        }

        conta(horas, minutos);
    }

    private static void conta(List<Integer> horas, List<Integer> minutos){
        Integer minuto = 0;
        Integer hora = 0;
        for (Integer integer : minutos) {
            minuto += integer;
        }

        if(minuto > 60){
            hora = (int) minuto/60;
            minuto = minuto - (hora *60);
        }

        if(minuto < 0){
            int aux = minuto/60;
            hora = (int) aux;
            minuto = minuto - (aux*60);
        }

        for (Integer integer : horas) {
            hora += integer;
        }

        System.out.println(hora + "h " + minuto + "min ");
    }

}
