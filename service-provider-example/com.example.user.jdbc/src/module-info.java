import com.example.user.db.UserRepository;
import com.example.user.cassandra.jdbc.JdbcUserRepository;

module com.example.user.jdbc {
    requires transitive com.example.user;

    provides UserRepository with JdbcUserRepository;
}