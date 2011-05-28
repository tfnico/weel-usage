package com.tfnico.examples.weel;

import com.github.rjeschke.weel.Weel;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest
{

    public void doWeel()
    {
        Weel weel = new Weel();

        // Compile also takes InputStreams and compileResource accepts a 'resource name',
        // e.g. if you have a script inside you code in 'my.scripts' called 'Scripts.weel'
        // you can simply use: weel.compileResource("my.scripts.Scripts");
        weel.compile("println('Hello world!')");

        weel.runStatic();
    }
}
