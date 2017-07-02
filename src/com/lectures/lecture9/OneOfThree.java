package com.lectures.lecture9;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.text.ParseException;

/**
 * Created by nimf8 on 02.07.2017.
 */
public class OneOfThree {
    public static void main(String[] args) {
        try{
                oneOfThree();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e){
               e.fillInStackTrace();
        }
        catch (IllegalAccessException e){
                e.getMessage();
        }

    }
    private static void oneOfThree() throws IllegalAccessException, IOException, ClassNotFoundException{
        int x = (int) (Math.random()*15);
        if( x < 4){
            throw new IllegalAccessException("dff");
        }
        else if (x < 8){
            throw new IOException();
        }
        else{
            throw new ClassNotFoundException();
        }
    }

}
