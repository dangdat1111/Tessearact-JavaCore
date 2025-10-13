interface HanhDong{
    //Một interface chỉ chứa các phương thức trừu tượng
    // (phương thức không có phần thân, tức là không có logic thực thi)
    // và các hằng số (biến public static final).
    void diChuyen();
    int TOC_DO_TOI_DA = 100;
}

interface DoXang{
    void doXang();
}

class Oto implements HanhDong, DoXang{
    @Override
    public void diChuyen(){
        System.out.println(" O to runnnnn");
    }

    @Override
    public void doXang(){
        System.out.println("o to do xang");
    }
}

class MayBay implements HanhDong, DoXang {
    @Override
    public void diChuyen() {
        System.out.println("Máy bay đang cất cánh lên bầu trời.");
    }

    @Override
    public void doXang(){
        System.out.println("may bay do xang");
    }
}

/*
class - class ===> Extends
class - interface ===> Implements
interface - interface ===> Extends
 */

public class Interfaces {
    public static void main(String[] args) {
        Oto oto = new Oto();
        oto.diChuyen();
        oto.doXang();
        System.out.println(Oto.TOC_DO_TOI_DA);

        MayBay mayBay = new MayBay();
        mayBay.diChuyen();
        mayBay.doXang();
    }
}
