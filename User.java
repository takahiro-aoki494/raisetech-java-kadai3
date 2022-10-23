import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class User {
    private final Map<String, String> userListMap = new HashMap<>();

    //コンストラクタ
    public User(List<String> name, List<String> birthplace, List<String> birthday) {
        //引き渡されたListの大きさを取得
        int cnt = name.size();

        //引数を使いMapにユーザーの情報を格納する
        for (int i = 0; i < cnt; i++) {
            this.userListMap.put(name.get(i), "出身地は" + birthplace.get(i) + "。誕生日は" + birthday.get(i) + "です。");
        }
    }

    //引数のユーザーでMapを検索し存在しないユーザーなら例外を発生
    //存在するユーザーならユーザー名を返す
    public String findUser(String userName) throws Exception {
        String user = userListMap.get(userName);

        if (Objects.equals(user, null)) {
            throw new Exception("存在しないユーザーです");
        }
        return user;
    }
}
