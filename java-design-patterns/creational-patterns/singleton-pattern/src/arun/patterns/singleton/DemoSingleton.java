package arun.patterns.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable{

	private static final long serialVersionUID = 1L;
	 
	 // private constructor
    private DemoSingleton() {
       
    }
 
    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();
    }
 
    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }
 
    protected Object readResolve() {
        return getInstance();
    }
    
    private int i = 10;
    
    public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
}

