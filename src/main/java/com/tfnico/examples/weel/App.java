package com.tfnico.examples.weel;

import com.github.rjeschke.weel.Weel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Weel weel = new Weel();

        // Compile also takes InputStreams and compileResource accepts a 'resource name',
        // e.g. if you have a script inside you code in 'my.scripts' called 'Scripts.weel'
        // you can simply use: weel.compileResource("my.scripts.Scripts");
        weel.compileResource("examples.example");

        weel.runStatic();
    }
}
