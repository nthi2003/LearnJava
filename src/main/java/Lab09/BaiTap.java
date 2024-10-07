package Lab09;

import java.util.Scanner;

public class BaiTap {
    public static int nhapMaSv(){
        System.out.println("Nhap Ma Sv");
        int MaSv ;
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                MaSv = input.nextInt();
                System.out.println("run");
                break;
            } catch (Exception e) {
                System.out.println("ma Sv k hop le nhap chuoi string");
                input.next();
            }
        }

        return MaSv;
    }
    public static void main(String[] args) {
        System.out.println(2);

        try(Scanner input = new Scanner(System.in)) {

            int maSv = nhapMaSv();
            System.out.println(maSv);

        } catch (Exception e) {

        }
    }
}
