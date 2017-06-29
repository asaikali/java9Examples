module com.example.user.cassandra {
    requires transitive com.example.user;

    provides com.example.user.db.UserRepository with com.example.user.cassandra.CassandraUserRepository;
}