import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    /*
     * 1.총 인원과 번호표 받기
     * 2.총 인원 탐색하면서 1번 찾기 
     * 3.1번 찾기 전까지 스택에 쌓기 
     * 4.그다음 2번 찾는다 스택에있는지 줄에 있는지 모른다->총인원은 최대치는 1000이기때문엔 완전탐색 가능하지않을까
     * 
     */
	public static void main(String args []) {
        
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int people [] = new int[total];
        for(int i=0;i < total; i++){
            people[i] = sc.nextInt();
        }

        sc.close();        
    }
	
    public static void solve(int people []){
        Stack <Integer> waiting = new Stack<Integer>();
        int order = 1;

        
    }
		
	
}
