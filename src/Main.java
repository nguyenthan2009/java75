import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = "16/08/2016";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
        NhanVien nhanVien = new NhanVien(localDate,"Nam");
        NhanVien nhanVien2 = new NhanVien(localDate,"Nữ");
        NhanVien nhanVien3 = new NhanVien(localDate,"Nữ");
        NhanVien nhanVien4 = new NhanVien(localDate,"Nam");
        Queue<NhanVien> Nu = new LinkedList<>();
        Queue<NhanVien> Nam = new LinkedList<>();
        NhanVien[] nhanViens= {nhanVien,nhanVien2,nhanVien3,nhanVien4};
        NhanVien[] newNhanVien= new NhanVien[4];
                for(int i =0;i< nhanViens.length;i++){
                    if(nhanViens[i].getGioitinh().equals("Nữ")){
                        Nu.add(nhanViens[i]);
                    }else if((nhanViens[i].getGioitinh()).equals("Nam")){
                        Nam.add(nhanViens[i]);
                    }
                }
                int sizeNU = Nu.size();
                for(int i=0;i<=Nu.size();i++){
                    newNhanVien[i]= Nu.remove();
                }

               for(int i= sizeNU;i<=Nam.size()+ sizeNU;i++){
                    newNhanVien[i]= Nam.remove();
                }
                for(int i=0;i<newNhanVien.length;i++){
                    System.out.println(newNhanVien[i]);
                }
    }


    }

