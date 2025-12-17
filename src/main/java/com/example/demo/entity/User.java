class User {
    @Id
    private Long id;
    private String name;
    @column(name=unique)
    private String email;
    private String password;
}