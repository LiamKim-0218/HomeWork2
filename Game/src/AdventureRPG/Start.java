package AdventureRPG;

import java.util.Random;
import java.util.Scanner;

public class Start {
	private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    Fight fight = new Fight();
    
    protected int Start() {
        System.out.println("던전에 입장하시겠습니까??");
        System.out.println("1. 입장");
        System.out.println("2. 게임종료");
        
        int choice = 0;
        choice = scanner.nextInt();
        switch(choice) {
        case 1:
        	fight.startBattle();
        	break;
        	
        
        }
		return choice;
        
        
        
        
        
////		try {
////            choice = scanner.nextInt();
////        } catch (java.util.InputMismatchException e) {
////            System.out.println("올바른 숫자를 입력하세요.");
////            scanner.nextInt();
////        }
//        while(true) {
//        choice = scanner.nextInt();
//        if (choice < 1 || choice > 2) {
//            System.out.println("올바른 선택지가 아닙니다. 1, 2 중 하나를 선택하세요.");
////            continue;
//        } break;
//
////        return choice;
//        }
//		return choice;
    }
    
}


