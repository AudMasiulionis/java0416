package lesson8.examples;

import java.util.Objects;

public class A {

    int x;
    int y;

    public void test(){
        System.out.println("A");
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof A == false){
            return false;
        }

        A other = (A)o;
        return this.x == other.x;
    }


}
