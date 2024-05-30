public class Exercise1 {
    public static void main(String[] args) {
    }
         
    public int mystery(int a, int b) {
        // Base case: if b is 1, return a
        if (b == 1) {
            return a;
        } else {
            // Recursive case: return a + the result of mystery(a, b-1)
            return a + mystery(a, b - 1);
        }
    }
    }
    
/*The function mystery(a, b) calculates a * b using addition and recursion. If b is 1, it returns a. 
If b is not 1, it returns a plus the result of calling itself with a and b - 1. */
    

