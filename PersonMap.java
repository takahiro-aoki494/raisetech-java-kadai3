import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> userData = new HashMap<>();
        userData.put("佐藤", "出身地は東京。誕生日は11月24日です。");
        userData.put("鈴木", "出身地は青森。誕生日は12月18日です。");
        userData.put("田中", "出身地は大阪。誕生日は10月10日です。");

        //入力用のスキャナーと入力結果取得用の変数
        Scanner sc = new Scanner(System.in);
        String result;

        //ユーザーのリストが入っているMapが格納されているユーザーチェック用インスタンスを生成
        findUserData userLists = new findUserData(userData);

        //標準入力からユーザー名を取得
        System.out.println("ユーザー名を入力");
        result = sc.nextLine();

        //Mapにある名前ならMapの内容を表示
        //存在しない名前が入力されたら例外処理でthrowされたメッセージを出力する
        try {
            System.out.println((userLists.checkUser(result)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
