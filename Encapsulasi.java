class itung {
    private double alas;
    private double tinggi;
    private double luas;
    public itung() {
        double alas = 0;
        double tinggi = 0;
    }
        private double luas( double a, double t){
            return a * t / 2;

        }
        public void setAlas ( double alas){
            this.alas = alas;
        }
        public void setTinggi ( double tinggi){
            this.tinggi = tinggi;
        }
        public double getAlas() {
            return alas;
        }
        public double getTinggi() {
            return tinggi;
        }
        public double getLuas() {
            return luas(alas, tinggi);
        }
    }
    public class Encapsulasi{
        public static void main(String[] args){
                itung pp=new itung();
                pp.setAlas(50);
                pp.setTinggi(40);
                System.out.println("Luas Segitiga");
                System.out.println("Alas : "+ pp.getAlas());
                System.out.println("Tinggi : "+ pp.getTinggi());
                System.out.println("Luas : "+ pp.getLuas());
    }

}