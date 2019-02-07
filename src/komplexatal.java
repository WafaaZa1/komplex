public class komplexatal {
    double a;
    double b;

    public komplexatal(double a, double b){
        this.a= a;
        this.b= b;
    }

    int add(int a, inte b) {
        int a = 2;
        int b = 3;
        return a + b;
    }

    

    public komplexatal add(komplexatal z2) {
        double a = this.a + z2.a;
        double b = this.b + z2.b;
        komplexatal z3 = new komplexatal(a,b);
        return z3;
    }
}
