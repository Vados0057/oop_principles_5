package recap.abstraction;

public abstract class AbstractParent {
    {
        System.out.println("Non static code block");
    }
    static {
        System.out.println("Static code block");
    }

    public AbstractParent(int var1, String var2, boolean var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int var1;
    public int var4;
    public String var2;
    public boolean var3;

    public abstract int getSumOfVar1And4();

    // create an abstract method which will get the first three characters of the var2
    // and implement it in the child class
    public abstract String getFirstThreeCharsOfVar2();

    @Override
    public String toString() {
        return  "AbstractParent{" +
                "var1=" + var1 +
                ", var4=" + var4 +
                ", var2='" + var2 + '\'' +
                ", var3=" + var3 +
                '}';
    }
}