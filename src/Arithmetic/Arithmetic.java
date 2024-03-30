package Arithmetic;

import java.util.InputMismatchException;


public class Arithmetic <T1, T2> {
        private T1 num1;
        private T2 num2;

        public Arithmetic(T1 num1, T2 num2) {
            if(num1 instanceof Number && num2 instanceof Number) {
                this.num1 = num1;
                this.num2 = num2;
            } else {
                throw new InputMismatchException("Input is invalid");
            }
        }

        public Number add() {
            return ((Number) num1).doubleValue() + ((Number) num2).doubleValue();

        }
        public Number subtract(){
            return ((Number) num1).doubleValue() - ((Number) num2).doubleValue();
        }
        public Number multiply(){
            return ((Number) num1).doubleValue() * ((Number) num2).doubleValue();
        }
        public Number divide(){
            if (((Number) num2).intValue() == 0){
                throw new ArithmeticException("Cannot be divide by zero");
            }
            return ((Number) num1).doubleValue() / ((Number) num2).doubleValue();
        }
        public Number getMin(){
            return (Number) Math.min(((Number)num1).intValue(),((Number)num2).intValue());
        }
        public Number getMax(){
            return (Number) Math.max(((Number)num1).intValue(),((Number)num2).intValue());
        }
    }
