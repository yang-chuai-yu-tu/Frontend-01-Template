# 每周总结可以写在这里

递归经常用在遍历二叉树的时候
由递归改迭代就是自己确定遍历的顺序，可通过栈和队列实现
堆经常用在求前k个符合要求的值上
PriorityQueue可以自定义Comparator
compare函数中return o1-o2 是升序，PriorityQueue变小根堆
ArrayList的add是没有返回值的
Arrays.sort()也是没有返回值的
ArrayList<List<String>>(map.values())可以返回包含hashmap的value的list
ArrayList中，有一个构造函数

public ArrayList(Collection<? extends E> c) {
    elementData = c.toArray();
    size = elementData.length;
    // c.toArray might (incorrectly) not return Object[] (see 6260652)
    if (elementData.getClass() != Object[].class)
        elementData = Arrays.copyOf(elementData, size, Object[].class);
}

可以接受一个集合类型的参数，然后返回一个list；这样就达到了预期目的
