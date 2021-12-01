public class Word {
    private String eng;
    private String kor;
    private int level;
    private String date;

    public Word(String eng, String kor, int level, String date) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(eng).append(", ").append(kor).append(", ").append(level).append(", ").append(date);

        return sb.toString();
    }
}
