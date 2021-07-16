import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class NhanVien {
    private LocalDate Ngaysinh;
    private String Gioitinh;
    public NhanVien(LocalDate Ngaysinh, String Gioitinh){
        this.Ngaysinh=Ngaysinh;
        this.Gioitinh= Gioitinh;
    }

    public LocalDate getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "Ngaysinh=" + Ngaysinh +
                ", Gioitinh='" + Gioitinh + '\'' +
                '}';
    }
}
