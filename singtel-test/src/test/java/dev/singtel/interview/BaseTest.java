package dev.singtel.interview;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTest {

     protected ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
     protected boolean autoFlush = false;
     protected PrintStream out = new PrintStream(byteOut, autoFlush);
}
