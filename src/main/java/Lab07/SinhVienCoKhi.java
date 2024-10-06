package Lab07;

public class SinhVienCoKhi extends SinhVien {
    private double diemCNC;
    private double diemPLC;

    public double getDiemCNC() {
        return diemCNC;
    }

    public void setDiemCNC(double diemCNC) {
        this.diemCNC = diemCNC;
    }

    public double getDiemPLC() {
        return diemPLC;
    }



    public  SinhVienCoKhi(double diemCNC , double diemPLC){
        this.diemCNC = diemCNC;
        this.diemPLC = diemPLC;
    }

    @Override
    double getDiem() {
        return (this.diemCNC + this.diemPLC)/2;
    }
}
