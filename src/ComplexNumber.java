public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        System.out.println("İKİ ARGÜMANLI CONSTRUCTOR ÇAĞRILDI");
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
        System.out.println("TOPLAMA");
    }

    public void add(ComplexNumber complexNumber){
        this.real = this.real + complexNumber.real;
        this.imaginary = this.imaginary + complexNumber.imaginary;
        System.out.println("NESNE TOPLAMA");
    }
    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
        System.out.println("ÇIKARMA");
    }

    public void subtract(ComplexNumber complexNumber){
        this.real = this.real - complexNumber.real;
        this.imaginary = this.imaginary - complexNumber.imaginary;
        System.out.println("NESNE ÇIKARMA");
    }
}