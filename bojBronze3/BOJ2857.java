package bojBronze3;

import java.util.Scanner;

public class BOJ2857 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name[] = new String[5];
        boolean check = false;

        for(int i = 0; i < name.length; i ++){
            name[i] = s.next();
        }

        for(int i = 0; i< name.length; i ++){
            if(name[i].contains("FBI")){
                System.out.print(i+1 + " ");
                check = true;
            }
        }

        if(!check){
            System.out.println("HE GOT AWAY!");
        }
    }
}
