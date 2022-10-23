public class User {
    private String name;
    private String birthday;
    private String birthPlace;


    //コンストラクタ
    public User(String name, String birthday, String birthPlace) {
        this.name = name;
        this.birthday = birthday;
        this.birthPlace = birthPlace;
    }


    //ゲッター
    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthPlace() {
        return birthPlace;
    }
}

