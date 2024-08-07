package Sample_ThiSinh;

public class ThiSinhKhoiB extends ThiSinh {
    public double Toan;
    public double Hoa;
    public double Sinh;

    public ThiSinhKhoiB(String SBD, String HoTen, Sample_ThiSinh.MucUuTien mucUuTien) {
        super(SBD, HoTen, mucUuTien);
    }

    @Override
    public double TongDiem(){
        return Toan + Sinh + Hoa + this.MucUuTien.GetAdditionPoint();
    }
}
