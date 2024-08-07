package Sample_ThiSinh;

public enum MucUuTien {
    Muc_1(0.5),
    Muc_2(1),
    Muc_3(1.5);

    private double Type;

    MucUuTien(double type){
        this.Type = type;
    }

    public double GetAdditionPoint(){
        return this.Type;
    }
}
