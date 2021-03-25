package me.doompok.java8to11;

//이 어노테이션은 함수형 인터페이스의 정의로서 함수형이 2개이상 일때 오류를 잡아준다.
@FunctionalInterface
public interface RunSomething {
    void doIt(); //하나만 있을때가 함수형 인터페이스

    static void printName() {  //public 생략 가능
        System.out.println("doompok");
    }


}
