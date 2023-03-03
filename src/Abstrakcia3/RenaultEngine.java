package Abstrakcia3;

public class RenaultEngine extends Engine {
    double extraTurboEnergy;

    public RenaultEngine() {
        super();
        double extraTurboEnergy = 0;
    }
    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy){
        super(engineVolume,cylinderAmount,engineWeight);
        this.extraTurboEnergy=extraTurboEnergy;
    }
    double efficiency(){
        return 0.27;
    }
    double throttleEnergy(){
        return getEngineVolume()*getCylinderAmount()*110+extraTurboEnergy;
    }
    double breakEnergy(){
        return engineWeight*2.1;
    }
    public double getMaxSpeed() {
        return super.getMaxSpeed();
    }
    public double getExtraTurboEnergy(){
        return extraTurboEnergy;
    }
    public void setExtraTurboEnergy(double extraTurboEnergy){
        this.extraTurboEnergy=extraTurboEnergy;
    }
}
