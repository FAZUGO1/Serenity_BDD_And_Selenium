package serenityswag.authentication;

public enum Users {

    STANDARD_USER("standard_user","secret_sauce","a standar user");
   // LOCKED_OUT_USER("locked_out_user","secret_sauce","a standar user");
    //PROBLEM_USER("problem_user","secret_sauce","a standar user");
    // PERFORMANCE_GLITCH_USER("performance_glitch_user","secret_sauce","a performance_glitch_user");
    // ERROR_USER("error_user","secret_sauce","a error_user");
    // VISUAL_USER("visual_user","secret_sauce","a visual_user");

    private final String username;
    private final String password;
    private final String description;

    Users(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return description;
    }
}
