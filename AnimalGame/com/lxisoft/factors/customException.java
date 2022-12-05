package com.lxisoft.factors;
//  import java.util.*;
// import com.lxisoft.*;

public class customException extends Exception {

    String errorMessage;

    public customException(String str) {

        this.errorMessage = str;
}
public String toString() {

    return ("custome exception occured :" + errorMessage);
}


}

