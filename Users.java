package Library;

class Users 
{
    private String userName;
    private int userID;
    private String userDept;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    

    public Users(String userName, int userID, String userDept)
    {
        this.userName = userName;
        this.userID =  userID;
        this.userDept = userDept;
    }

}