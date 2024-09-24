package com.udamy.singleton;

class Singleton {
    /**
     * static + 중첩클래스(홀더) : 정적 초기화로 실제로 SingletonInstence를 사용하기 전까지 미룸으로서 사용시 생성됨으로 쓰레드 세이프됨.
     * final : 다시 값이 할당되지 않도록 해준다.(read only) / 대문자로 변수 선언
     * 장점 : 디스크 I/O 바운드를 줄일 수 있다. net, db connection에 사용된다.
     * 단점 : 하나의 인스턴스에 대한 의존성이 높아지기 때문에 TDD적 관점에서 볼 때 좋지 못하다. 단위 테스트의 경우 테스트가 독립적으로 되어야 하는데 이 부분에서 맞지 않다.
     */
    private static class SingletonInstence{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstence.INSTANCE;
    }
}
public class SingletonClass{
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a == b)
            System.out.println(true);
    }
}
