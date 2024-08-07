package Inherit;

public class ForeinStudent extends Student {
    public String QuocTich;

    @Override
    public void Print(){
        super.Print();

        System.out.println("QuocTich: " + QuocTich);
    }
}
