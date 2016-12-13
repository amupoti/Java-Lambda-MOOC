/**
 * Copyright © 2016, Oracle and/or its affiliates. All rights reserved.
 * <p>
 * JDK 8 MOOC Lesson 1 homework
 */
package lesson1;

import java.util.*;

/**
 * @author Speakjava (Simon Ritter)
 */
public class Lesson1 {
    /**
     * Run the exercises to ensure we got the right answers
     */
    public void runExercises() {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
    }

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */
    /**
     * Exercise 1
     * <p>
     * Create a string that consists of the first letter of each word in the list
     * of Strings provided.
     */
    public String exercise1() {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    /* YOUR CODE HERE */
      StringBuilder sb = new StringBuilder();
      list.forEach(s -> sb.append(s.charAt(0)));
      return sb.toString();

    }

    /**
     * Exercise 2
     * <p>
     * Remove the words that have odd lengths from the list.
     */
    public List<String> exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

      list.removeIf(s -> (s.length() % 2 == 1));
      return list;

    }

    /**
     * Exercise 3
     * <p>
     * Replace every word in the list with its upper case equivalent.
     */
    public List<String> exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
      list.replaceAll(String::toUpperCase);
      return list;
    }

    /**
     * Exercise 4
     * <p>
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    public String exercise4() {
      Map<String, Integer> map = new TreeMap<>();
      map.put("c", 3);
      map.put("b", 2);
      map.put("a", 1);

      StringBuilder sb = new StringBuilder();
      map.forEach((k, v) -> sb.append(k + v));
      return sb.toString();
    }

    /**
     * Exercise 5
     * <p>
     * Create a new thread that prints the numbers from the list.
     */
    public void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      Runnable r = () -> list.forEach(System.out::print);
      r.run();

    }

    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
    }
}