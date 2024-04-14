public class A {
    int x,y;
    public A() {
        x*=x;
        y*=y;
    }
    {
        //se movermos o bloco de inicializacao para uma das outras subclasses, o valor ira variar
        //dependendo da operacao do construtor da classe atual
        x+=10; //esses valores vao ser atualizados conforme for passando para as subclases
        y+=10;
    }
    public void exibe() {
        System.out.printf("x=%d y=%d",x,y);
    }
}
