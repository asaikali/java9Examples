import com.example.user.db.UserRepository;


module com.example.user.jdbc {
    requires transitive com.example.user;

    provides UserRepository with com.example.user.jdbc.JdbcUserRepository;
}