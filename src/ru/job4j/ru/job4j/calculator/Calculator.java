package ru.job4j.calculator;

class ArgMethod {

        public static void hello(String name) {
            System.out.println("Hello, " + name);
        }
        public static void hello(int age) {
            System.out.println("Petr Arsentev, " + age);
        }
        public static void main(String[] args) {
            String name = "Petr Arsentev ";
            int age = 33;
            ArgMethod.hello(name + age);
        }

    }
