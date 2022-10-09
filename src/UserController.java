
// Poltergeist class, with no real value to the code
// as it invokes methods from other classess

public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    User createUser(User user){
        return service.create(user);
    }
    int findAllUsers(){
        return service.findAll().size();
    }
}
