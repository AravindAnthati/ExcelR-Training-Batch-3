


public class Demo013 {
    public static double getTriangleArea(int s1, int s2,int s3){
        double s =(s1+s2+s3)/2;
        double ta = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return ta;
    }
     public static void main(String[] args) {
        int s1=6,s2=5,s3=7;
        double ta = getTriangleArea(s1,s2,s3);
        System.out.println("The triangle area is: "+ ta);
    }
}
