import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindUser {
    private Map<String, String> map = new HashMap<>();

    //コントラクタ

    public FindUser(Map<String, String> mapData) {
        this.map = mapData;
    }

    //引数のユーザーでMapを検索し存在しないユーザーなら例外を発生
    //存在するユーザーならユーザー名を返す
    public String findUser(String userName) throws Exception {
        String user = map.get(userName);

        if (Objects.equals(user, null)) {
            throw new Exception("存在しないユーザーです");
        }
        return user;
    }
}

