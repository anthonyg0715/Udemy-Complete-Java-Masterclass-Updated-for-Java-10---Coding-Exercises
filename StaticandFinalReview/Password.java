package com.anthony._static;

public class Password {

    private static final int key=12345;
    private final int encryptedPassword;

    public Password(int encryptedPassword){
        this.encryptedPassword = encryptDecrypt(encryptedPassword);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return false;
        }else{
            System.out.println("Wrong Password");
            return false;
        }
    }
}
