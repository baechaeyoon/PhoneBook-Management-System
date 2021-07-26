package package07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class OP07 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        HashMap<String, game> phoneBook = new HashMap<String, game>();
        Scanner scan = new Scanner(System.in);
        int C = 0;
 
        String N = "";
        String A = "";
        String Pn = "";
        
 
        game K;
 
        System.out.println("---------------------------------------------");
        System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
        System.out.println("---------------------------------------------");
 
        while (true) {
            System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4 >> ");
            C = scan.nextInt();
 
            switch (C) {
            case 0:
                System.out.print("이름 >> ");
                N = scan.next();
 
                System.out.print("주소 >> ");
                A = scan.next();
 
                System.out.print("전화번호 >> ");
                Pn = scan.next();
 
                K = new game(N, A, Pn);
                phoneBook.put(N, K);
                break;
 
            case 1:
                System.out.print("이름 >> ");
                N = scan.next();
 
                K = searchName(phoneBook, N);
 
                if (K != null) {
                    phoneBook.remove(N);
                } else {
                    System.out.println(N + "은 등록되지 않은 사람입니다.");
                }
 
                break;
 
            case 2:
                System.out.print("이름 >> ");
                N = scan.next();
 
                K = searchName(phoneBook, N);
 
                if (K != null) {
                    System.out.println(K);
                } else {
                    System.out.println(N + "은 등록되지 않은 사람입니다.");
                }
 
                break;
 
            case 3:
                Set<String> keys = phoneBook.keySet();
                Iterator<String> it = keys.iterator();
 
                while (it.hasNext()) {
                    String key = it.next();
                    game value = phoneBook.get(key);
                    System.out.println(value);
                }
                break;
 
            case 4:
                System.out.println("프로그램을 종료합니다...");
                System.exit(0);
 
            default:
                System.out.println("잘못 입력 하셨습니다.");
            }
        }
 
    }
 
    public static game searchName(HashMap<String, game> map, String N) {
        game K = null;
 
        K = map.get(N);
 
        return K;
    }
}
