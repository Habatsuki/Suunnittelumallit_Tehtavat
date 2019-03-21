package factorymethod;

public class TerveysTarkastaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Punaviini();
    };

}
