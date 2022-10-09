import java.util.List;

public class UserService {
    private List users;
    private User user;

    public User create(User user){
        User new_user= new User();
        new_user.setId(1);
        new_user.setEmail("somemail");
        users.add(new_user);

        return new_user;
    }
    public List findAll(){
        return users;
    }
    public UserService(List users, User user) {
        this.users = users;
        this.user = user;
    }

}
