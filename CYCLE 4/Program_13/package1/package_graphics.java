package package1;

interface interface_graphics{
   float recArea(int l, int h);
   float cirArea(int r);
   float squArea(int a);
   float triArea(int l, int h);
}

public class package_graphics implements interface_graphics {
    
    public float recArea(int l, int h){
        return l*h;
    }
    public float cirArea(int r){
        return r*r*(float)3.14;
    }
    public float squArea(int a){
        return a*a;
    }
    public float triArea(int l, int h){
        return l*h*(float)(.5);
    }
    
}
