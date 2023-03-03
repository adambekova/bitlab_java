package Lambda;

import Interface.Staff;

public interface Operator {
    int toOperate(int a, int b);
}

class SumOperation {
    Operator operator = (a, b) -> a + b;

    int getSum(int a, int b) {
        return operator.toOperate(a, b);
    }
}

class MultiOperation{
    Operator operator =(a,b)->a*b;

    int getMultiplication (int a, int b){
        return operator.toOperate(a,b);
    }
}