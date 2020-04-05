public class Main {
    public static void main(String[] args) {
        int ticketprice = 50000; //цена одного билета
        int bonusmiles = 20;//цена одной мили
        int milesamount = ticketprice / bonusmiles;//кол-во бонусных миль за билет
        System.out.println(milesamount);
    }
}