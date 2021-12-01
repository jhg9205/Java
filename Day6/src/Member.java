public class Member {
    private String userid;
    private String pw;
    private String name;
    private String mail;
    private String gender;
    // 필드

    public Member() {
        System.out.println("Member객체가 만들어졌어요.");
    }

    public Member(String userid, String pw) {
        this(userid, pw, "무명", "모름", "모름");
    }

    public Member(String userid, String pw, String name, String mail, String gender) {
        this.userid = userid;
        this.pw = pw;
        this.name = name;
        this.mail = mail;
        this.gender = gender;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void info() {
        System.out.println("아이디 : " + userid);
        System.out.println("비밀번호 : " + pw);
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + mail);
        System.out.println("성별 : " + gender);
    }
}

