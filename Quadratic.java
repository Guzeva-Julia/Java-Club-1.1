public class Quadratic {
       public static void main(String[] args) {
        int a=3;
        int b=7;
        int c=4;
        System.out.println(a+"x^2+"+b+"x"+c+"=0");
        double discriminant;
        discriminant=Math.pow(b,2)-4*a*c;
        System.out.println("D = "+discriminant);
        double x1=(-b+Math.sqrt(discriminant))/2*a;
        double x2=(-b-Math.sqrt(discriminant))/2*a;
        double x=-b/(2*a);
        if (discriminant >0){
            System.out.println("Корні рівняння: x1= "+x1+"; x2 = "+x2+".");
        }
        else if (discriminant==0){
            System.out.println("Рівняння має один корінь: x = "+x+".");
        }
        else {
            System.out.println("Рівняння не має коренів.");
        }
    }
}