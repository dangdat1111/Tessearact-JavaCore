interface HanhDong{
    abstract void diChuyen();
    int TOC_DO_TOI_DA = 100;
}

class Oto implements HanhDong{
    @Override
    public void diChuyen(){
        System.out.println(" O to runnnnn");
    }
}

class MayBay implements HanhDong {
    @Override
    public void diChuyen() {
        System.out.println("Máy bay đang cất cánh lên bầu trời.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Oto oto = new Oto();
        oto.diChuyen();

        MayBay mayBay = new MayBay();
        mayBay.diChuyen();
    }
}
