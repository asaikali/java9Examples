import com.example.user.db.UserRepository;

module com.example.user {
    exports com.example.user;
    exports com.example.user.db to com.example.user.jdbc, com.example.user.cassandra;
    uses UserRepository;
}