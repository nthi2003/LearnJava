package Lab07;

public class SinhVienIT extends SinhVien {
    public double getDiemjava() {
        return diemjava;
    }

    public void setDiemjava(double diemjava) {
        this.diemjava = diemjava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    private double diemjava;



    private double diemHTML;

    public SinhVienIT(double diemjava, double diemHTML) {
        this.diemjava = diemjava;
        this.diemHTML = diemHTML;
    }



    @Override
    double getDiem() {
        return (this.diemjava * 2 + this.diemHTML) / 3;
    }
}
