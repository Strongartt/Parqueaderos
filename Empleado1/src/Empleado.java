public class Empleado {
    private String nombre;
    private String cedula;
    private int horasT;
    private double valorH;
    private double montoV;

    public Empleado(String nombre, String cedula, int horasT, double valorH) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horasT = horasT;
        this.valorH = valorH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        if (horasT<0) {
            horasT=0;
        }
        this.horasT = horasT;
    }

    public double getValorH() {
        return valorH;
    }

    public void setValorH(double valorH) {
        if (valorH<0) {
            valorH=0;
        }
        this.valorH = valorH;
    }

    public double getMontoV() {
        return montoV;
    }

    public void setMontoV(double montoV) {
        if (montoV<0) {
            montoV=0;
        }
        this.montoV = montoV;
    }
    public double salarioBruto(){
        int horasE;
        int horasN;
        double salN;
        double salE;
        horasE=horasT-40;
        if (horasE<0) {
            horasE=0;
        }
        horasN=horasT-horasE;
        if (horasE<=10 && horasE>0) {
            salE = (horasE * valorH) * 1.1;
        }
        else if (horasE>10 && horasE<=15) {
            salE=(horasE*valorH)*1.15;
        }
        else  {
            salE=(horasE*valorH)*1.2;
        }

        salN=horasN*valorH;


        return salN+salE;
    }
    public double bonificacion(){
        double calcuB;
        if (montoV<=800 ){
            calcuB=montoV*0.2;
        }
        else if (montoV>800 && montoV <= 1500) {
            calcuB=montoV*0.4;

        }
        else if (montoV>1500 && montoV <= 3000) {
            calcuB=montoV*0.6;

        }
        else  {
            calcuB=montoV*0.8;
        }


        return calcuB;
    }
    public double salarioN(){
        return (salarioBruto()-salarioBruto()*0.0945)+bonificacion();
    }


}
//2% de las ventas, mayores a 800 hasta 1500 el 4%, mayores de 1500
//hasta 3000 el 6% y mayores de 3000 el 8%
