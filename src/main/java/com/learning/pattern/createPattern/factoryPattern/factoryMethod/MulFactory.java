package com.learning.pattern.createPattern.factoryPattern.factoryMethod;

import com.learning.pattern.factoryPattern.factoryMethod.IFactory;
import com.learning.pattern.factoryPattern.simple.Operation;
import com.learning.pattern.factoryPattern.simple.OperationDiv;
import com.learning.pattern.factoryPattern.simple.OperationMul;

public class MulFactory implements IFactory {

    @Override
    public Operation CreateOption() {
        return new OperationMul();
    }

}