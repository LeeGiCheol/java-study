package oop;

public class SignUpUser {

    public static void main(String[] args) {
        User signUpPerson = new User();
        signUpPerson.setName("LEE GI CHEOL");
        signUpPerson.setAge(26);
        
        signUpPerson.save("LEEGICHEOL", signUpPerson);

        signUpPerson.setName("EKKKK1");
        signUpPerson.setAge(20);
        
        signUpPerson.save("EKKKK1", signUpPerson);
        
        signUpPerson.printUser();
    }

}