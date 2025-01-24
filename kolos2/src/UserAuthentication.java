public class UserAuthentication implements Authentication {
    public boolean login(String username, String password) {
        System.out.println("username: " + username + " password: " + password);
        return true;
    }
    public void logout() {
        System.out.println("Logged out");
    }
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(oldPassword.equals(newPassword)) {
            return false;
        }
        return true;
    }
}
