public enum Role {
    ADMIN(1, "FULL ACCESS"),
    USER(2, "Edit Access ONLY"),
    GUEST(3, "Read Only");

    private final int id;
    private final String roleDes;
    Role(int id, String roleDes){
        this.id = id;
        this.roleDes = roleDes;
    }
    int getRoleId(){
        return this.id;
    }
    String getRoleDesc(){
        return this.roleDes;
    }
}
