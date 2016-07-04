# UseGenerics
Learn to use Generics.
note
a.使用泛型时如果不指明参数类型，即泛型类没有参数化，会提示警告，此时类型为Object。
b.在使用泛型前，存入集合中的元素可以是任何类型的，当从集合中取出时，所有的元素都是Object类型，需要进行向下的强制类型转换，转换到特定的类型。
c.泛型的思想就是由程序员指定类型，这样集合就只能容纳该类型的元素。

1、泛型的类型参数只能是类类型（包括自定义类），不能是简单类型。
2、同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。
3、泛型的类型参数可以有多个。
4、泛型的参数类型可以使用extends语句，例如<T extends superclass>。习惯上称为“有界类型”。
5、泛型的参数类型还可以是通配符类型。例如Class<?> classType = Class.forName("java.lang.String");
泛型还有接口、方法等等.

泛型高级应用
1、<T extends Collection>这里的限定使用关键字extends，后面可以是类也可以是接口。但这里的extends已经不是继承的含义了，应该理解为T类型是实现Collection接口的类型，或者T是继承了XX类的类型。
例：Info<? extends Number>   受限通配符，只能接受Number或者Number的子类
Info<? super String>   只能接受String和Object

com.ljheee.generics.info包中有例子。

2、一个重要的例子：com.ljheee.generics.pair中，用泛型实现任意类型的数组 --求最大最小值，返回一对。


