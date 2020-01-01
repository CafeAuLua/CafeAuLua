package org.cafeaulua.cal.vm;

public interface Interpreter {
    void loadByteCode();
    int run();
}
