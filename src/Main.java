public class Main {
    public static void main(String[] args) {
        int start = 900;
        int deposit = 500;
        int bonus = deposit/100;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else if (deposit < 1000) {
            bonus = 0;
        }
        int finishBalance = start + bonus;
        System.out.println("Итоговая сумма: " + finishBalance + " рублей");
    }
}