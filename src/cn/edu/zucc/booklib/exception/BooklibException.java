/*
 *
 * Copyright 2001 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */

package cn.edu.zucc.booklib.exception;

/**
 * This application exception indicates that a book has not been found.
 */

public class BooklibException extends Exception {

    public BooklibException() {
    }

    public BooklibException(String msg) {
        super(msg);
    }
}
