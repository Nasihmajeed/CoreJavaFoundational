package com.lxisoft.factors;
//  import java.util.*;
// import com.lxisoft.*;

//FIXME important! class names should start with a capital letter. Also give meaningful names to the exceptions.
// Please override methods from the Exception class
public class customException extends Exception {

    String errorMessage;

    public customException(String str) {

        this.errorMessage = str;
}
public String toString() {

    return ("custome exception occured :" + errorMessage);
}


}

