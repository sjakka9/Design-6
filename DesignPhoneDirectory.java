import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class PhoneDirectory {
    private Queue<Integer> q;
    private HashSet<Integer> set;

    public PhoneDirectory(int maxNumbers) {
        this.q = new LinkedList<>();
        this.set = new HashSet<>();

        for(int i=0; i< maxNumbers; i++)
        {
            q.add(i);
            set.add(i);
        }
        
    }
    
    public int get() {
        if(set.isEmpty())
        {
            return -1;
        }
        int re = q.poll();
        set.remove(re);
        return re;
    }
    
    public boolean check(int number) {
        return set.contains(number);
    }
    
    public void release(int number) 
    {
        if(!set.contains(number))
        {
            set.add(number);
            q.add(number);
        }    
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */