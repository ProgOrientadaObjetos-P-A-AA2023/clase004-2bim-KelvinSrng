package paquete03;


class TransporteTransvia {
    private String cooperativaTransvia;
    public double tarifa;
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 2.00 + 0.10;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativaTransvia
;    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
