package Sample_ThiSinh;public class Test {
    public static void main(String[] args) throws Exception {
        TuyenSinh tuyenSinh = new TuyenSinh();

        ThiSinhKhoiA thiSinhKhoiA = new ThiSinhKhoiA("A01", "Linh", MucUuTien.Muc_2);
        thiSinhKhoiA.Toan = 7;
        thiSinhKhoiA.Ly = 8;
        thiSinhKhoiA.Hoa = 9;

        tuyenSinh.Add(thiSinhKhoiA);
    }
}
