package variableparameter;

public class testOne {  
    public void methodA(String str,Integer... is){  
    }  

    public void methodA(String str,String... strs){
    }  

    public static void main(String[] args) {  
    	testOne client = new testOne();  
        String[] strs = null;  
        client.methodA("China",strs);
    }  
}