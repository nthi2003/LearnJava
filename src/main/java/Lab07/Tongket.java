package Lab07;

public class Tongket {
    public static void main(String[] args) {
        SinhVien sv = new SinhVienIT(9, 10);
        SinhVien sv1 = new SinhVienCoKhi(9 , 10);

        System.out.println(sv.getDiem());
        System.out.println(sv1.getDiem());

    }
}
