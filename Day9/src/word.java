public class word {
    private String eng;     // 영단어
    private String kor;     // 뜻
    private int level;      // 레벨
    private String date;   // 등록일자

    public word(String eng, String kor, int level, String date) {
        this.eng = eng;
        this.kor = kor;
        this.level = level;
        this.date = date;
    }

    public String getEng() {return eng;}
    public void setEng(String eng) {this.eng = eng;}

    public String getKor() {return kor;}
    public void setKor(String kor) {this.kor = kor;}

    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    @Override
    public String toString() {
        // apple : 사과(레벨 1, 날짜 2021-11-17)
        return eng + " : " + kor + "( 레벨" + level + ", 날짜'" + date + ')';
    }
}
