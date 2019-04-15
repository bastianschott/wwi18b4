package funktProgrammierung.test;

public class Test {
    private static void test(){
        boolean b = true;
        int i = 0;

        if(b){
            i = 1;
        } else{
            i = 2;
        }


        i = b ? 1 : 2;
    }

    public static void main(String[] args){
        System.out.println("lol");
    }
}