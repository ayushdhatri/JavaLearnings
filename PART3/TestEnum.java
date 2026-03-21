public class TestEnum {
    public static void main(String[] args){
        // whenever we do enum.values() it returns the array of the values
        for(ENUM sample : ENUM.values()){
            System.out.println(sample.ordinal());
            System.out.println(sample.name());
        }
        ENUM enumVariable = ENUM.valueOf("MONDAY");
        System.out.println(enumVariable.name());

        for(Role role : Role.values()){
            System.out.println(role.name() + role.getRoleId() + role.getRoleDesc());
        }
    }   
}
