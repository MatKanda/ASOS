import java.util.List;

public class UserService_NoPoltergeist {
    private List users;
    private User user;

    public User create(User user){
        User new_user= new User();
        new_user.setId(users.size()+1);
        new_user.setEmail("somemail");
        users.add(new_user);

        return new_user;
    }
    public List findAll(){
        return users;
    }

    // Wihtout poltergeist class, we added a new method to User service class,
    // that fills the functionality void
    // left after poltergeist class
    public int getSize(){
        return users.size();
    }
    public UserService_NoPoltergeist(List users, User user) {
        this.users = users;
        this.user = user;
    }

}
