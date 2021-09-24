package package2;

interface interface_graphics{
   float add(int a, int b);
   float divide(int a, int b);
   float multiple(int a, int b);
   float substract(int a, int b);
   float remainder(int a, int b);
}

public class arithmetic_package implements interface_graphics {
    
    public float add(int a, int b){
        return a+b;
    }
    public float divide(int a, int b){
        return a/b;
    }
    public float multiple(int a, int b){
        return a*b;
    }
    public float substract(int a, int b){
        return a-b;
    }
    public float remainder(int a, int b){
        return a%b;
    }
    
}
