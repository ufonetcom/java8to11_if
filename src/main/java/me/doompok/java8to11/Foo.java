package me.doompok.java8to11;

public class Foo {

    public static void main(String[] args) {
        int baseNumber = 10;
        //함수형 인터페이스는 해당 함수 밖에있는 값을 변경하려 하면 안된다.
        //오로지 함수 내부의 있는 값, 함수가 받은 파라미터만 가지고 써야한다.
        RunSomething runSomething = new RunSomething() {
            @Override
            public int doIt(int number) {
                return number + baseNumber;
            }
        };

    }
}
