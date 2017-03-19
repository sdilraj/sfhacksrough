package debugexample;

public class DebugExample {

    public static void main(String[] args) {

        methodA();
    }
    
    public static void methodA(){
        
        for( int i = 1 ; i <= 10 ; i++){
            methodB(i);
            System.out.println(" **");
        }        
    }
    
    public static int methodB(int x){
        System.out.printf("%3d", x);
        if(x > 9){
            return 0;
        } else {
            methodB(x+1);
        }
        return 0;
    }
}