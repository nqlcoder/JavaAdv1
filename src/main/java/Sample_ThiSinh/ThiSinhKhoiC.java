package Sample_ThiSinh;

public class ThiSinhKhoiC extends ThiSinh {
    public double Van;
    public double Su;
    public double Dia;

    public ThiSinhKhoiC(String SBD, String HoTen, Sample_ThiSinh.MucUuTien mucUuTien) {
        super(SBD, HoTen, mucUuTien);
    }

    @Override
    public double TongDiem(){
        return Van + Su + Dia + this.MucUuTien.GetAdditionPoint();
    }
}
