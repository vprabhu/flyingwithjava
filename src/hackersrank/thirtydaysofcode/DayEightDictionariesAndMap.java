package hackersrank.thirtydaysofcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by root on 5/16/17.
 */
public class DayEightDictionariesAndMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String , Integer> mEntries = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            mEntries.put(name.toLowerCase() , phone);
        }

        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(mEntries.get(s) == null){
                System.out.println("Not found");
            }else {
                System.out.println(s +"="+mEntries.get(s));
            }
        }
        in.close();
    }
}
