package entities;

public class MachineModel {
    public String sn, tradeMark;
    public int trainingMusicale, name, power;

    public MachineModel(String sn, int name, int trainingMusicale, String tradeMark, int power) {
        this.sn = sn;
        this.name = name;
        this.trainingMusicale = trainingMusicale;
        this.tradeMark = tradeMark;
        this.power = power;        
    }
}
