import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ユーザーのデータから各Userのインスタンスを生成
        User satou = new User("佐藤", "11月24日", "東京");
        User suzuki = new User("鈴木", "12月18日", "青森");
        User tanaka = new User("田中", "10月10日", "大阪");

        //各ユーザーのインスタンスを使いMapを生成
        Map<String, String> userMap = new HashMap<>();
        userMap.put(satou.getName(), "出身地は" + satou.getBirthPlace() + "。誕生日は" + satou.getBirthday());
        userMap.put(suzuki.getName(), "出身地は" + suzuki.getBirthPlace() + "。誕生日は" + suzuki.getBirthday());
        userMap.put(tanaka.getName(), "出身地は" + tanaka.getBirthPlace() + "。誕生日は" + tanaka.getBirthday());

        //ユーザーのリストが入っているMapが格納されているユーザーチェック用インスタンスを生成
        FindUser userLists = new FindUser(userMap);

        //入力用のスキャナーと入力結果取得用の変数
        Scanner sc = new Scanner(System.in);
        String result;

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
