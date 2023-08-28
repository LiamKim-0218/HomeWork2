package AdventureRPG;

public class Character {
    String name;
    private int level;
    private int experience;
    private int maxHealth;
    int currentHealth;
    private int maxMana;
    private int currentMana;
    private int attackPower;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.maxHealth = 100;
        this.currentHealth = maxHealth;
        this.maxMana = 50;
        this.currentMana = maxMana;
        this.attackPower = 10;
    }

    // 공격 메소드
    public void attack(Character enemy) {
        int damage = this.attackPower;
        enemy.takeDamage(damage);
    }

    // 데미지 처리 메소드
    public void takeDamage(int damage) {
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
    }

    // 경험치 획득 및 레벨 업 메소드
    public void gainExperience(int experience) {
        this.experience += experience;
        if (this.experience >= 100 * this.level) {
            this.levelUp();
        }
    }

    // 레벨 업 메소드
    private void levelUp() {
        this.level++;
        this.maxHealth += 20;
        this.maxMana += 10;
        this.attackPower += 5;
        this.currentHealth = this.maxHealth;
        this.currentMana = this.maxMana;
        System.out.println(this.name + "은(는) 레벨 업 했습니다!");
    }

    // 캐릭터 정보 출력 메소드
    public void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("레벨: " + this.level);
        System.out.println("체력: " + this.currentHealth + "/" + this.maxHealth);
        System.out.println("마나: " + this.currentMana + "/" + this.maxMana);
    }
}
