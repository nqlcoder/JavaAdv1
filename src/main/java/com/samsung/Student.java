package com.samsung;

public class Student {
    public String Name;
    public String Place;
    public String DOB;
    public Boolean isPass;
    public String ChuyenNganh;
    public String QuocTich;

    public Student() {}
    //phuong thuc
    public void GetInfo(){
        System.out.println("Ten SV: " + this.Name);
        System.out.println("Noi sinh: " + this.Place);
        System.out.println("DOB: " + this.DOB);
        System.out.println("Trang thai: " + (this.isPass? "Trung tuyen" : "Khong trung tuyen"));
    }
}
