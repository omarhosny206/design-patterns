package behavioral.chainofresponsibility;

public class HttpRequest {
    private final String host;
    private final String path;
    private final String userEmail;
    private final String userPassword;
    private final String userRole;

    public HttpRequest(String host, String path, String userEmail, String userPassword, String userRole) {
        this.host = host;
        this.path = path;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserRole() {
        return userRole;
    }
}
