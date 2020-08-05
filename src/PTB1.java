public class PTB1 {
    double A, B ,x;
    String cauTraLoi;

    public void nhap2So(double a, double b) {
        A = a;
        B = b;
    }

    public void timNghiem() {
        if (A==0 && B==0){
           cauTraLoi="Bai Toan Co Vo So Nghiem.";
        }
        else {
            if (A==0 && B!=0){
                cauTraLoi=("Phương Trinh vo Nghiem.");
            }
            else
                x= -B/A;
            cauTraLoi=("Phuong Trinh Co Nghiem Duy Nhat:"+x);
        }
    }
    public void inKetQua(){
        System.out.println(cauTraLoi);
    }
}
