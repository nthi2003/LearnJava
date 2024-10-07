package Lab09;

public class SinhVien {
    private  String mvsv;
    private  String hoten;
    private  double diem;
    private  int age;

    public SinhVien(String mvsv, String hoten, double diem, int age) {
        this.mvsv = mvsv;
        this.hoten = hoten;
        this.diem = diem;
        this.age = age;
    }

    public String getMvsv() {
        return mvsv;
    }

    public void setMvsv(String mvsv) {
        this.mvsv = mvsv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mvsv='" + mvsv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }
}
