package Lab07;

class People{
    void work(){
        System.out.println("chung toi se di lam");
    }
}
class QuocThi extends People{
    void work(){
        System.out.println("Toi lam dev");
    }
}

class Linh extends People {

}

public class Polymorphism {
    public static void main(String[] args) {
          People a = new Linh();
          People b = new QuocThi();
          b.work();
          a.work();
    }
}
