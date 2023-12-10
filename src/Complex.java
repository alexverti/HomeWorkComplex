public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static boolean equals(Complex c1, Complex c2) {
        double rc1 = Math.sqrt(Math.pow(c1.re, 2) + Math.pow(c1.re, 2));
        double rc2 = Math.sqrt(Math.pow(c2.re, 2) + Math.pow(c2.re, 2));
        return rc1 == rc2;
    }

    public static Complex sum(Complex c1, Complex c2) {
        return new Complex(c1.re + c2.re, c1.im + c2.im);
    }

    public static Complex sub(Complex c1, Complex c2) {
        return new Complex(c1.re - c2.re, c1.im - c2.im);
    }

    public static Complex mult(Complex c1, Complex c2) {
        return new Complex(c1.re * c2.re - c1.im * c2.im, c1.re * c2.im + c1.im * c2.re);
    }

    public String toString() {
        return im >= 0 ? re + "+" + im + "i" : re + "" + im + "i";
    }

}
