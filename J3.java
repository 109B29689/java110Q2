interface IArea{
    void area();
}
class Circle implements IArea{
    private double r;
    public Circle(double r){
        this.r=r;
    }
    public void area(){
        System.out.println("圓形面積:"+3.1416*r*r);
    }
}
class  Rectangle implements IArea{
    private double width;
    private double heigh;
    public Rectangle(){

    }
    public void area(){

    }
}

public class J3 {
    public static void main(String[] args) {
        
    }
}
