package e06;

public class App {
    public static void main(final String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        boolean and = isJavaFun && isFishTasty;
        boolean or = isJavaFun || isFishTasty;
        boolean javaNotFun = ! isJavaFun;
        boolean fishNotTasty = ! isFishTasty;
        System.out.println("Java Fun and Fish Tasty: " + and);
        System.out.println("Java Fun or Fish Tasty: " + or);
        System.out.println("Java Not Fun: "+ javaNotFun);
        System.out.println("Fish Not Tasty: " + fishNotTasty);



    }  
}
