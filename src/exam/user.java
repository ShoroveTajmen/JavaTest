package exam;

public class user {
    private String userid;
    private String passwd;

    public user(String id,String pass){
        this.userid = id;
        this.passwd = pass;
    }

    public String getUserid(){
        return userid;
    }

    public String getPasswd(){
        return passwd;
    }

    public void dispalyuser(){
        System.out.println("Userid:" +this.getUserid());
        System.out.println("Password:" +this.getPasswd());
    }
}
