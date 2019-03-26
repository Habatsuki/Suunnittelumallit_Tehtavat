package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        System.out.println("");
        
        AterioivaOtus talonmies = new TalonMies();
        talonmies.aterioi();
        
        System.out.println("");
        
        AterioivaOtus terveystarkastaja = new TerveysTarkastaja();
        terveystarkastaja.aterioi();
        
    }
}
