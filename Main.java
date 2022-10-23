import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> usersName = new ArrayList<>(Arrays.asList("佐藤", "鈴木", "田中"));
        List<String> usersBirthplace = new ArrayList<>(Arrays.asList("東京", "青森", "大阪"));
        List<String> usersBirthDay = new ArrayList<>(Arrays.asList("11月24日", "12月18日", "10月10日"));

        //入力用のスキャナーと入力結果取得用の変数
        Scanner sc = new Scanner(System.in);
        String result;

        //ユーザーのリストが入っているMapが格納されているユーザー用インスタンスを生成
        User userLists = new User(usersName, usersBirthplace, usersBirthDay);

        //標準入力からユーザー名を取得
        System.out.println("ユーザー名を入力");
        result = sc.nextLine();

        //Mapにある名前ならMapの内容を表示
        //存在しない名前が入力されたら例外処理でthrowされたメッセージを出力する
        try {
            System.out.println((userLists.findUser(result)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
