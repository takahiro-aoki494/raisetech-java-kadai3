import java.text.SimpleDateFormat;
import java.util.Calendar;

public class User {
    private final String name;
    private final Calendar birthday;
    private final String birthPlace;


    //コンストラクタ
    public User(String name, Calendar birthday, String birthPlace) {
        this.name = name;
        this.birthday = birthday;
        this.birthPlace = birthPlace;
    }

    //ユーザーを引き渡されたユーザー名から検索
    //存在するユーザーなら情報を返し、存在しないユーザーなら例外処理
    public String findUser(String userName) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        if (userName.equals(this.name)) {
            return "名前:" + this.name + " 生年月日:" + sdf.format(this.birthday.getTime()) + " 出身地:" + this.birthPlace;
        } else {
            throw new Exception("ユーザーが見つかりません");
        }
    }
}
