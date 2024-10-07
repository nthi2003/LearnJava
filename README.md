Biến :

```jsx
int a = 6;
int b = 9;
int c = a + b;
```

a, b, c gọi là "biến số nguyên”

Quy tắc khai báo
<type> <variable_name> = <initial_value>
<kiểu_dữ_liệu> <tên_biến> = <giá_trị_khởi_tạo>

Quy tắc đặt tên biến

Type : 

String là kiểu dữ liệu tham chiếu nhưng được coi sử dụng như kiểu dữ liệu nguyên thủy nó là obj 

kiểu dữ liệu nguyên thủy 

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/816a5bad-a248-43c0-89ba-53b1b39478f8/d361ef70-6a78-4f78-b561-efa3a071b2ba/image.png)

Auto boxing và unboxing

"Boxing": convert từ primitive value (giá trị nguyên thủy) => chuyển thành object

"unboxing": là quá trình ngược lại, từ object => giá trị nguyên thủy

ArrayList

2 kiểu

1 là k chèn

```jsx
ArrayList b = new ArrayList();
```

2 là chèn (khai báo cụ thể )

```jsx
ArrayList<String> b = new ArrayList<String>(); //Generic 
```

Các method hay dùng
add : thêm phần tử vào cuối
remove: xóa
clear: xóa tất cả
get: truy xuất phần tử tại vị trí

Generic 

Giúp chúng ta "báo lỗi “ khi “ dịch code” (gồm compile then run)
Giúp tái sử dụng code

Java Diamond 

Viết ngắn gọn hơn Generic 

 

```jsx
ArrayList<String> b = new ArrayList(); //Generic 
```

String

là 1 class cũng là 1 obj  nó là là kiểu dũ liệu kế thừa

\t : ký tự tab
\r : Về đầu dòng
\n : xuống dòng

\\ : \

\" : “

method thường gặp

String là Obj 

length() láy dộ dài của chuỗi

trim() bỏ đi dấu space đầu/ cuối của chuỗi

toLowerCase() viết thường tất cả ký tự

toUpperCase() viết hoa tất cả ký tự

substring() cắt chuỗi thành chuỗi con

equals dùng để so sánh kiểu dữ liệu obj

`startsWith`

Regular Expression

Java Inheritance

có thể kể thừa (inherit)   thuộc tính và phương thức (attribute & method) từ 1 class  khác

kế thừa có phân cấp 

subclass(child) : đứa con , sẽ kế thừa/thừa hưởng lại “thành quả” của class khác

superclass (parent)  : cha ,mẹ sẽ cho đi “tài sản” để class kế thừa lại

1 Nguyên tắc kế thừa 

1 class chỉ có thể kế thừa “duy nhất “ 1 class khác(đơn kê thừa)

(nếu muốn kế thừa nhiều , sử dụng interface)

để kế thừa sử dụng extends

Subclass extends SuperClass { ... }

`protected` dùng cho kế thừa thường dùng cho thằng cha

`super` :  dành cho trường hợp muốn gọi từ cha cho thằng con

this : là phạm vị của đối tượng 

phân biêt overloading 

Abtract class

Polymorphism 

Tính đa hình 

```jsx
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

```

```jsx
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

```

```jsx
package Lab07;

public class Tongket {
    public static void main(String[] args) {
        SinhVien sv = new SinhVienIT(9, 10);
        SinhVien sv1 = new SinhVienCoKhi(9 , 10);

        System.out.println(sv.getDiem());
        System.out.println(sv1.getDiem());

    }
}

```

Interface

là 1 cách khách để thực hiện tính kế thừa  trong java bên cạch abstract class

Không có khai niệm hàm tạo

 Interface không có body => body được ghi đè lại tại các class "implements”

Mặc định, tất cả method của interface là "abstract" + "public"

=> thay vì viết: abstract public void animalSound( );
chuyển thành:
void animalSound( )

1 class có thể kế thừa cùng lúc nhiều interface (abstract class là kế thừa 1:1)

tìm hiểu đơn kế thừa đa kế thừa của java dùng interface

interface hava8 có gì mới

so sánh interface với Abstract class

Abtract  class dùng đa phần về các class có quan hệ với nhau kiểu như là sinhvien : sinhvienKT , SinhvienIt, ….

interface thì muốn kế thừa ai cũng đc đc tức có thể kế thừa môn kinh tế vĩ mô cho sinhvienIT vậy (đa kế thừa)
