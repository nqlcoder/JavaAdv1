package Sample_ThiSinh;

public abstract class ThiSinh {
    public String SoBoDanh;
    public String Hoten;
    public String DiaChi;
    public MucUuTien MucUuTien;
    public Khoi Khoi;
    public double TongDiem(){
        return 0;
    };

    public ThiSinh(String SBD, String HoTen,  MucUuTien mucUuTien){
        this.SoBoDanh = SBD;
        this.Hoten = HoTen;
        this.MucUuTien = mucUuTien;
    }

    public String GetKhoiThi(){
        if(this instanceof ThiSinhKhoiA) return "A";
        else if(this instanceof ThiSinhKhoiA) return "B";
        else if(this instanceof ThiSinhKhoiA) return "C";
        else return "";
    }

//    public void GetInfo(){
//        System.out.println("SBD SV: " + this.SoBoDanh);
//        System.out.println("Ten SV: " + this.Hoten);
//        System.out.println("Noi sinh: " + this.DiaChi);
//        System.out.println("Diem: " + (DiemMon1 + DiemMon2 + DiemMon3 + MucUuTien));
//        System.out.println("Khoi: " + this.Khoi);
//    }

}
