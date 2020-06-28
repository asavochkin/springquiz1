package ru.lanit.springquiz.q7;

public class BeanThree {
    private BeanFour beanFour;

    public void print(String text){
        beanFour.print(text);
    }

    public void setBeanFour(BeanFour beanFour) {
        this.beanFour = beanFour;
    }
}
