package factorymethod;

public class TalonMies extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Mehu();
    };

}
