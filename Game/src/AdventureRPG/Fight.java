package AdventureRPG;

import java.util.Random;
import java.util.Scanner;

public class Fight extends Character{
	private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    
    
    // 전투 메소드
    public static void startBattle() {
        System.out.println("던전 입장!");
        
         
        
    }

    // 플레이어 선택지 메소드
    protected static int getPlayerChoice() {
        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.println("행동을 선택하세요:");
            System.out.println("1. 공격");
            System.out.println("2. 스킬 사용");
            System.out.println("3. 도망가기");
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (java.util.InputMismatchException e) {
                System.out.println("올바른 숫자를 입력하세요.");
                scanner.nextLine(); 
            }
            
            if (choice < 1 || choice > 3) {
                System.out.println("올바른 선택지가 아닙니다. 1, 2, 3 중 하나를 선택하세요.");
            }
        }
        return choice;
    }
    
//    protected static int Start() {
//        System.out.println("모험을 시작하시겠습니까??");
//        System.out.println("1. 모험");
//        System.out.println("2. 게임 끝내기");
//        int choice = 0;
//		try {
//            choice = scanner.nextInt();
//        } catch (java.util.InputMismatchException e) {
//            System.out.println("올바른 숫자를 입력하세요.");
//            scanner.nextLine(); 
//        }
//        
//        if (choice < 1 || choice > 2) {
//            System.out.println("올바른 선택지가 아닙니다. 1, 2 중 하나를 선택하세요.");
//        }
//
//        return choice;
//    }
    
    
}


