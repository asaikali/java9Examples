import com.example.user.UserService;

module com.example.app {
    requires com.example.user.cassandra;
    requires com.example.user.jdbc;

    uses UserService;
}