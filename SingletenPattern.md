#单例模式(Singleton Pattern)
##一、设计模式（Design Pattern）
###1. 定义
是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。（建房子的例子）
###2. 使用目的
- 可重用代码；
- 使代码更易被别人理解；
- 保证代码可靠性。
###3. 设计模式种类
基本模式有23种：
- 单例模式
- 抽象工厂模式
- 建造者模式
- 工厂模式
- 原型模式
- .......
##二、单例模式
> 配置文件、工具类、线程池、缓存、日志对象等，这些对象只需要一个，穿件多个实例就会导致占用过多资源、结果不一致等问题。
###1. 饿汉模式
> 将类的唯一实例设置为静态的，在类加载时就会实例出一个对象。
####1. 将构造方法私有化
> 不允许外部直接创建对象
``` java
	private Singleton_hungry(){	}
```
####2. 在类的内部创建唯一*私有的静态*实例
> 使用private、static修饰
``` java
	private static Singleton_hungry singleton_hungry = new Singleton_hungry();
```
####3. 提供一个人用于获取实例的get()方法
> 使用public、static修饰
``` java
	public static Singleton_hungry getSingleton_hungry() {
		return singleton_hungry;
	}
```
####4. 外部类创建实例
``` java
	Singleton_hungry sh = Singleton_hungry.getSingleton_hungry();
```

###2. 懒汉模式
####1. 将构造方法私有化
>不允许外部直接创建对象
``` java
	private Singleton_lazy() { }
```
####2. 在类的内部声明唯一*私有的静态*实例
> 使用private、static修饰，只声明不实例化！
``` java
	private static Singleton_lazy singleton_lazy;
```
####3. 提供一个人用于获取实例的get()方法
> 使用public、static修饰，再此方法中判断并创建实例
``` java
	public static Singleton_lazy getSingleton_lazy() {
		if(singleton_lazy == null){
			singleton_lazy = new Singleton_lazy();
		}
		return singleton_lazy;
	}
```
####4. 外部类创建实例
``` java
	Singleton_lazy sl = Singleton_lazy.getSingleton_lazy();
```

###3. 懒汉模式 vs. 饿汉模式
| 名称     | 优点                     |  缺点           |线程安全  |
|:---------|:------------------------|:---------------|:--------|
|饿汉模式   | 运行时获取对象的速度比较快  | 加载类时比较慢    |安全     |
|懒汉模式   | 加载类时比较快            | 运行时获取对象的速度比较慢|不安全|
