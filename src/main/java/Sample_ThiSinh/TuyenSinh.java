package Sample_ThiSinh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    private static List<ThiSinh> lstStore = new ArrayList<>();

    public void Add(ThiSinh thiSinh) throws Exception {
        //check sbd existed
        List<ThiSinh> listSBD = lstStore.stream().filter((s) -> s.SoBoDanh.equalsIgnoreCase(thiSinh.SoBoDanh)).collect((Collectors.toList()));

        //if sbd chua co
        if(listSBD.size() == 0){
            lstStore.add(thiSinh);
        } else {
            throw new Exception("SBD da ton tai");
        }
    }

    public List<ThiSinh> Filters(String khoi){
//        if(khoi.equalsIgnoreCase("A")){
//            return lstStore.stream().filter((s) -> s instanceof ThiSinhKhoiA).collect(Collectors.toList());
//        }
//        else if(khoi.equalsIgnoreCase("B")){
//            return lstStore.stream().filter((s) -> s instanceof ThiSinhKhoiB).collect(Collectors.toList());
//        }
//        else if(khoi.equalsIgnoreCase("C")){
//            return lstStore.stream().filter((s) -> s instanceof ThiSinhKhoiC).collect(Collectors.toList());
//        }
//        else return null;
//        else return null;
        return this.lstStore.stream().filter((s) -> s.GetKhoiThi().equalsIgnoreCase(khoi)).
                sorted(Comparator.comparingDouble(s -> s.TongDiem())).collect(Collectors.toList()).reversed();
    }

    public ThiSinh FindThiSinhBySBD(String sbd){
        List<ThiSinh> lstResult = this.lstStore.stream().filter((s) -> s.SoBoDanh.equalsIgnoreCase(sbd)).collect(Collectors.toList());
        if(lstResult.size() > 0){
            return lstResult.get(0);
        }

        return null;
    }
}
