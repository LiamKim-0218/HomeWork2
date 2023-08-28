package AdventureRPG;

import java.util.Random;
import java.util.Scanner;

public class Fight {
	private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    // 전투 메소드
    public static void startBattle(Character player, Character enemy) {
        System.out.println("전투 시작!");
        
        while (player.currentHealth > 0 && enemy.currentHealth > 0) {
            int playerChoice = getPlayerChoice();
            
            if (playerChoice == 1) {
                player.attack(enemy);
                System.out.println(player.name + "이(가) " + enemy.name + "을(를) 공격했습니다!");
            } else if (playerChoice == 2) {
                // 특수 스킬 구현 가능
                System.out.println("특수 스킬을 사용했습니다!");
            } else if (playerChoice == 3) {
                System.out.println(player.name + "은(는) 도망쳤습니다!");
                break; // 전투 루프를 종료합니다.
            }
            
            int enemyChoice = random.nextInt(2) + 1; // 적은 랜덤하게 공격 또는 스킬 사용
            if (enemyChoice == 1) {
                enemy.attack(player);
                System.out.println(enemy.name + "이(가) " + player.name + "을(를) 공격했습니다!");
            } else {
                // 적의 특수 스킬 구현 가능
                System.out.println(enemy.name + "이(가) 특수 스킬을 사용했습니다!");
            }
        }

        if (player.currentHealth <= 0) {
            System.out.println(player.name + "은(는) 패배했습니다!");
        } else {
            System.out.println(player.name + "이(가) " + enemy.name + "을(를) 이겼습니다!");
            int experienceGained = random.nextInt(50) + 50; // 경험치를 랜덤하게 부여
            player.gainExperience(experienceGained);
            System.out.println(player.name + "이(가) " + experienceGained + "의 경험치를 획득했습니다!");
        }
    }

    // 플레이어 선택지 메소드
    static int getPlayerChoice() {
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
    
    protected static int Start() {
        System.out.println("모험을 시작하시겠습니까??");
        System.out.println("1. 모험");
        System.out.println("2. 게임 끝내기");
        int choice = 0;
		try {
            choice = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("올바른 숫자를 입력하세요.");
            scanner.nextLine(); 
        }
        
        if (choice < 1 || choice > 2) {
            System.out.println("올바른 선택지가 아닙니다. 1, 2 중 하나를 선택하세요.");
        }

        return choice;
    }
    
    
}


