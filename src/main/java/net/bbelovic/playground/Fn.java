package net.bbelovic.playground;

public interface Fn<I, O> {
    O apply(I input);
}
