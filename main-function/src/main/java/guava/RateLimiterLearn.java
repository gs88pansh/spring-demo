package guava;

import com.google.common.util.concurrent.RateLimiter;

/**
 * 本地限流代码学习
 * 每秒创建一个令牌，取两个，需要等待两秒
 */
public class RateLimiterLearn {
    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(1);
        for (int i=0;i<10;i++) {
            double wateTime = rateLimiter.acquire(2);
            System.out.println("获得第 " + i + " 个令牌, 等待时间:" + wateTime + "ms");
        }
    }
}
