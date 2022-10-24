import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //各ユーザーの誕生日を設定するためのカレンダー
        Calendar birthdaySato = Calendar.getInstance();
        birthdaySato.set(1991, Calendar.NOVEMBER, 24);

        Calendar birthdaySuzuki = Calendar.getInstance();
        birthdaySuzuki.set(1991, Calendar.DECEMBER, 18);

        Calendar birthdayTanaka = Calendar.getInstance();
        birthdayTanaka.set(1991, Calendar.OCTOBER, 13);

        //ユーザーのデータから各Userのインスタンスを生成
        User satou = new User("佐藤", birthdaySato, "東京都");
        User suzuki = new User("鈴木", birthdaySuzuki, "青森県");
        User tanaka = new User("田中", birthdayTanaka, "大阪府");

        //各ユーザーのインスタンスを使いMapを生成
        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(0, satou);
        userMap.put(1, suzuki);
        userMap.put(2, tanaka);

        //for文で使用するためにMapの大きさを取得するカウンタ
        int cnt = userMap.size();

        //入力用のスキャナーと入力結果取得用の変数
        Scanner sc = new Scanner(System.in);
        String result;

        //標準入力からユーザー名を取得
        System.out.println("ユーザー名を入力");
        result = sc.nextLine();

        //Userインスタンスにある名前ならインスタンスで生成したユーザーのデータを表示
        //Userインスタンスに存在しない名前が入力されたら例外処理でthrowされたメッセージを出力する
        for (int i = 0; i < cnt; i++) {
            try {
                System.out.println((userMap.get(i).findUser(result)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
