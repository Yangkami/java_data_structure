package javabasis;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("123");
		list.add(213);    //索引为1
		list.add("annie");    //索引为2
		list.add("martin");   //索引为3
		list.add("marry");    //索引为4
		list.add(true);
		
		
		list.remove(3);   //.remove(index)
		list.remove("marry");     //.remove(Object o)
         
        String per="";
       // per=list.get(1);
        System.out.println(per);    ////.get(index)
         
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  //.get(index)
        }
	}

}
