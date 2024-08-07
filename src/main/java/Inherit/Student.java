package Inherit;

//su dung abstract de tao ra class chi danh cho ke thua
//su dung final de ngan chan ke thua
public class Student {
    public String Hoten;
    public String NoiSinh;
    public Major ChuyenNganh;

    public void Print(){
        System.out.println("Ten SV: " + this.Hoten);
        System.out.println("Noi sinh: " + this.NoiSinh);
        System.out.println("Chuyen nganh: " + this.ChuyenNganh);
    }
}
