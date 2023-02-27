package app.ex1;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        if(hora > 0 || hora < 23) {
            this.hora = hora;
        }
        else
            this.hora = 0;
        
        if(minuto > 0 || minuto < 60) {
            this.minuto = minuto;
        }
        else
            this.minuto = 0;

        if(segundo > 0 || segundo < 60) {
            this.segundo = segundo;
        }
        else
            this.segundo = segundo;
    }

    public void mostarTempo24hrs() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
    
    public void mostarTempo12hrs() {
        if(hora <= 12) {
            System.out.println(hora + ":" + minuto + ":" + segundo + " AM");
        }
        else{
            System.out.println((hora - 12) + ":" + minuto + ":" + segundo + " PM");
        }
    }

    public void incrementaMinuto() {
        minuto = minuto + 1;

        if(minuto == 60) {
            hora = hora + 1;
            minuto = 0;
        }
        
        mostarTempo24hrs();
    }

    public void decrementaMinuto() {
        minuto = minuto - 1;

        if(minuto < 0) {
            hora = hora - 1;
            minuto = 59;
        }

        mostarTempo24hrs();
    }

    public void incrementaSegundo() {
        segundo = segundo + 1;

        if(segundo == 60) {
            minuto = minuto + 1;
            segundo = 0;
        }

        mostarTempo24hrs();
    }

    public void decrementaSegundo() {
        segundo = segundo - 1;

        if(segundo < 0) {
            minuto = minuto - 1;
            segundo = 59;
        }
        
        mostarTempo24hrs();
    }
}
