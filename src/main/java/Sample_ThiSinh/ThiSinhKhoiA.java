package Sample_ThiSinh;

public class ThiSinhKhoiA extends ThiSinh {
    public double Toan;
    public double Ly;
    public double Hoa;

    public ThiSinhKhoiA(String SBD, String HoTen, Sample_ThiSinh.MucUuTien mucUuTien) {
        super(SBD, HoTen, mucUuTien);
    }

    @Override
    public double TongDiem(){
        return Toan + Ly + Hoa + this.MucUuTien.GetAdditionPoint();
    }
}
