public class Task9 {
    public static void main(String[] args) {
        Star sta = new Star();
        sta.shine();
        System.out.println("=====================");
        Universe u = new Sun();
        u.doAnything();
        Star s = (Star)u;
        s.shine();
    }
}
    interface Universe {
        public abstract void doAnything();
    }

    class Star {
        public void shine() {
            System.out.println("star:星星一闪一闪亮晶晶");
        }
    }

    class Sun extends Star implements Universe {
        @Override
        public void doAnything() {
            System.out.println("sun:太阳吸引着9大行星旋转");
        }
        @Override
        public void shine()
        {
            System.out.println("sun:光照八分钟，到达地球");
        }
    }