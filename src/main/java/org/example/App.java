package org.example;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String text = StringUtils.reverse("Hello, World!");
        System.out.println(text);
        MathClassGradle mathClassGradle = new MathClassGradle();
        System.out.println(mathClassGradle.sum(2,2));
    }
}
