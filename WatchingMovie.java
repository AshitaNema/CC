public class MyClass {
    
        public static int solve(int N, int K, int heights[]) 
    { 
        // code here
        int count = 0;
        /*
        Stack<Integer> stack = new Stack<>();
        
        for(int value:heights) {
            while(!stack.isEmpty() && stack.peek() < value) {
                stack.pop();
            }
            stack.push(value);
        }
        while (!stack.isEmpty()) {
            
            count = count +1;
        }*/
            
        int flag;
        
        for (int i=0; i<N; i++){
            flag=0;
            System.out.println(i);
            for (int j=i+1; j<i+K+1 && j<N; j++){
                if(heights[i]<heights[j]){
                   flag=1; 
                   break;
                }
            }
            if(flag==0){
                
                System.out.println(heights[i]);
                count++;
            }
        }
        
            
        
        return count;
    }
    public static void main(String args[]) {
      
      
      int arr[]= {4, 3, 1 , 2};

      System.out.println("count  " + solve(4, 1 ,arr ));
    }
}
