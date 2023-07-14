public class User 
{
    String usename;
    String password;
  
    public void login(String username, String password)
    {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        System.out.println("Successfully logged in!!");

    }

    public static void main(String[] args)
    {
        EmailService emailService = new EmailService();
        User u = new User();
        u.login("Mudasser","m74yt");
        emailService.sendEmail("Mehzebin","Normal talk","Hey");
    }
}

class EmailService
{
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Email has been sent!");
         System.out.println("To: "+ to);
         System.out.println("Subject: " + subject);
         System.out.println(body);
     
     }
}