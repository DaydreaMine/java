package Fifth_Week.Monday;

/*
1.jdk 动态代理和 cglib 动态代理的不同
        （1）Proxy只能对interface进行代理，无法实现对class的动态代理。
         因为他们已经有一个固定的父类叫做Proxy，Java语法限定其不能再继承其他的父类
        （2）CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法

2.创建线程的两种方式分别是什么？各有什么优缺点？
方式1：继承Java.lang.Thread类，并覆盖run() 方法。
     优势：编写简单；
     劣势：单继承的限制----无法继承其它父类，同时不能实现资源共享。
方式2：实现Java.lang.Runnable接口，并实现run()方法。
     优势：可继承其它类，多线程可共享同一个Thread对象；
     劣势：编程方式稍微复杂，如需访问当前线程，需调用Thread.currentThread()方法

3.请你简述sleep( )和wait( )有什么区别？
sleep( )属于Thread类中的导致了程序暂停执行指定的时间，让出该其他线程，
但是他的监控状态依然保持，当指定的时间到了又会自动恢复运行状态。sleep()方法的过程中，线程不会释放对象锁

wait()方法的时候，线程会放弃对象锁，进入等待此对象的等待锁定池，只有针对此对象调用notify()方法后本线程才进入对象锁定池准备
获取对象锁进入运行状态。

4.Java中实现线程通信的三个方法及其作用？
wait()和 notify(),jion()

5.现在有线程 T1、T2 和 T3。你如何确保 T2 线程在 T1 之后执行，并且 T3 线程在 T2 之后执行？
用Thread 类的 join 方法实现

6.Java 中新的 Lock 接口相对于同步代码块（synchronized block）有什么优势？如果让你实现一个高性能缓存，支持并发读取和单一写入，你如何保证数据完整性。
它为读和写提供两个单独的锁，可以让你构建高性能数据结构，比如 ConcurrentHashMap 和条件阻塞。
大数据量储存用lock，

7.Java 中 wait 和 sleep 方法有什么区别？
两者主要的区别就是等待释放锁。sleep方法在等待时不会释放任何锁。wait 方法多用于线程间通信，而 sleep 只是在执行时暂停。

8.如何在 Java 中编写代码解决生产者消费者问题
通过定义一个flag进行判断，若flag为true则生产并且将flag改为false，若flag为false则消费者运行，并将flag改为true，以此来实现线程运行

9.写一段死锁代码。你在 Java 中如何解决死锁？

10。什么是原子操作？Java 中有哪些原子操作
原子操作是指一个不受其他操作影响的操作任务单元。原子操作是在多线程环境下避免数据不一致必须的手段。int++并不是一个原子操作，所以当一个线程读取它的值并加1时，另外一个线程有可能会读到之前的值，这就会引发错误。
原子类：AtomicBoolean，AtomicInteger，AtomicLong，AtomicReference

11。.既然 start() 方法会调用 run() 方法，为什么我们调用 start() 方法，而不直接调用 run() 方法
当你调用 start() 方法时，它会新建一个线程然后执行 run() 方法中的代码。如果直接调用 run() 方法，并不会创建新线程，方法中的代码会在当前调用者的线程中执行

1.分别写出一个静态代理和动态代理案例,并且对比一下两者的不同


2.写出恶汉模式，懒汉模式，线程安全的懒汉模式

3.写出二分查找以及快速排序的算法,并且用自己的话总结其原理

4.写出选择排序以及原理

5.Java中List<?>和List之间的区别是什么？ava中List和原始类型List之间的区别？

6.Java中synchronized 和 ReentrantLock 有什么不同？

7.并发编程的三要素
原子性 可见性 有序性

8.CyclicBarrier和CountDownLatch的区别，CountDownLatch这个已经上过，要求自己学习CyclicBarrier并且写出代码

9.ThreadLocal学习以及案例上传

10.ConcurrentHashMap和Hashtable的区别？
Hashtable：底层数组+链表实现，无论key还是value都不能为null，线程安全，实现线程安全的方式是在修改数据时锁住整个HashTable，效率低，ConcurrentHashMap做了相关优化
ConcurrentHashMap：底层采用分段的数组+链表实现，线程安全


*/
